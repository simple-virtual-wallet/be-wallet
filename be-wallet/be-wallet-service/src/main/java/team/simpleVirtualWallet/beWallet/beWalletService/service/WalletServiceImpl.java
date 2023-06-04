package team.simpleVirtualWallet.beWallet.beWalletService.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.simpleVirtualWallet.beUser.service.grpc.UserGrpc;
import team.simpleVirtualWallet.beWallet.beWalletService.dao.WalletDao;
import team.simpleVirtualWallet.beWallet.beWalletService.exception.WalletException;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;
import team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.UserService;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class WalletServiceImpl implements WalletService {


    @Autowired
    private WalletDao walletDao;

    @Autowired
    private UserService userService;

    @Override
    public int addWallet(Wallet wallet)  {
        log.info("addWallet: {}", wallet);

        var getUserRes = userService.getUser(UserGrpc.GetUserReq.newBuilder()
                .setId(wallet.getUserId())
                .build());

        if(!getUserRes.hasUser()) {
            throw new WalletException(WalletException.WalletExceptionType.NoSuchUser, "addWallet: no such user");
        }

        return walletDao.save(wallet).getId();
    }

    @Override
    public Optional<Wallet> getWallet(Integer id){
        log.info("getWallet: {}", id);

        if(id != null) {
            return walletDao.findById(id);
        }

        return Optional.empty();
    }

    @Override
    public Optional<Wallet> getWallet(Integer id, LockModeType mode){
        log.info("getWallet: {} {}", id, mode);

        if(id != null) {
            if(mode.equals(LockModeType.PESSIMISTIC_WRITE)) {
                return walletDao.findByIdForUpdate(id);
            }
            if(mode.equals(LockModeType.PESSIMISTIC_READ)) {
                return walletDao.findByIdForShare(id);
            }
            return walletDao.findById(id);
        }

        return Optional.empty();
    }

    @Override
    public Optional<Wallet> getWallet(Integer userId, String currency){
        log.info("getWallet: {} {}", userId, currency);

        if(userId != null && currency != null) {
            return walletDao.findByUserIdAndCurrency(userId, currency);
        }

        return Optional.empty();
    }

    @Override
    public List<Wallet> getWallets(Integer userId) {
        log.info("getWallets: {}", userId);

        if(userId != null) {
            return walletDao.findAllByUserId(userId);
        }

        return null;
    }

}
