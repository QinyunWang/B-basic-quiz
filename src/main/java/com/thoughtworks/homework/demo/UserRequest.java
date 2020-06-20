package com.thoughtworks.homework.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@Data
public class UserRequest {
    private String name;

    private Long age;

    private String avatar;

    private String description;

    @JsonIgnore
    private AtomicLong idGenerator;

    @Autowired
    public void setIdGenerator(AtomicLong idGenerator) {
        this.idGenerator = idGenerator;
    }

    public User toUser() {
        return User.builder()
                .id(idGenerator.incrementAndGet())
                .name(name)
                .age(age)
                .avatar(avatar)
                .description(description)
                .build();
    }
}
