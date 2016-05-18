package io.dstore.engine;

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
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: dstore/engine/engine.proto")
public class EngineGrpc {

  private EngineGrpc() {}

  public static final String SERVICE_NAME = "dstore.engine.Engine";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.engine.Procedure.Call,
      io.dstore.engine.Procedure.Response> METHOD_EXEC_PROCEDURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.engine.Engine", "execProcedure"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Call.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.engine.Procedure.Call,
      io.dstore.engine.Procedure.Response> METHOD_EXEC_BATCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "dstore.engine.Engine", "execBatch"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Call.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.Values.stringValue,
      io.dstore.Values.stringValue> METHOD_CREATE_UNIQUE_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "dstore.engine.Engine", "createUniqueID"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.Values.stringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.Values.stringValue.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.Values.stringValue,
      io.dstore.Values.booleanValue> METHOD_IS_VALID_UNIQUE_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "dstore.engine.Engine", "isValidUniqueID"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.Values.stringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.Values.booleanValue.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineStub newStub(io.grpc.Channel channel) {
    return new EngineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EngineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static EngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EngineFutureStub(channel);
  }

  /**
   */
  public static interface Engine {

    /**
     */
    public void execProcedure(io.dstore.engine.Procedure.Call request,
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Call> execBatch(
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver);

    /**
     */
    public void createUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.stringValue> responseObserver);

    /**
     */
    public void isValidUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.booleanValue> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractEngine implements Engine, io.grpc.BindableService {

    @java.lang.Override
    public void execProcedure(io.dstore.engine.Procedure.Call request,
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXEC_PROCEDURE, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Call> execBatch(
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_EXEC_BATCH, responseObserver);
    }

    @java.lang.Override
    public void createUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.stringValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_UNIQUE_ID, responseObserver);
    }

    @java.lang.Override
    public void isValidUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.booleanValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_VALID_UNIQUE_ID, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return EngineGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface EngineBlockingClient {

    /**
     */
    public java.util.Iterator<io.dstore.engine.Procedure.Response> execProcedure(
        io.dstore.engine.Procedure.Call request);

    /**
     */
    public io.dstore.Values.stringValue createUniqueID(io.dstore.Values.stringValue request);

    /**
     */
    public io.dstore.Values.booleanValue isValidUniqueID(io.dstore.Values.stringValue request);
  }

  /**
   */
  public static interface EngineFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.Values.stringValue> createUniqueID(
        io.dstore.Values.stringValue request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.Values.booleanValue> isValidUniqueID(
        io.dstore.Values.stringValue request);
  }

  public static class EngineStub extends io.grpc.stub.AbstractStub<EngineStub>
      implements Engine {
    private EngineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineStub(channel, callOptions);
    }

    @java.lang.Override
    public void execProcedure(io.dstore.engine.Procedure.Call request,
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXEC_PROCEDURE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Call> execBatch(
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_EXEC_BATCH, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void createUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.stringValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_UNIQUE_ID, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void isValidUniqueID(io.dstore.Values.stringValue request,
        io.grpc.stub.StreamObserver<io.dstore.Values.booleanValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_VALID_UNIQUE_ID, getCallOptions()), request, responseObserver);
    }
  }

  public static class EngineBlockingStub extends io.grpc.stub.AbstractStub<EngineBlockingStub>
      implements EngineBlockingClient {
    private EngineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<io.dstore.engine.Procedure.Response> execProcedure(
        io.dstore.engine.Procedure.Call request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXEC_PROCEDURE, getCallOptions(), request);
    }

    @java.lang.Override
    public io.dstore.Values.stringValue createUniqueID(io.dstore.Values.stringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_UNIQUE_ID, getCallOptions(), request);
    }

    @java.lang.Override
    public io.dstore.Values.booleanValue isValidUniqueID(io.dstore.Values.stringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_VALID_UNIQUE_ID, getCallOptions(), request);
    }
  }

  public static class EngineFutureStub extends io.grpc.stub.AbstractStub<EngineFutureStub>
      implements EngineFutureClient {
    private EngineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.Values.stringValue> createUniqueID(
        io.dstore.Values.stringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_UNIQUE_ID, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.Values.booleanValue> isValidUniqueID(
        io.dstore.Values.stringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_VALID_UNIQUE_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_EXEC_PROCEDURE = 0;
  private static final int METHODID_CREATE_UNIQUE_ID = 1;
  private static final int METHODID_IS_VALID_UNIQUE_ID = 2;
  private static final int METHODID_EXEC_BATCH = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Engine serviceImpl;
    private final int methodId;

    public MethodHandlers(Engine serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXEC_PROCEDURE:
          serviceImpl.execProcedure((io.dstore.engine.Procedure.Call) request,
              (io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response>) responseObserver);
          break;
        case METHODID_CREATE_UNIQUE_ID:
          serviceImpl.createUniqueID((io.dstore.Values.stringValue) request,
              (io.grpc.stub.StreamObserver<io.dstore.Values.stringValue>) responseObserver);
          break;
        case METHODID_IS_VALID_UNIQUE_ID:
          serviceImpl.isValidUniqueID((io.dstore.Values.stringValue) request,
              (io.grpc.stub.StreamObserver<io.dstore.Values.booleanValue>) responseObserver);
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
        case METHODID_EXEC_BATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.execBatch(
              (io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Engine serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_EXEC_PROCEDURE,
          asyncServerStreamingCall(
            new MethodHandlers<
              io.dstore.engine.Procedure.Call,
              io.dstore.engine.Procedure.Response>(
                serviceImpl, METHODID_EXEC_PROCEDURE)))
        .addMethod(
          METHOD_EXEC_BATCH,
          asyncBidiStreamingCall(
            new MethodHandlers<
              io.dstore.engine.Procedure.Call,
              io.dstore.engine.Procedure.Response>(
                serviceImpl, METHODID_EXEC_BATCH)))
        .addMethod(
          METHOD_CREATE_UNIQUE_ID,
          asyncUnaryCall(
            new MethodHandlers<
              io.dstore.Values.stringValue,
              io.dstore.Values.stringValue>(
                serviceImpl, METHODID_CREATE_UNIQUE_ID)))
        .addMethod(
          METHOD_IS_VALID_UNIQUE_ID,
          asyncUnaryCall(
            new MethodHandlers<
              io.dstore.Values.stringValue,
              io.dstore.Values.booleanValue>(
                serviceImpl, METHODID_IS_VALID_UNIQUE_ID)))
        .build();
  }
}
