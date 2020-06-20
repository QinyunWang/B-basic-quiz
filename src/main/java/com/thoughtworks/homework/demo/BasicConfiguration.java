package com.thoughtworks.homework.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;

@Configuration
public class BasicConfiguration {

    @Bean
    public AtomicLong createAtomicLong() {
        return new AtomicLong();
    }
}
