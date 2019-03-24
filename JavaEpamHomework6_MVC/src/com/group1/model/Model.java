package com.group1.model;

import com.group1.Book;
import com.group1.Books;

import java.util.Arrays;

public class Model {
    private Books books;

    public Model() {

    }

    public void createBooks(int size) {
        books = new Books(size);
    }

    public void recreateBooks(int size) {
        Books newBooks = new Books(size);
        newBooks.setBooks(Arrays.copyOf(books.getBooks(), books.getBooks().length));
        books = newBooks;

    }

    public boolean addBook(String name, String author, String pubhouse, int year, int pages, double price) {
        if (books.getIndex() != books.getBooks().length) {
            books.getBooks()[books.getIndex()] = new Book(books.getIndex(), name, author, pubhouse, year, pages, price);
            incrementIndex();
            return true;
        } else {
            return false;
        }
    }

    private void incrementIndex() {
        books.setIndex(books.getIndex() + 1);
    }

    private String view(Book book) {
        return ("Id: " + book.getID()+1 + " Name: " + book.getName() + " Author: " + book.getAuthor() + " Publishing House: " + book.getPublishingHouse() + " Year: " + book.getYear() + " Pages: " + book.getPages() + " Price: " + book.getPrice());
    }

    public String allBooks() {
        String result = "";
        for (int i = 0; i < books.getIndex(); i++) {
            result += view(books.getBooks()[i]) + "\n";
        }
        return result;
    }

    public void changePrice(int percent) {
        for (int i = 0; i < books.getIndex(); i++) {
            books.getBooks()[i].setPrice(books.getBooks()[i].getPrice() * percent / 100);
        }
    }

    public String findByAuthor(String author) {
        String result = "";
        for (int i = 0; i < books.getIndex(); i++) {
            String author2 = books.getBooks()[i].getAuthor();
            if (author2.equals(author)) {
                result = result + view(books.getBooks()[i]) + "\n";
            }
        }
        return result;
    }

    public String findByYear(int year) {
        String result = "";
        for (int i = 0; i < books.getIndex(); i++) {
            if (books.getBooks()[i].getYear() >= year) {
                result += view(books.getBooks()[i]) + "\n";
            }
        }
        return result;
    }
}
