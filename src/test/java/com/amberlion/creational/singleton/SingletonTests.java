package com.amberlion.creational.singleton;

import lombok.Getter;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTests {
    @Test
    public void testSimpleSingleton() {

        Singleton singletonA = Singleton.getInstance("FOO");
        Singleton singletonB = Singleton.getInstance("BAR");

        Assert.assertEquals(singletonA.getValue(), singletonB.getValue());
    }

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
