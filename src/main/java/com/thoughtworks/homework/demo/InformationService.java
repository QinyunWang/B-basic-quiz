package com.thoughtworks.homework.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InformationService {

    public String getName(String id) {
        return "ALOHA";
    }
}
