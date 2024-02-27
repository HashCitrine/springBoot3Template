package com.example.template.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ResponseException extends RuntimeException {

  private HttpStatus status;

  public ResponseException(HttpStatus status, String message) {
    super(message);
    this.status = status;
  }
}
