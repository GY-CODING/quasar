package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceException extends QuasarException {
    public ServiceException(String code, int status) {
        super(code, status);
    }

    public ServiceException(ExceptionError error) {
        super(error);
    }

    public ServiceException(String code, String message, HttpStatus status) {
        super(code, message, status);
    }

    public ServiceException(String code, String message, int status) {
        super(code, message, status);
    }
}
