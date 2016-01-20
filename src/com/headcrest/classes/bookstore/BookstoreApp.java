package com.headcrest.classes.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreApp {
    private static Scanner input = new Scanner(System.in);
    private static Bookstore store = new Bookstore();

    public static void main(String[] args) {

        System.out.println("Bookstore version 1.0");
        printAvailableCommands();
        while(true){

            System.out.print(">: ");
            String command = input.nextLine();

            switch (command){
                case "list":
                    listBooks();
                    break;
                case "add":
                    addBook();
                    break;
                case "delete":
                    break;
                default:
                    printAvailableCommands();
            }
        }
    }

    private static void printAvailableCommands() {
        System.out.println("Available commands are: 'list', 'add', 'delete");
    }

    private static void addBook() {
        System.out.print("Title:");
        String title = input.nextLine();
        store.addBook(new Book(title));
    }

    private static void listBooks() {
        ArrayList<Book> allBooks = store.getAllBooks();
        if (allBooks.size() == 0) {
            System.out.println("No books to list");
        }else {
            System.out.println("List of all books:");
            for (Book b : allBooks) {
                System.out.println(b);
            }
        }
    }
}