package com.group1.view;

public class View {
    public static final String NEW_BOOKS_DATA = "\tEnter a size of a new Books array";
    public static final String WRONG_INPUT_DATA = "\tWrong input! Repeat please!";
    public static final String BOOKS_CREATED = "\tNew array created";
    public static final String INPUT_NAME = "\tEnter the name of book";
    public static final String INPUT_AUTHOR = "\tEnter the name of author";
    public static final String INPUT_PUBHOUSE = "\tEnter the name of publishing house";
    public static final String INPUT_YEAR = "\tEnter the year of publishing (integer)";
    public static final String INPUT_PAGES = "\tEnter the number of pages (integer)";
    public static final String INPUT_PRICE = "\tEnter the price of book (double)";
    public static final String BOOK_CREATED = "\tNew book added";
    public static final String COMMAND = "\tCommands for work with array:\n\t- ADD (to add new book)\n\t- ALL (to see all books in array)\n\t- PRICE (to change price)\n\t- AUTHOR (to see all books of concrete author)\n\t- YEAR (to see all books later than concrete year";
    public static final String MANY_BOOKS = "\tToo many books, enter a new size of array, 0 to cancel";
    public static final String INPUT_NEW_PRICE = "\tEnter new price in percents (from 0 to 999999 (integer))";
    public static final String INPUT_SEARCH_BY_AUTHOR = "\tEnter name of author to search";
    public static final String INPUT_SEARCH_BY_YEAR = "\tEnter year to search";

    public View() {

    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
