package org.gycoding.quasar.logs;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Logger {
    @Value("${spring.profiles.active}")
    private String initialProfile;

    @Value("${quasar.logs.token}")
    private String initialToken;

    @Value("${quasar.logs.level:#{null}}")
    private String initialLevel;

    private final LogsFeignFacade logsFacadeInstance;
    private static LogsFeignFacade logsFacade;

    private static String profile;
    private static String token;
    private static LogLevel level;

    public Logger(LogsFeignFacade logsFeignFacadeInstance) {
        this.logsFacadeInstance = logsFeignFacadeInstance;
    }

    @PostConstruct
    public void init() {
        profile = this.initialProfile;
        token = this.initialToken;
        level = LogLevel.fromString(this.initialLevel != null ? this.initialLevel : "INFO");

        logsFacade = this.logsFacadeInstance;
    }

    public static void log(String message) {
        switch(level) {
            case DEBUG -> debug(message);
            case WARN -> warn(message);
            case ERROR -> error(message);
            default -> info(message);
        }
    }

    public static void log(String message, Object data) {
        switch(level) {
            case DEBUG -> debug(message, data);
            case WARN -> warn(message, data);
            case ERROR -> error(message, data);
            default -> info(message, data);
        }
    }

    public static void info(String message) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.INFO)
                .message(message)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }


    public static void info(String message, Object data) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.INFO)
                .message(message)
                .data(data)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void debug(String message) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.DEBUG)
                .message(message)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void debug(String message, Object data) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.DEBUG)
                .message(message)
                .data(data)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void warn(String message) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.WARN)
                .message(message)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void warn(String message, Object data) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.WARN)
                .message(message)
                .data(data)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void error(String message) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.ERROR)
                .message(message)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }

    public static void error(String message, Object data) {
        final var body = Log.builder()
                .env(LogEnv.fromString(profile))
                .level(LogLevel.ERROR)
                .message(message)
                .data(data)
                .build();

        log.info(body.toString());

        logsFacade.log(token, body);
    }
}
