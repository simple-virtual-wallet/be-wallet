package team.simpleVirtualWallet.beWallet.beWalletService.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="wallet_id")
    @EqualsAndHashCode.Exclude
    private Wallet wallet;

    @Column(name="wallet_id", insertable = false, updatable = false)
    private int walletId;

    @Convert(converter = TransactionAction.Converter.class)
    private TransactionAction action;

    private BigDecimal amount;

    private BigDecimal beforeAmount;

    private BigDecimal afterAmount;

    @NotNull(message = "currency is null.")
    @NotBlank(message = "currency is blank.")
    @NotEmpty(message = "currency is empty.")
    private String currency;

    private int committerId;

    @Convert(converter = TransactionStatus.Converter.class)
    private TransactionStatus status;

    private String remark;

    @CreationTimestamp
//    @DateTimeFormat
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
//    @DateTimeFormat
    @LastModifiedDate
    private Timestamp updatedAt;

    private BigDecimal rollbackBeforeAmount;

    private BigDecimal rollbackAfterAmount;

    private Integer rollbackerId;

}
