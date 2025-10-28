package org.gycoding.quasar.exceptions.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class FeignFacadeException extends QuasarException {
    public FeignFacadeException(String code, int status) {
        super(code, status);
    }

    public FeignFacadeException(ExceptionError error) {
        super(error);
    }

    public FeignFacadeException(String code, String message, HttpStatus status) {
        super(code, message, status);
    }

    public FeignFacadeException(String code, String message, int status) {
        super(code, message, status);
    }
}
