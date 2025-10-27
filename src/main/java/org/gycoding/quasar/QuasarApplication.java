package org.gycoding.quasar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"org.gycoding"})
public class QuasarApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuasarApplication.class, args);
    }
}
