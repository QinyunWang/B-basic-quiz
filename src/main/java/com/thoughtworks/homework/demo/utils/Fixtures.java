package com.thoughtworks.homework.demo.utils;

import com.thoughtworks.homework.demo.model.Education;
import com.thoughtworks.homework.demo.model.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fixtures {

    public static User buildUser(Long id, String name, Long age, String avatar, String description) {
        return User
                .builder()
                .id(id)
                .name(name)
                .age(age)
                .avatar(avatar)
                .description(description)
                .educations(Collections.emptyList())
                .build();
    }

    public static List<Education> buildEducations(Long year, String title, String description) {
        return Stream.of(Education.builder().year(year).title(title).description(description).build()).collect(Collectors.toList());
    }
}
