package team.simpleVirtualWallet.beWallet.beWalletService.service;

import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;


public interface WalletService {

    int addWallet(Wallet wallet);

    Optional<Wallet> getWallet(Integer id);

    Optional<Wallet> getWallet(Integer id, LockModeType mode);

    Optional<Wallet> getWallet(Integer userId, String currency);

    List<Wallet> getWallets(Integer userId);

}
