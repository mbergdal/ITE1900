package com.headcrest.classes.bookstore;

public class Author {
    private String firstName;
    private String lastName;
    private String email;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, String email){
        this(firstName, lastName);
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
