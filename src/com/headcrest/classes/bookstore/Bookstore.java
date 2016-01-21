package com.headcrest.classes.bookstore;

import java.util.ArrayList;

public class Bookstore {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
