package team.simpleVirtualWallet.beWallet.beWalletService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import team.simpleVirtualWallet.beWallet. beWalletService.model.Wallet;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

@Repository
public interface WalletDao extends JpaRepository<Wallet, Integer> {


    Optional<Wallet> findById(Integer id);

//    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query(value = """
        SELECT *
        FROM wallet w
        WHERE id = :id
        FOR UPDATE
        """, nativeQuery = true)
    Optional<Wallet> findByIdForUpdate(@Param("id") Integer id);

//    @Lock(LockModeType.PESSIMISTIC_READ)
    @Query(value = """
        SELECT *
        FROM wallet w
        WHERE id = :id
        FOR SHARE
        """, nativeQuery = true)
    Optional<Wallet> findByIdForShare(@Param("id") Integer id);

    Optional<Wallet> findByUserIdAndCurrency(Integer userId, String currency);

    List<Wallet> findAllByUserId(Integer userId);

}