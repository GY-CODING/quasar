package org.gycoding.quasar.logs.model;

import lombok.Builder;

@Builder
public record Log(
        LogLevel level,
        String message,
        Object data
) {
    @Override
    public String toString() {
        return "{"
            + "\"level\":\"" + level.toString() + "\","
            + "\"message\":\"" + message + "\","
            + "\"data\":" + (data != null ? data.toString() : "null")
            + "}";
    }
}