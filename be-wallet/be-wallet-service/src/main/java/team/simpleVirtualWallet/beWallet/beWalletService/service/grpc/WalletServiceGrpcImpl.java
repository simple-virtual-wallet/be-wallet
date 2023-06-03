package team.simpleVirtualWallet.beWallet.beWalletService.service.grpc;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;
import team.simpleVirtualWallet.beWallet.beWalletService.service.WalletService;

//https://yidongnan.github.io/grpc-spring-boot-starter/zh-CN/server/getting-started.html
@GrpcService
@Slf4j
public class WalletServiceGrpcImpl extends WalletServiceGrpc.WalletServiceImplBase {

    @Autowired
    private WalletService walletService;

}



