package com.amberlion.otherStuff.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CapitalizeConsumer
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, 45, "Alice"));
        studentList.add(new Student(2, 65, "Bob"));
        studentList.add(new Student(3, 80, "Clair"));
        studentList.add(new Student(4, 20, "Dom"));

        Consumer<String> capsConsumer = name -> System.out.println(name.toUpperCase());

        studentList.stream().map(Student::getName)
                .forEach(capsConsumer);
    }
}