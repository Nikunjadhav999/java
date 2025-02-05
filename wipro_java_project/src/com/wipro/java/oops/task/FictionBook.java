package com.wipro.java.oops.task;

// Class representing a Fiction book
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + ", price: " + getPrice() + ", Genre: " + genre);
    }
}