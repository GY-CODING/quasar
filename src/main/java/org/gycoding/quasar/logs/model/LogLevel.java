package org.gycoding.quasar.logs.model;

public enum LogLevel {
    INFO, DEBUG, WARN, ERROR;

    public static LogLevel fromString(String levelString) {
        for (LogLevel level : LogLevel.values()) {
            if (level.name().equalsIgnoreCase(levelString)) {
                return level;
            }
        }

        return INFO;
    }
}
