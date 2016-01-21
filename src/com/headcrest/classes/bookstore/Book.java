package com.headcrest.classes.bookstore;

public class Book {
    private String title;
    private String ISBN;
    private String publishedYear;
    private Author author;

    public Book(){
        title = "unknown";
        ISBN = "unknown";
        publishedYear = "unknown";
        author = new Author("unknown", "unknown");
    }

    public Book(String title){
        this();
        this.title = title;
    }

    public Book(String title, Author author, String ISBN, String publishedYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString(){
        return String.format("Title: %s, Author: %s, ISBN: %s, Year: %s",
                title, author, ISBN, publishedYear);
    }
}
