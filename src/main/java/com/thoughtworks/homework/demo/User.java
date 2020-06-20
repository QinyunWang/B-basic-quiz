package com.thoughtworks.homework.demo;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class User {

    private Long id;

    private String name;

    private Long age;

    private String avatar;

    private String description;
}
