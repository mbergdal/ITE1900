package com.headcrest.classes.bookstore;

import java.util.ArrayList;

public class BookstoreTest {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        //store.addBook(new Book("Cats"));
        addTestBooks(store);

        ArrayList<Book> allBooks = store.getAllBooks();

        System.out.println("List of all books in store:");
        for (Book book: allBooks){
            System.out.println(book.toString());
        }
    }

    private static void addTestBooks(Bookstore store) {
        for (String[] bookData : TestData.data) {
            store.addBook(new Book(bookData[0], new Author(bookData[1], bookData[2]), bookData[3], bookData[4]));
        }
    }
}
