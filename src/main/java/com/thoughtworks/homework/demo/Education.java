package com.thoughtworks.homework.demo;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class Education {
    private Long year;

    private String title;

    private String description;
}
