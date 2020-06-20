package com.thoughtworks.homework.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Education {

    @NotNull(message = "Year cannot be null")
    private Long year;

    private String title;

    private String description;
}
