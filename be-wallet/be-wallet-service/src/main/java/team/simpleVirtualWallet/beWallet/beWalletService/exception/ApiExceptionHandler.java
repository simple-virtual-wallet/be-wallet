package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetail> methodArgumentNotValidException(MethodArgumentNotValidException e,WebRequest req) {

        ErrorDetail err = new ErrorDetail(
                "ERR002",
                new Timestamp(System.currentTimeMillis()),
                "Validation Error",
                HttpStatus.BAD_REQUEST,
                "",
                e.getBindingResult().getFieldError().getDefaultMessage()) ;

        return new ResponseEntity<ErrorDetail>(err,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorDetail> dataIntegrityViolationException(DataIntegrityViolationException e, WebRequest req) {

        ErrorDetail err = new ErrorDetail(
                "ERR001",
                new Timestamp(System.currentTimeMillis()),
                "SQL Error",
                HttpStatus.BAD_REQUEST,
                "",
                e.getMessage()) ;

        return new ResponseEntity<ErrorDetail>(err,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WalletException.class)
    public ResponseEntity<ErrorDetail> walletException(WalletException e, WebRequest req) {

        ErrorDetail err = new ErrorDetail(
                "ERR006",
                e.getTimestamp(),
                "Unknown Wallet Error",
                HttpStatus.BAD_REQUEST,
                e.getDomain(),
                e.getMessage()) ;
        switch(e.getType()){
            case NoSuchUser:
                err = new ErrorDetail(
                        "ERR005",
                        e.getTimestamp(),
                        e.getMessage(),
                        HttpStatus.BAD_REQUEST,
                        e.getDomain(),
                        e.getMessage());
                break;
            case NoSuchWallet:
                err = new ErrorDetail(
                        "ERR003",
                        e.getTimestamp(),
                        e.getMessage(),
                        HttpStatus.BAD_REQUEST,
                        e.getDomain(),
                        e.getMessage());
                break;
            case WrongCurrencyFromWallet:
                err = new ErrorDetail(
                        "ERR004",
                        e.getTimestamp(),
                        e.getMessage(),
                        HttpStatus.BAD_REQUEST,
                        e.getDomain(),
                        e.getMessage());
                break;
        }

        return new ResponseEntity<ErrorDetail>(err, HttpStatus.BAD_REQUEST);
    }
}
