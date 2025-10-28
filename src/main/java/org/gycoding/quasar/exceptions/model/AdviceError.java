package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum AdviceError implements ExceptionError {
    VALIDATION_FAILED("Validation didn't pass successfully.", HttpStatus.BAD_REQUEST);

    private final String code;
    private final String message;
    private final HttpStatus status;

    AdviceError(String message, HttpStatus status) {
        this.code       = this.name();
        this.message    = message;
        this.status     = status;
    }
}
