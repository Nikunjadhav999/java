package com.wipro.java.oops.task;

//Class representing the Library
class Library {
 private Book[] books;
 private int count;

 public Library(int capacity) {
     books = new Book[capacity];
     count = 0;
 }

 public void addBook(Book book) {
     if (count < books.length) {
         books[count] = book;
         System.out.println("Added: " + book.getTitle());
         count++;
     } else {
         System.out.println("Library is full! Cannot add more books.");
     }
 }

 public void displayBooks() {
     System.out.println("Library Books:");
     for (int i = 0; i < count; i++) {
         books[i].displayInfo();
     }
 }
}