package com.amberlion.creational.singleton;

import lombok.Getter;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTests {

    /**
     * Test that asserts if the second singleton is the same as the original one
     */
    @Test
    public void testSimpleSingleton() {

        Singleton singletonA = Singleton.getInstance("FOO");
        Singleton singletonB = Singleton.getInstance("BAR");

        Assert.assertEquals(singletonA.getValue(), singletonB.getValue());
    }

    /**
     * Test that asserts whether the second singleton is the same as the original one
     * and if it's thread safe (has the double null check)
     * @throws InterruptedException
     */
    @Test
    public void testMultiThreadSingleton() throws InterruptedException {
        ThreadObject foo = new ThreadObject("FOO");
        ThreadObject bar = new ThreadObject("BAR");
        Thread threadFoo = new Thread(foo);
        Thread threadBar = new Thread(bar);
        threadFoo.start();
        threadBar.start();
        threadFoo.join();
        threadBar.join();
        Assert.assertEquals(foo.getValue(), bar.getValue());

    }

    @Getter
    static class ThreadObject implements Runnable {
        private volatile String value;
        public ThreadObject(String value) {
            this.value = value;
        }

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(value);
            this.value = singleton.getValue();
        }
    }
}
