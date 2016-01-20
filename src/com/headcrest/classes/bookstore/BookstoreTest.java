package com.headcrest.classes.bookstore;

import java.util.ArrayList;

public class BookstoreTest {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        addTestBooks(store);
        //store.addBook(new Book("Java", new Author("Per", "Hansen"), "1234556", "2015"));

        ArrayList<Book> allBooks = store.getAllBooks();

        System.out.println("List of all books:");
        for (Book b : allBooks) {
            System.out.println(b);
        }
    }

    private static void addTestBooks(Bookstore store) {
        for (String[] bookData : TestData.data) {
            store.addBook(new Book(bookData[0], new Author(bookData[1], bookData[2]), bookData[3], bookData[4]));
        }
    }
}
