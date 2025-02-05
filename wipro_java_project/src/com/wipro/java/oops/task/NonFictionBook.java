package com.wipro.java.oops.task;

//Class representing a Non-Fiction book
class NonFictionBook extends Book {
 private String subject;

 public NonFictionBook(String title, String author, int price, String subject) {
     super(title, author, price);
     this.subject = subject;
 }

 @Override
 public void displayInfo() {
     System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + ", price: " + getPrice() + ", Subject: " + subject);
 }
}
