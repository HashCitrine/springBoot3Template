package com.example.template.exception;

import com.example.template.dto.res.ResMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ResponseException.class)
  ResponseEntity<ResMessage> customExceptionHandler(ResponseException e) {
    return ResponseEntity.status(e.getStatus()).body(new ResMessage(e.getMessage()));
  }

}
