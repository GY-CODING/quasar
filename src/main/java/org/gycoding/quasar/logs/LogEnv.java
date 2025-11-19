package org.gycoding.quasar.logs;

enum LogEnv {
    LOCAL, DEV, PRO;

    static LogEnv fromString(String levelString) {
        for (LogEnv level : LogEnv.values()) {
            if (level.name().equalsIgnoreCase(levelString)) {
                return level;
            }
        }

        return LOCAL;
    }
}
