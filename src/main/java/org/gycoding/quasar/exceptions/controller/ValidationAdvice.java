package org.gycoding.quasar.exceptions.controller;

import org.gycoding.quasar.exceptions.model.QuasarException;
import org.gycoding.quasar.exceptions.model.QuasarError;
import org.gycoding.quasar.logs.service.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ValidationAdvice {
    @Value("${quasar.exceptions.logs:true}")
    private boolean logsEnabled;

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .toList();

        final var exception = new QuasarException(
                QuasarError.VALIDATION_FAILED.getCode(),
                String.join(", ", errors),
                QuasarError.VALIDATION_FAILED.getStatus().value()
        );

        if(logsEnabled) Logger.error(exception.getMessage(), exception);

        return new ResponseEntity<>(exception.toString(), HttpStatusCode.valueOf(exception.getStatus()));
    }
}
