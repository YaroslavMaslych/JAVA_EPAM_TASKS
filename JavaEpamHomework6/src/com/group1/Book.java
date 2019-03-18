package com.group1;

class Book {
    private final int ID;
    private final String name;
    private final String author;
    private final String publishingHouse;
    private final int year;
    private final int pages;
    private double price;

    Book(int ID, String name, String author,
                String publishingHouse, int year,
                int pages, double price) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    void view() {
        System.out.println("ID: "+ID+" Title: "+name
                +" Author: "+author+" Publishing House: "
                +publishingHouse+" Year: "+year+" Pages: "+pages+" Price: "
                +price);
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }
}
