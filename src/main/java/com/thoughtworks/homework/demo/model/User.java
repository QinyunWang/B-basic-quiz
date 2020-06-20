package com.thoughtworks.homework.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Long age;

    private String avatar;

    private String description;

    @JsonIgnore
    private List<Education> educations;

    public void addEducation(Education education) {
        this.educations.add(education);
    }
}
