package com.rivergame.service;

import com.google.protobuf.ByteString;
import com.rivergame.protobuf.HelloGrpc;
import com.rivergame.protobuf.HelloRequest;
import com.rivergame.protobuf.HelloResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/1/31
 * @description：
 * @version: 1.0
 */
public class ServerService {
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        //指定grpc服务器端口、接口服务对象，启动grpc服务器
        Server server = ServerBuilder.forPort(10001).addService(new GreeterImpl())
                .build().start();
        System.out.println("service start...");
        //添加停机逻辑
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            server.shutdown();
            System.err.println("*** server shut down");
        }));

        // 等待
        if (server != null) {
            server.awaitTermination();
        }
        //也可以让进程等待
//        latch.await();
    }

    private static class GreeterImpl extends HelloGrpc.HelloImplBase {
        @Override
        public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
            String name = request.getName();
            System.out.println("service receive name:"+name);
            HelloResponse.Builder builder = HelloResponse.newBuilder();
            builder.setMessage("收到");
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }
    }
}
