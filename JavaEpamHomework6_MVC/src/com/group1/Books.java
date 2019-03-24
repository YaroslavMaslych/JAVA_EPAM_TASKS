package com.group1;

public class Books {
    private int index = 0;
    private Book[] books;

    public Books(int size) {
        books = new Book[size];
    }

    public Book[] getBooks() {
        return books;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
