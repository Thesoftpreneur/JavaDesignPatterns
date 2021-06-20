package com.amberlion.otherStuff.threads;

import org.junit.Assert;
import org.junit.Test;

public class ReferencesObjectsTests {

    @Test
    public void testReferenceObjectsCreatedInRunnable() throws InterruptedException {

        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread1.join();
        String object1 = runnable.getMyLocalObject();

        thread2.start();
        thread2.join();

        String object2 = runnable.getMyLocalObject();
        Assert.assertNotEquals(object1,object2);

    }

    @Test
    public void testReferenceObjectsCreatedInTwoRunnables() throws InterruptedException {

        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        String object1 = runnable1.getMyLocalObject();
        String object2 = runnable2.getMyLocalObject();
        Assert.assertNotEquals(object1,object2);
    }

    @Test
    public void testReferenceObjects() throws InterruptedException {

        MyObject myObject = new MyObject();

        MyRunnable runnable = new MyRunnable(myObject);

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        String object1 = runnable.getMyObject();
        String object2 = runnable.getMyObject();
        Assert.assertEquals(object1,object2);
    }

    @Test
    public void testReferenceObjectsInManyRunnables() throws InterruptedException {

        MyObject myObject = new MyObject();

        MyRunnable runnable1 = new MyRunnable(myObject);
        MyRunnable runnable2 = new MyRunnable(myObject);

        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        String object1 = runnable1.getMyObject();
        String object2 = runnable2.getMyObject();
        Assert.assertEquals(object1,object2);
    }
}
