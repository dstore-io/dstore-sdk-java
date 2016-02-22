package io.dstore.elastic;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ElasticServiceGrpc {

  private ElasticServiceGrpc() {}

  public static final String SERVICE_NAME = "dstore.elastic.ElasticService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.item.FacetedNavigation.Request,
      io.dstore.elastic.item.FacetedNavigation.Response> METHOD_FACETED_NAVIGATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.elastic.ElasticService", "facetedNavigation"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.FacetedNavigation.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.FacetedNavigation.Response.getDefaultInstance()));

  public static ElasticServiceStub newStub(io.grpc.Channel channel) {
    return new ElasticServiceStub(channel);
  }

  public static ElasticServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ElasticServiceBlockingStub(channel);
  }

  public static ElasticServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ElasticServiceFutureStub(channel);
  }

  public static interface ElasticService {

    public void facetedNavigation(io.dstore.elastic.item.FacetedNavigation.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response> responseObserver);
  }

  public static interface ElasticServiceBlockingClient {

    public java.util.Iterator<io.dstore.elastic.item.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.item.FacetedNavigation.Request request);
  }

  public static interface ElasticServiceFutureClient {
  }

  public static class ElasticServiceStub extends io.grpc.stub.AbstractStub<ElasticServiceStub>
      implements ElasticService {
    private ElasticServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void facetedNavigation(io.dstore.elastic.item.FacetedNavigation.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FACETED_NAVIGATION, getCallOptions()), request, responseObserver);
    }
  }

  public static class ElasticServiceBlockingStub extends io.grpc.stub.AbstractStub<ElasticServiceBlockingStub>
      implements ElasticServiceBlockingClient {
    private ElasticServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<io.dstore.elastic.item.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.item.FacetedNavigation.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FACETED_NAVIGATION, getCallOptions(), request);
    }
  }

  public static class ElasticServiceFutureStub extends io.grpc.stub.AbstractStub<ElasticServiceFutureStub>
      implements ElasticServiceFutureClient {
    private ElasticServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FACETED_NAVIGATION = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ElasticService serviceImpl;
    private final int methodId;

    public MethodHandlers(ElasticService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FACETED_NAVIGATION:
          serviceImpl.facetedNavigation((io.dstore.elastic.item.FacetedNavigation.Request) request,
              (io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ElasticService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_FACETED_NAVIGATION,
          asyncServerStreamingCall(
            new MethodHandlers<
              io.dstore.elastic.item.FacetedNavigation.Request,
              io.dstore.elastic.item.FacetedNavigation.Response>(
                serviceImpl, METHODID_FACETED_NAVIGATION)))
        .build();
  }
}
