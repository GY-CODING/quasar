package org.gycoding.quasar.exceptions.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class DatabaseException extends Exception {
    private final static String OWNER = "GYCODING";

    private String code;
    private int status;

    public DatabaseException(String code, int status) {
        super();
        this.code   = code;
        this.status = status;
    }

    public DatabaseException(APIError error) {
        super(error.getMessage());
        this.code   = error.getCode();
        this.status = error.getStatus().value();
    }

    public DatabaseException(String code, String message, HttpStatus status) {
        super(message);
        this.code   = code;
        this.status = status.value();
    }

    public DatabaseException(String code, String message, int status) {
        super(message);
        this.code   = code;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{"
            + "\"code\":\"" + code + "\","
            + "\"status\":" + status + ","
            + "\"owner\":\"" + OWNER + "\","
            + "\"message\":\"" + super.getMessage() + "\""
            + "}";
    }
}
