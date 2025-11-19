package org.gycoding.quasar.exception.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ConfigException extends QuasarException {
    public ConfigException(String code, int status) {
        super(code, status);
    }

    public ConfigException(ExceptionError error) {
        super(error);
    }

    public ConfigException(String code, String message, HttpStatus status) {
        super(code, message, status);
    }

    public ConfigException(String code, String message, int status) {
        super(code, message, status);
    }
}
