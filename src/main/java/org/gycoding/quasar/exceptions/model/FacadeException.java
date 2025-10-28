package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class FacadeException extends QuasarException {
    public FacadeException(String code, int status) {
        super(code, status);
    }

    public FacadeException(ExceptionError error) {
        super(error);
    }

    public FacadeException(String code, String message, HttpStatus status) {
        super(code, message, status);
    }

    public FacadeException(String code, String message, int status) {
        super(code, message, status);
    }
}
