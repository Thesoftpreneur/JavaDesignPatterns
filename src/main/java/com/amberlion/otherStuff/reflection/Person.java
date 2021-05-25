package com.amberlion.otherStuff.reflection;

/**
 * A class created for testing reflection feature.
 */
public class Person {

    private String name;

    private static int numPeople = 0;

    public Person(String name) {
        this.name = name;

        numPeople++;
    }

    /**
     * A getter for name field
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * A setter for name field
     * @param name Given name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method displaying a certain person
     * @param p Person to be displayed
     */
    public static String printPerson(Person p) {
        return p.getName();
    }
}
