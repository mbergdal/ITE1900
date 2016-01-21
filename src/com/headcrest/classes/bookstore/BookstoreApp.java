package com.headcrest.classes.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreApp {
    private static Bookstore store = new Bookstore();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        addTestBooks(store);

        System.out.println("Bookstore verison 1.0");
        printAvailableCommands();

        while(true){
            System.out.print(">: ");
            String command = input.nextLine();

            switch (command){
                case "list":
                    printAllBooks();
                    break;
                case "add":
                    addNewBook();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unsupported command: " + command);
                    printAvailableCommands();
            }
        }
    }

    private static void addNewBook() {
        System.out.print("Title: ");
        String title = input.nextLine();
        store.addBook(new Book(title));
    }

    private static void printAvailableCommands() {
        System.out.println("Available commands: 'list', 'add', 'delete', 'exit'");
    }

    private static void printAllBooks() {
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
