package org.gycoding.quasar.logs;

enum LogLevel {
    INFO, DEBUG, WARN, ERROR;

    static LogLevel fromString(String levelString) {
        for (LogLevel level : LogLevel.values()) {
            if (level.name().equalsIgnoreCase(levelString)) {
                return level;
            }
        }

        return INFO;
    }
}
