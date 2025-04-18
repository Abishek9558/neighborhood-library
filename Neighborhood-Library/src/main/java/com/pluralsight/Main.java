package com.pluralsight;

public class Main {
        public static void main(String[] args) {
            Book[] inventory = new Book[20];


            for (int i = 0; i < inventory.length; i++) {
                inventory[i] = new Book(i + 1, "ISBN" + (1000 + i), "Book Title " + (i + 1));
            }
            for (Book book : inventory) {
                System.out.println(book);
            }
        }
    }




