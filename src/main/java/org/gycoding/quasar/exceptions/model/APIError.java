package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum APIError {
    SERVER_ERROR("An internal server error has occurred, sorry for the inconvenience.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String message;
    private final HttpStatus status;

    APIError(String message, HttpStatus status) {
        this.code       = this.name();
        this.message    = message;
        this.status     = status;
    }
}
