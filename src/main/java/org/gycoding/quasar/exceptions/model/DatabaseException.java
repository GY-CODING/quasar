package org.gycoding.quasar.exceptions.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class DatabaseException extends QuasarException {
    public DatabaseException(String code, int status) {
        super(code, status);
    }

    public DatabaseException(ExceptionError error) {
        super(error);
    }

    public DatabaseException(String code, String message, HttpStatus status) {
        super(code, message, status);
    }

    public DatabaseException(String code, String message, int status) {
        super(code, message, status);
    }
}
