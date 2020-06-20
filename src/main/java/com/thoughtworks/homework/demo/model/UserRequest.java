package com.thoughtworks.homework.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.homework.demo.utils.SpringContext;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@Data
public class UserRequest {
    private String name;

    private Long age;

    private String avatar;

    private String description;

    @JsonIgnore
    private AtomicLong idGenerator = SpringContext.getBean(AtomicLong.class);

    public User toUser() {
        return User.builder()
                .id(idGenerator.incrementAndGet())
                .name(name)
                .age(age)
                .avatar(avatar)
                .description(description)
                .educations(new ArrayList<Education>())
                .build();
    }
}
