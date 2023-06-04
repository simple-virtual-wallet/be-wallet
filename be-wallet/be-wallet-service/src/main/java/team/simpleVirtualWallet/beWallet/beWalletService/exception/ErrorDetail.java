package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail {

    private String errorCode;
    private Timestamp timeStamp;
    private String message;
    private HttpStatus httpStatus;
    private String domain;
    private String details;
}
