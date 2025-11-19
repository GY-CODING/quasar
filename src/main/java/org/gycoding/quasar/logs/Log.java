package org.gycoding.quasar.logs;

import lombok.Builder;

@Builder
record Log(
        LogEnv env,
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