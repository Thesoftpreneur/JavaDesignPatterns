package com.amberlion.creational.builder.studentWithInheritance;

public class Main {
    public static void main(String[] args) {
        Student student= Student.builder()
                .name("Google.com")
                .age(30)
                .school("AlphaBet")
                .build();
        System.out.println(student.toString());

        People people = People.builder()
                .name("facebook.com")
                .age(20)
                .build();
        System.out.println(people.toString());
    }
}
