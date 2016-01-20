package com.headcrest.classes.bookstore;

public class Book {
    private String ISBN;
    private String publishedYear;
    Author author;
    private String title;


    public Book(String title, Author author, String ISBN, String publishedYear){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this. publishedYear = publishedYear;
    }

    public Book(String title) {
        this(title, new Author("unknown", "unknown"), "unknown", "unknown");
    }

    public String getTitle() {
        return title;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString(){
        return String.format("Title: %s Author: %s, %s ISBN:%s Year:%s", title, author.getFirstName(), author.getLastName(), ISBN, publishedYear);

    }
}
