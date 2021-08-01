package com.amberlion.otherStuff.generics.ereader.readable;

public class Novel extends Book {
    public Novel(String title) {
        super(title);
    }

    @Override
    public void read() {
        System.out.println("Novel: Read: " + super.title);
    }
}
