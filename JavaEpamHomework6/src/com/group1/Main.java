package com.group1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of books array");
        Books books = new Books(sc.nextInt());
        books.addBook(new Book(10,"XXX", "YYY",
                "ZZZ", 2020, 228, 99.99));
        books.addBook(new Book(11,"XXX", "YoY",
                "ZZZ", 2019, 228, 99.99));
        books.addBook(new Book(12,"XXX", "YYY",
                "ZZZ", 2016, 228, 99.99));
        books.allBooks();
        System.out.println("Enter percents to change price");
        int percents = sc.nextInt();
        books.changePrice(percents);
        System.out.println("Enter a year to search");
        int year = sc.nextInt();
        (books.laterThan(year)).allBooks();
        System.out.println("Enter an author to search");
        String author = sc.nextLine();
        (books.searchByAuthor(author)).allBooks();
    }
}
