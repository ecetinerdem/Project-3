package com.workintech.s19d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@ControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler
    ResponseEntity<AccountErrorResponse> handleException(AccountException accountException) {
        log.error("An Account error has occurred ", accountException);
        AccountErrorResponse accountErrorResponse = new AccountErrorResponse(accountException.getHttpStatus().value(), accountException.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(accountErrorResponse,accountException.getHttpStatus());
    }

    @ExceptionHandler
    ResponseEntity<MemberErrorResponse> handleException(MemberException memberException) {
        log.error("A Member error has occurred ", memberException);
        MemberErrorResponse memberErrorResponse = new MemberErrorResponse(memberException.getHttpStatus().value(), memberException.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(memberErrorResponse, memberException.getHttpStatus());
    }
}
