package org.gycoding.quasar.exceptions.controller;

import org.gycoding.quasar.exceptions.model.ServiceException;
import org.gycoding.quasar.logs.service.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralAdvice {
    @Value("${quasar.exceptions.logs:true}")
    private boolean logsEnabled;

    @ExceptionHandler({ServiceException.class})
    public ResponseEntity<String> handleServiceExceptions(ServiceException ex) {
        if(logsEnabled) Logger.error(ex.getMessage(), ex);

        return new ResponseEntity<>(ex.toString(), HttpStatusCode.valueOf(ex.getStatus()));
    }
}
