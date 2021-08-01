package com.amberlion.otherStuff.generics.ereader;

import com.amberlion.otherStuff.generics.ereader.readable.Novel;

public class NovelDemo {
    public static void main(String[] args) {

        EReader<Novel> novelEReader = new EReader<>();

        novelEReader.saveItem(new Novel("Forbidden Love"));
        novelEReader.saveItem(new Novel("Bad Love"));
        //novelEReader.saveItem(new Book("Wtf?!")); Err Book is not a type of Novel
        novelEReader.readSavedItems();
    }
}
