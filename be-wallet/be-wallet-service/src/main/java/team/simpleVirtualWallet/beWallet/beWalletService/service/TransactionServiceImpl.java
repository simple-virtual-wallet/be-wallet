package team.simpleVirtualWallet.beWallet.beWalletService.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import team.simpleVirtualWallet.beWallet.beWalletService.dao.TransactionRecordDao;
import team.simpleVirtualWallet.beWallet.beWalletService.dao.WalletDao;
import team.simpleVirtualWallet.beWallet.beWalletService.exception.WalletException;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionAction;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionRecord;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionStatus;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;

import javax.persistence.LockModeType;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private WalletService walletService;

    @Autowired
    private TransactionRecordDao transactionRecordDao;

    @Autowired
    private WalletDao walletDao;

    @Override
    public Optional<TransactionRecord> processTransaction(
            int userId,
            int walletId,
            int action,
            BigDecimal amount,
            String currency,
            int committerId,
            String remark) throws WalletException {

        var wallet = walletService.getWallet(walletId, userId);
        if(wallet.isEmpty()) {
            log.error("processTransaction: no such wallet");
            throw new WalletException(WalletException.WalletExceptionType.NoSuchWallet, "processTransaction: no such wallet");
        }

        if(!wallet.get().getCurrency().equals(currency)) {
            log.error("processTransaction: wrong currency from wallet {} {}", currency, wallet.get().getCurrency());
            throw new WalletException(WalletException.WalletExceptionType.WrongCurrencyFromWallet, "processTransaction: wrong currency from wallet");
        }

        var record = TransactionRecord.builder().
                userId(userId).
                wallet(wallet.get()).
                action(TransactionAction.fromInteger(action)).
                amount(amount).
                currency(currency).
                committerId(committerId).
                status(TransactionStatus.Pending).
                remark(remark).
                build();

        record = saveTransactionRecord(record);

        record = updateWallet(record);

        return Optional.of(record);
    }

    @Transactional
    private TransactionRecord saveTransactionRecord(TransactionRecord record) {
        var walletForShare = walletService.getWallet(record.getWalletId(), LockModeType.PESSIMISTIC_READ);

        record.setBeforeAmount(walletForShare.get().getAmount());
        record.setAfterAmount(walletForShare.get().getAmount().add(record.getAmount()));

        return transactionRecordDao.save(record);
    }

    @Transactional
    private TransactionRecord updateWallet(TransactionRecord record) {
        var walletForUpdate = walletService.getWallet(record.getWalletId(), LockModeType.PESSIMISTIC_WRITE);

        if(record.getBeforeAmount() != walletForUpdate.get().getAmount()) {
            record.setCreatedAt(LocalDateTime.now());
            record.setBeforeAmount(walletForUpdate.get().getAmount());
            record.setAfterAmount(walletForUpdate.get().getAmount().add(record.getAmount()));
        }

        walletForUpdate.get().setAmount(record.getAfterAmount());
        walletDao.save(walletForUpdate.get());

        record.setStatus(TransactionStatus.Success);

        return transactionRecordDao.save(record);
    }

    @Override
    public Optional<TransactionRecord> getTransactionRecord(int id) {
        return transactionRecordDao.findById(id);
    }

    @Override
    public List<TransactionRecord> getTransactionRecords(int userId, String currency) {
        return transactionRecordDao.findAllByUserIdOrderByCreatedAtDesc(userId).stream().filter(e -> {
            return e.getCurrency().equals(currency);
        }).toList();
    }
}
