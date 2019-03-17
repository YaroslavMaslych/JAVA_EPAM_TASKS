package com.group1;

public class Books {
    private int index = 0;
    private Book[] books;

    Books(int size) {
        books = new Book[size];
    }

    void addBook(Book book) {
        books[index] = book;
        index++;
    }

    void allBooks() {
        for (int i = 0; i < index; i++) {
            books[i].view();
        }
    }

    void changePrice(int percents) {
        for (int i = 0; i < index; i++) {
            books[i].setPrice(books[i].getPrice() * percents / 100);
        }
    }

    Books searchByAuthor(String author) {
        int size = 0;
        for (int i = 0; i < index; i++) {
            if (books[i].getAuthor().equals(author)) {
                size++;
            }
        }
        Books newBooks = new Books(size);
        for (int i = 0; i < index; i++) {
            if (books[i].getAuthor().equals(author)) {
                newBooks.addBook(books[i]);
            }
        }
        return newBooks;
    }

    Books laterThan(int year) {
        int size = 0;
        for (int i = 0; i < index-1; i++) {
            if (books[i].getYear() >= year) {
                size++;
            }
        }
        Books newBooks = new Books(size);
        for (int i = 0; i < index-1; i++) {
            if (books[i].getYear() >= year) {
                newBooks.addBook(books[i]);
            }
        }
        return newBooks;
    }
}
