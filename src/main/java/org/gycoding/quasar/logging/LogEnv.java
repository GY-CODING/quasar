package org.gycoding.quasar.logging;

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
