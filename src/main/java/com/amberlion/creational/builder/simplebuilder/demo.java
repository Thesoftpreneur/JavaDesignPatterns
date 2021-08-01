package com.amberlion.creational.builder.simplebuilder;

public class demo {

    public static void main(String[] args) {
        User a = new User.UserBuilder().address("lolo").build();
        System.out.println(a.getAddress());
    }
}
