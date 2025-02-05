package com.wipro.java.oops.task;

//Main class to demonstrate the OOP concepts
public class Oops {
 public static void main(String[] args) {
     Library library = new Library(5); // Capacity of 5 books

     // Creating instances of different types of books
     Book fiction1 = new FictionBook("GITA", "devdut", 200, "Classic");
     Book nonFiction1 = new NonFictionBook("Sapiens", "Yuval Noah Harari", 300, "History");

     // Adding books to the library
     library.addBook(fiction1);
     library.addBook(nonFiction1);

     // Displaying all books in the library
     library.displayBooks();
 }
}