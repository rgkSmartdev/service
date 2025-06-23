package com.jsp.service.demo;

import java.util.Optional;

public class TestOptional {

    public void checkOptional() {
        String firstName = "John";
        String lastName = null;
        Optional opt = Optional.ofNullable(lastName);

        if (opt.isPresent()) {
            System.out.println(firstName + " " + opt.get());
        } else {
            System.out.println(firstName + " has no last name");
        }

        System.out.println( firstName + " " + opt.orElse("No last name"));

    }
}
