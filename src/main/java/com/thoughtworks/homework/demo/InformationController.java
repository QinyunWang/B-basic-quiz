package com.thoughtworks.homework.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InformationController {

    private final InformationService informationService;

    @GetMapping("/users/{id}")
    public String getName(@PathVariable("id") String id) {
        return informationService.getName(id);
    }
}
