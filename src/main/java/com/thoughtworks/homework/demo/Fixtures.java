package com.thoughtworks.homework.demo;

public class Fixtures {

    public static User buildUser(Long id, String name, Long age, String avatar, String description) {
        return User.builder().id(id).name(name).age(age).avatar(avatar).description(description).build();
    }
}
