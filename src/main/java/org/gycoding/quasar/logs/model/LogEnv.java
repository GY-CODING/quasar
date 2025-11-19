package org.gycoding.quasar.logs.model;

public enum LogEnv {
    LOCAL, DEV, PRO;

    public static LogEnv fromString(String levelString) {
        for (LogEnv level : LogEnv.values()) {
            if (level.name().equalsIgnoreCase(levelString)) {
                return level;
            }
        }

        return LOCAL;
    }
}
