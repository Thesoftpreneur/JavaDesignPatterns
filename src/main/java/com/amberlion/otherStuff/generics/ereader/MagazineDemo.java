package com.amberlion.otherStuff.generics.ereader;

import com.amberlion.otherStuff.generics.ereader.readable.Magazine;

public class MagazineDemo {
    public static void main(String[] args) {
        EReader<Magazine> magazineReader = new EReader<>();

        magazineReader.saveItem(new Magazine("The New York News"));
        magazineReader.saveItem(new Magazine("The Chicago News"));
        magazineReader.readSavedItems();

    }
}
