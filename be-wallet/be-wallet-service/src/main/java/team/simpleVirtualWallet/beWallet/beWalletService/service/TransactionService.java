package team.simpleVirtualWallet.beWallet.beWalletService.service;

import team.simpleVirtualWallet.beWallet.beWalletService.exception.WalletException;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionRecord;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface TransactionService {

    Optional<TransactionRecord> processTransaction(
            int walletId,
            int action,
            BigDecimal amount,
            String currency,
            int committerId,
            String remark) throws WalletException;

    Optional<TransactionRecord> getTransactionRecord(int id);

    List<TransactionRecord> getTransactionRecords(int userId, String currency);
}
