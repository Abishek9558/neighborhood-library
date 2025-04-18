package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedout;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = false;
        this.checkedOutTo = "";
    }
//getters

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

//setters

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void Checkout(String name) {
        if (!isCheckedout) {
            this.checkedOutTo = name;
            this.isCheckedout = true;
            System.out.println("Book \"" + title + "\" checked out to " + name + ".");
        } else {
            System.out.println("Book \"" + title + "\" is already checked out.");
        }
    }

        public void checkIn() {
            if (isCheckedout) {
                System.out.println("Book \"" + title + "\" checked in from " + checkedOutTo + ".");
                this.checkedOutTo = "";
                this.isCheckedout = false;
            } else {
                System.out.println("Book " + title + "has been checked in.");
            }
        }

        public String toString() {
            return "Book[ID=" + id + ", Title=" + title + ", ISBN=" + isbn +
                    ", Checked Out=" + isCheckedout + ", Checked Out To=" + checkedOutTo + "]";

    }
}