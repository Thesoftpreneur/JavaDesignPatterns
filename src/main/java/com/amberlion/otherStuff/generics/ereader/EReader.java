package com.amberlion.otherStuff.generics.ereader;

import com.amberlion.otherStuff.generics.ereader.readable.Book;
import com.amberlion.otherStuff.generics.ereader.readable.Readable;
import com.amberlion.otherStuff.generics.ereader.readable.WrittenForm;

import java.util.ArrayList;
import java.util.List;

public class EReader<T extends WrittenForm & Readable>  {

    // The bookList can have Books, Novels, Magazines. Depends on the EReader Type
    private final List<T> itemList;

    public EReader(){
        this.itemList = new ArrayList<>();
    }

    void saveItem(T t) {
        itemList.add(t);
    }

    void readSavedItems() {
        itemList.forEach(Readable::read);
    }

    /*
     * "? extends Book" means that the type can be any that extends the Book class (eg Novel)
     * or Book class itself
     */
    void readAllBooksFromBooklist(List<? extends Book> bookList) {
        bookList.forEach(Readable::read);
    }
}
