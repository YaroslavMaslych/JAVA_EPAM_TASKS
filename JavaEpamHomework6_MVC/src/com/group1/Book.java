package com.group1;

public class Book {
    private final int ID;
    private final String name;
    private final String author;
    private final String publishingHouse;
    private final int year;
    private final int pages;
    private double price;

    public Book(int ID, String name, String author,
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

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
