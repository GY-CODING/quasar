package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum QuasarError implements ExceptionError {
    VALIDATION_FAILED("Validation didn't pass successfully.", HttpStatus.BAD_REQUEST),
    FORBIDDEN("You don't have permission to access this resource.", HttpStatus.FORBIDDEN),;

    private final String code;
    private final String message;
    private final HttpStatus status;

    QuasarError(String message, HttpStatus status) {
        this.code       = this.name();
        this.message    = message;
        this.status     = status;
    }
}
