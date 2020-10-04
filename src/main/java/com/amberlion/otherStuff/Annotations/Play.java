package com.amberlion.otherStuff.Annotations;

public class Play {
    public static void main(String[] args) {
        @Author(first = "lolo", last="Dodod")
        Book book = new Book();
        System.out.println(book.getFirst());

    }
}
