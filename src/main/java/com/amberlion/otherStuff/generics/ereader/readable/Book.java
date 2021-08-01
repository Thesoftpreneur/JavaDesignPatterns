package com.amberlion.otherStuff.generics.ereader.readable;

public class Book extends WrittenForm implements Readable {

    public Book(String title) {
        super(title);
    }

    @Override
    public void read() {
        System.out.println("Read: Book: " + super.title);
    }
}
