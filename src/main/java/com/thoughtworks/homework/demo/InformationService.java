package com.thoughtworks.homework.demo;

import com.thoughtworks.homework.demo.model.Education;
import com.thoughtworks.homework.demo.model.User;
import com.thoughtworks.homework.demo.utils.Fixtures;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InformationService {

    private Map<Long, User> users;

    public InformationService() {
        users = new HashMap<>();
        this.addMockData();
    }

    public User getUser(Long id) {
        return users.get(id);
    }

    public List<Education> getEducations(Long id) {
        return users.get(id).getEducations();
    }

    public Long addUser(User user) {
        Long id = user.getId();
        users.put(id, user);
        return id;
    }

    public void addEducation(Long id, Education education) {
        System.out.println(users.get(id));
        users.get(id).addEducation(education);
    }

    private void addMockData() {
        User user = Fixtures.buildUser(1L, "Qinyun", 25L, "https://st3.depositphotos.com/1007566/" +
                "12989/v/950/depositphotos_129895116-stock-illustration-hacker-character-avatar-icon.jpg", "Gong Xi Fa Cai");
        user.setEducations(Fixtures.buildEducations(2020L, "ThoughtWorks", "Dev"));
        users.put(1L, user);
    }
}
