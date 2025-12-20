package org.example.customer.Advice;

import org.example.customer.Api.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<?> ApiException(ApiException apiException){

        String message = apiException.getMessage();

        return ResponseEntity.status(400).body(message) ;

    }

}
