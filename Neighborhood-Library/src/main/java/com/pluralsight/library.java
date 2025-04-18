package com.pluralsight;

import java.util.Scanner;

public class library {
    private static final Book[] inventory = new Book[20];
    private static final Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
      initializeInventory();

        boolean running = true;
        while (running) {
            System.out.println("\n===== Welcome to the Book Store =====");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    running = false;
                    System.out.println("Thank you for using the Book Store!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
        scanner.close();


        () {
            for (int i = 0; i < inventory.length; i++) {
                inventory[i] = new Book(i + 1, "ISBN" + (1000 + i), "Book Title " + (i + 1));
            }
        }

        private static void showAvailableBooks() {
            System.out.println("\n--- Available Books ---");
            boolean anyAvailable = false;
            for (Book book : inventory) {
                if (!book.isCheckedOut()) {
                    anyAvailable = true;
                    System.out.printf("ID: %d | ISBN: %s | Title: %s%n", book.getId(), book.getIsbn(), book.getTitle());



        }

    private static void showCheckedOutBooks() {
    }


