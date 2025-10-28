package org.gycoding.quasar.annotations;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@SpringBootConfiguration
@EnableAutoConfiguration
@EnableFeignClients
@EnableMongoRepositories
@ComponentScan(basePackages = {"org.gycoding"})
public @interface QuasarApplication { }