package org.study.java.homework1.oop;

public class Book {

    String title;
    String author;
    int price;

    public Book( String title, String author, int price) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public  void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price );
    }
}
