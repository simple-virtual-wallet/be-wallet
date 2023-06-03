package team.simpleVirtualWallet.beWallet.beWalletService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionRecord;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRecordDao extends JpaRepository<TransactionRecord, Integer> {

    Optional<TransactionRecord> findById(int id);

    List<TransactionRecord> findAllByUserIdOrderByCreatedAtDesc(int userId);

}
