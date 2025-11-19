package org.gycoding.quasar.exception.model;

import org.springframework.http.HttpStatus;

public interface ExceptionError {
    String getCode();
    String getMessage();
    HttpStatus getStatus();
}
