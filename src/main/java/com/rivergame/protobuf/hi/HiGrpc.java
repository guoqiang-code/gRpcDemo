package com.rivergame.protobuf.hi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: rpcHi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HiGrpc {

  private HiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Hi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rivergame.protobuf.hi.HiRequest,
      com.rivergame.protobuf.hi.HiResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = com.rivergame.protobuf.hi.HiRequest.class,
      responseType = com.rivergame.protobuf.hi.HiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rivergame.protobuf.hi.HiRequest,
      com.rivergame.protobuf.hi.HiResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.rivergame.protobuf.hi.HiRequest, com.rivergame.protobuf.hi.HiResponse> getSayHelloMethod;
    if ((getSayHelloMethod = HiGrpc.getSayHelloMethod) == null) {
      synchronized (HiGrpc.class) {
        if ((getSayHelloMethod = HiGrpc.getSayHelloMethod) == null) {
          HiGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.rivergame.protobuf.hi.HiRequest, com.rivergame.protobuf.hi.HiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rivergame.protobuf.hi.HiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rivergame.protobuf.hi.HiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HiMethodDescriptorSupplier("sayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiStub>() {
        @java.lang.Override
        public HiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiStub(channel, callOptions);
        }
      };
    return HiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiBlockingStub>() {
        @java.lang.Override
        public HiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiBlockingStub(channel, callOptions);
        }
      };
    return HiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiFutureStub>() {
        @java.lang.Override
        public HiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiFutureStub(channel, callOptions);
        }
      };
    return HiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义服务
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.rivergame.protobuf.hi.HiRequest request,
        io.grpc.stub.StreamObserver<com.rivergame.protobuf.hi.HiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Hi.
   * <pre>
   * 定义服务
   * </pre>
   */
  public static abstract class HiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Hi.
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class HiStub
      extends io.grpc.stub.AbstractAsyncStub<HiStub> {
    private HiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.rivergame.protobuf.hi.HiRequest request,
        io.grpc.stub.StreamObserver<com.rivergame.protobuf.hi.HiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Hi.
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class HiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HiBlockingStub> {
    private HiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rivergame.protobuf.hi.HiResponse sayHello(com.rivergame.protobuf.hi.HiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Hi.
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class HiFutureStub
      extends io.grpc.stub.AbstractFutureStub<HiFutureStub> {
    private HiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rivergame.protobuf.hi.HiResponse> sayHello(
        com.rivergame.protobuf.hi.HiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.rivergame.protobuf.hi.HiRequest) request,
              (io.grpc.stub.StreamObserver<com.rivergame.protobuf.hi.HiResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.rivergame.protobuf.hi.HiRequest,
              com.rivergame.protobuf.hi.HiResponse>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class HiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rivergame.protobuf.hi.WuyuGRpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Hi");
    }
  }

  private static final class HiFileDescriptorSupplier
      extends HiBaseDescriptorSupplier {
    HiFileDescriptorSupplier() {}
  }

  private static final class HiMethodDescriptorSupplier
      extends HiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HiMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HiFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
