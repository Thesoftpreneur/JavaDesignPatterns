package com.amberlion.otherStuff.threads;

import lombok.Getter;

public class MyRunnableWithReferenceTypes implements Runnable {

    MyObject myObject = null;
    MyObject myLocalObject = null;

    public MyRunnableWithReferenceTypes() {}

    public MyRunnableWithReferenceTypes(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        this.myLocalObject = new MyObject();
    }

    public String getMyLocalObject() {
        return this.myLocalObject.toString();
    }

    public String getMyObject() {
        return this.myObject.toString();
    }
}
