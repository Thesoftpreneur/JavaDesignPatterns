package com.amberlion.otherStuff.generics.ereader.readable;

public class Magazine extends WrittenForm implements Readable{

    public Magazine(String title) {
        super(title);
    }

    @Override
    public void read() {
        System.out.println("Read: Magazine: " + super.title);
    }
}
