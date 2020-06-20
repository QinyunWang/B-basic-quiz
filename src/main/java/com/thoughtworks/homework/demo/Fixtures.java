package com.thoughtworks.homework.demo;

import java.util.Collections;
import java.util.List;

public class Fixtures {

    public static User buildUser(Long id, String name, Long age, String avatar, String description) {
        return User.builder().id(id).name(name).age(age).avatar(avatar).description(description).build();
    }

    public static List<Education> buildEducations(Long year, String title, String description) {
        return Collections.singletonList(Education.builder().year(year).title(title).description(description).build());
    }
}
