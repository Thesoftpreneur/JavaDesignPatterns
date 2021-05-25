package com.amberlion.otherStuff.reflection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Test Reflections features in Java
 * The test uses the {@link Person} object
 */
public class PersonReflectionTest  {

    /**
     * Get access to a private field using reflection (not a getter)
     * p.name // Error not accessible
     */
    @Test
    public void testAccessToPrivateNameField() {
        // given
        String personsName = "Pogo";
        Person p = new Person(personsName);
        try {
            // when
            Field field = p.getClass().getDeclaredField("name");
            field.setAccessible(true);
            // then
            Assert.assertEquals(personsName, field.get(p));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get access to a private static field using reflection
     * Person.numPeople // Error not accessible
     * Each time, a new instance is created the numPeople value increases
     */
    @Test
    public void testAccessToPrivateStaticField() {
        try {
            // when
            Field field = Person.class.getDeclaredField("numPeople");
            field.setAccessible(true);
            int numberOfPeople = (int) field.get(null);
            // then
            // null because we are not referring to a certain instance, just class
            Assert.assertEquals(numberOfPeople, field.get(null));

            Person a = new Person("person A");
            numberOfPeople++;
            Assert.assertEquals(numberOfPeople, field.get(null));
            Person b = new Person("person B");
            numberOfPeople++;
            Assert.assertEquals(numberOfPeople, field.get(null));
            Person c = new Person("person C");
            numberOfPeople++;
            Assert.assertEquals(numberOfPeople, field.get(null));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get access to a method using reflection
     * p.getName() // Access would still be accessible via reflection if the method would be private
     */
    @Test
    public void testAccessToGetNameMethod() {
        // given
        String personsName = "Pogo";
        Person p = new Person(personsName);
        try {
            // when
            Method method = p.getClass().getDeclaredMethod("getName");
            method.setAccessible(true);
            // then
            Assert.assertEquals(personsName, method.invoke(p));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * Get access to a method using reflection
     * p.setName("Pogo") // Access would still be accessible via reflection if the method would be private
     */
    @Test
    public void testAccessToSetNameMethod() {
        // given
        String personsName = "Pogo";
        Person p = new Person("TotallyRandom");
        try {
            // when
            Method method = p.getClass().getDeclaredMethod("setName", String.class);
            method.setAccessible(true);
            method.invoke(p, "Pogo");
            // then
            Assert.assertEquals(personsName, p.getName());
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * Get access to a static method using reflection
     * Person.printPerson(p) // Access would still be accessible via reflection if the method would be private
     */
    @Test
    public void testAccessToStaticPrintPersonMethod() {
        // given
        String personsName = "Pogo";
        Person p = new Person(personsName);
        try {
            // when
            Method method = Person.class.getDeclaredMethod("printPerson", Person.class);
            method.setAccessible(true);
            method.invoke(null, p);
            // then
            Assert.assertEquals(personsName, p.getName());
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * Get access to a constructor using reflection
     * new Person("Pogo"); // Access would still be accessible via reflection if the method would be private
     */
    @Test
    public void testAccessToConstructor() {
        // given
        String personsName = "Pogo";
        Person p;
        // when
        try {
            Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            p = constructor.newInstance("Pogo");
            // then
            Assert.assertEquals(personsName, p.getName());
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
