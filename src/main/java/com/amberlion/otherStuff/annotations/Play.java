package com.amberlion.otherStuff.annotations;

public class Play {
    public static void main(String[] args) {
        @Author(first = "lolo", last="Dodod")
        Book book = new Book();
        System.out.println(book.getFirst());

    }
}
