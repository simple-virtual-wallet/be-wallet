package team.simpleVirtualWallet.beWallet.beWalletService.service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.51.0)",
        comments = "Source: be-wallet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WalletServiceGrpc {

  private WalletServiceGrpc() {}

  public static final String SERVICE_NAME = "wallet.WalletService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> getCreateWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateWallet",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> getCreateWalletMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> getCreateWalletMethod;
    if ((getCreateWalletMethod = WalletServiceGrpc.getCreateWalletMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getCreateWalletMethod = WalletServiceGrpc.getCreateWalletMethod) == null) {
          WalletServiceGrpc.getCreateWalletMethod = getCreateWalletMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWallet"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("CreateWallet"))
                          .build();
        }
      }
    }
    return getCreateWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> getGetWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetWallets",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> getGetWalletsMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> getGetWalletsMethod;
    if ((getGetWalletsMethod = WalletServiceGrpc.getGetWalletsMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetWalletsMethod = WalletServiceGrpc.getGetWalletsMethod) == null) {
          WalletServiceGrpc.getGetWalletsMethod = getGetWalletsMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWallets"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("GetWallets"))
                          .build();
        }
      }
    }
    return getGetWalletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> getDeleteWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteWallet",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> getDeleteWalletMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> getDeleteWalletMethod;
    if ((getDeleteWalletMethod = WalletServiceGrpc.getDeleteWalletMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getDeleteWalletMethod = WalletServiceGrpc.getDeleteWalletMethod) == null) {
          WalletServiceGrpc.getDeleteWalletMethod = getDeleteWalletMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWallet"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("DeleteWallet"))
                          .build();
        }
      }
    }
    return getDeleteWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> getTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "Transaction",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> getTransactionMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> getTransactionMethod;
    if ((getTransactionMethod = WalletServiceGrpc.getTransactionMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getTransactionMethod = WalletServiceGrpc.getTransactionMethod) == null) {
          WalletServiceGrpc.getTransactionMethod = getTransactionMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("Transaction"))
                          .build();
        }
      }
    }
    return getTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> getRollbackTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "RollbackTransaction",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> getRollbackTransactionMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> getRollbackTransactionMethod;
    if ((getRollbackTransactionMethod = WalletServiceGrpc.getRollbackTransactionMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getRollbackTransactionMethod = WalletServiceGrpc.getRollbackTransactionMethod) == null) {
          WalletServiceGrpc.getRollbackTransactionMethod = getRollbackTransactionMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RollbackTransaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("RollbackTransaction"))
                          .build();
        }
      }
    }
    return getRollbackTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> getGetTransactionRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionRecord",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> getGetTransactionRecordMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> getGetTransactionRecordMethod;
    if ((getGetTransactionRecordMethod = WalletServiceGrpc.getGetTransactionRecordMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetTransactionRecordMethod = WalletServiceGrpc.getGetTransactionRecordMethod) == null) {
          WalletServiceGrpc.getGetTransactionRecordMethod = getGetTransactionRecordMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionRecord"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("GetTransactionRecord"))
                          .build();
        }
      }
    }
    return getGetTransactionRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> getGetTransactionRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionRecords",
          requestType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq.class,
          responseType = team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq,
          team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> getGetTransactionRecordsMethod() {
    io.grpc.MethodDescriptor<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> getGetTransactionRecordsMethod;
    if ((getGetTransactionRecordsMethod = WalletServiceGrpc.getGetTransactionRecordsMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetTransactionRecordsMethod = WalletServiceGrpc.getGetTransactionRecordsMethod) == null) {
          WalletServiceGrpc.getGetTransactionRecordsMethod = getGetTransactionRecordsMethod =
                  io.grpc.MethodDescriptor.<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq, team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionRecords"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("GetTransactionRecords"))
                          .build();
        }
      }
    }
    return getGetTransactionRecordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletServiceStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletServiceStub>() {
              @java.lang.Override
              public WalletServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletServiceStub(channel, callOptions);
              }
            };
    return WalletServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletServiceBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletServiceBlockingStub>() {
              @java.lang.Override
              public WalletServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletServiceBlockingStub(channel, callOptions);
              }
            };
    return WalletServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletServiceFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletServiceFutureStub>() {
              @java.lang.Override
              public WalletServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletServiceFutureStub(channel, callOptions);
              }
            };
    return WalletServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WalletServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq request,
                             io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWalletMethod(), responseObserver);
    }

    /**
     */
    public void getWallets(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq request,
                           io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWalletsMethod(), responseObserver);
    }

    /**
     */
    public void deleteWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq request,
                             io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWalletMethod(), responseObserver);
    }

    /**
     */
    public void transaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq request,
                            io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionMethod(), responseObserver);
    }

    /**
     */
    public void rollbackTransaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq request,
                                    io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRollbackTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionRecord(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq request,
                                     io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionRecordMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionRecords(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq request,
                                      io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getCreateWalletMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes>(
                                      this, METHODID_CREATE_WALLET)))
              .addMethod(
                      getGetWalletsMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes>(
                                      this, METHODID_GET_WALLETS)))
              .addMethod(
                      getDeleteWalletMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes>(
                                      this, METHODID_DELETE_WALLET)))
              .addMethod(
                      getTransactionMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes>(
                                      this, METHODID_TRANSACTION)))
              .addMethod(
                      getRollbackTransactionMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes>(
                                      this, METHODID_ROLLBACK_TRANSACTION)))
              .addMethod(
                      getGetTransactionRecordMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes>(
                                      this, METHODID_GET_TRANSACTION_RECORD)))
              .addMethod(
                      getGetTransactionRecordsMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq,
                                      team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes>(
                                      this, METHODID_GET_TRANSACTION_RECORDS)))
              .build();
    }
  }

  /**
   */
  public static final class WalletServiceStub extends io.grpc.stub.AbstractAsyncStub<WalletServiceStub> {
    private WalletServiceStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletServiceStub(channel, callOptions);
    }

    /**
     */
    public void createWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq request,
                             io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWallets(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq request,
                           io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetWalletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq request,
                             io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getDeleteWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq request,
                            io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rollbackTransaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq request,
                                    io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getRollbackTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionRecord(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq request,
                                     io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetTransactionRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionRecords(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq request,
                                      io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetTransactionRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WalletServiceBlockingStub> {
    private WalletServiceBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes createWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getCreateWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes getWallets(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetWalletsMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes deleteWallet(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getDeleteWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes transaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes rollbackTransaction(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getRollbackTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes getTransactionRecord(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetTransactionRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes getTransactionRecords(team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetTransactionRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WalletServiceFutureStub> {
    private WalletServiceFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes> createWallet(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes> getWallets(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetWalletsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes> deleteWallet(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getDeleteWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes> transaction(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes> rollbackTransaction(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getRollbackTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes> getTransactionRecord(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetTransactionRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes> getTransactionRecords(
            team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetTransactionRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WALLET = 0;
  private static final int METHODID_GET_WALLETS = 1;
  private static final int METHODID_DELETE_WALLET = 2;
  private static final int METHODID_TRANSACTION = 3;
  private static final int METHODID_ROLLBACK_TRANSACTION = 4;
  private static final int METHODID_GET_TRANSACTION_RECORD = 5;
  private static final int METHODID_GET_TRANSACTION_RECORDS = 6;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.CreateWalletRes>) responseObserver);
          break;
        case METHODID_GET_WALLETS:
          serviceImpl.getWallets((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetWalletsRes>) responseObserver);
          break;
        case METHODID_DELETE_WALLET:
          serviceImpl.deleteWallet((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.DeleteWalletRes>) responseObserver);
          break;
        case METHODID_TRANSACTION:
          serviceImpl.transaction((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.TransactionRes>) responseObserver);
          break;
        case METHODID_ROLLBACK_TRANSACTION:
          serviceImpl.rollbackTransaction((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.RollbackTransactionRes>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RECORD:
          serviceImpl.getTransactionRecord((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordRes>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RECORDS:
          serviceImpl.getTransactionRecords((team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsReq) request,
                  (io.grpc.stub.StreamObserver<team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.GetTransactionRecordsRes>) responseObserver);
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

  private static abstract class WalletServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletService");
    }
  }

  private static final class WalletServiceFileDescriptorSupplier
          extends WalletServiceBaseDescriptorSupplier {
    WalletServiceFileDescriptorSupplier() {}
  }

  private static final class WalletServiceMethodDescriptorSupplier
          extends WalletServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new WalletServiceFileDescriptorSupplier())
                  .addMethod(getCreateWalletMethod())
                  .addMethod(getGetWalletsMethod())
                  .addMethod(getDeleteWalletMethod())
                  .addMethod(getTransactionMethod())
                  .addMethod(getRollbackTransactionMethod())
                  .addMethod(getGetTransactionRecordMethod())
                  .addMethod(getGetTransactionRecordsMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
