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
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;

import static javax.persistence.TemporalType.TIMESTAMP;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "account is null.")
    @Min(value = 1, message = "userId cannot lower than 1")
    private int userId;

    @NotNull(message = "amount is null.")
    @Digits(integer=19, fraction=4)
    private BigDecimal amount = new BigDecimal("0.0");

    @NotNull(message = "currency is null.")
    @NotBlank(message = "currency is blank.")
    @NotEmpty(message = "currency is empty.")
    private String currency;

    @CreatedDate
//    @DateTimeFormat
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @LastModifiedDate
//    @DateTimeFormat
    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp deletedAt;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "wallet")
    @EqualsAndHashCode.Exclude
    private Set<TransactionRecord> transactionRecords;

}
