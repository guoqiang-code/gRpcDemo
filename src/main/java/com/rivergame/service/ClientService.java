package com.rivergame.service;

import com.rivergame.protobuf.HelloGrpc;
import com.rivergame.protobuf.HelloRequest;
import com.rivergame.protobuf.HelloResponse;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/1/31
 * @description：
 * @version: 1.0
 */
public class ClientService {
    public static void main(String[] args) throws Exception {
        ClientService clientService = new ClientService();
        //基于gRPC远程调用对应的方法
        clientService.remoteCall("wuyu");
    }

    /**
     * 基于gRPC框架的使用步骤，进行远程调用
     *
     * @param name
     */
    public void remoteCall(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloResponse response;
        try {
            // 基于访问地址 创建通道
            Channel channel = ManagedChannelBuilder.forAddress("localhost", 10001).usePlaintext().build();
            // 利用通道 创建一个桩（Stub）对象
            HelloGrpc.HelloBlockingStub blockingStub = HelloGrpc.newBlockingStub(channel);
            //通过桩对象来调用远程方法
            response = blockingStub.sayHello(request);
        } catch (Exception e) {
            System.out.println("client端远程调用sayHello()error " + e);
            return;
        }
        System.out.println("client端远程调用sayHello()的结果为：\n\n" + response.getMessage());
    }
}
