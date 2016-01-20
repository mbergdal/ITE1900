package com.headcrest.classes.bookstore;

import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> allBooks = new ArrayList<>();

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public void addBook(Book newBook) {

        allBooks.add(newBook);
    }

}
