package org.gycoding.quasar.exceptions.model;

import org.springframework.http.HttpStatus;

public interface ExceptionError {
    String getCode();
    String getMessage();
    HttpStatus getStatus();
}
