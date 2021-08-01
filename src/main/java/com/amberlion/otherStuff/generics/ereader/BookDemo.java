package com.amberlion.otherStuff.generics.ereader;

import com.amberlion.otherStuff.generics.ereader.readable.Book;
import com.amberlion.otherStuff.generics.ereader.readable.Novel;

import java.util.ArrayList;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        EReader<Book> bookReader = new EReader<>();

        bookReader.saveItem(new Book("Blue Lakes"));
        bookReader.saveItem(new Book("Red Lakes"));
        bookReader.saveItem(new Novel("Yellow Lakes"));
        bookReader.readSavedItems();

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Red Hills"));
        bookList.add(new Book("Blue Hills"));
        bookList.add(new Novel("Yellow Forest"));
        bookReader.readAllBooksFromBooklist(bookList);
    }

}
