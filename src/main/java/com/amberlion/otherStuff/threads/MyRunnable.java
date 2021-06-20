package com.amberlion.otherStuff.threads;

import lombok.Getter;

public class MyRunnable implements Runnable {

    public int count = 0;
    @Getter
    MyObject myObject = null;
    MyObject myLocalObject = null;

    public MyRunnable() {}

    public MyRunnable(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {

        this.myLocalObject = new MyObject();

        for (int i=0; i<1_000_000; i++) {
            synchronized (this) {
                this.count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
        System.out.println(myObject);
    }

    public String getMyLocalObject() {
        return this.myLocalObject.toString();
    }

    public String getMyObject() {
        return this.myObject.toString();
    }
}
