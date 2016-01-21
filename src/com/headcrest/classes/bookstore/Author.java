package com.headcrest.classes.bookstore;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format("%s, %s", lastName, firstName);
    }
}
