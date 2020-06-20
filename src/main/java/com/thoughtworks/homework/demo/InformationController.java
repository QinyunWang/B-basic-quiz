package com.thoughtworks.homework.demo;

import com.thoughtworks.homework.demo.model.Education;
import com.thoughtworks.homework.demo.model.User;
import com.thoughtworks.homework.demo.model.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class InformationController {

    private final InformationService informationService;

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getName(@PathVariable("id") Long id) {
        return informationService.getUser(id);
    }

    @GetMapping("/users/{id}/educations")
    @ResponseStatus(HttpStatus.OK)
    public List<Education> getEducations(@PathVariable("id") Long id) {
        return informationService.getEducations(id);
    }

    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    public Long addUser(@RequestBody @Valid UserRequest userRequest) {
        return informationService.addUser(userRequest.toUser());
    }

    @PostMapping("users/{id}/educations")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEducation(@PathVariable("id") Long id, @RequestBody @Valid Education education) {
        informationService.addEducation(id, education);
    }
}
