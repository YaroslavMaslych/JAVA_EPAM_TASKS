package com.group1.controller;

import com.group1.model.Model;
import com.group1.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner sc;

    public Controller() {
        this.model = new Model();
        this.view = new View();
        this.sc = new Scanner(System.in);
    }

    int getInt() {
        try {
            String integ = sc.nextLine();
            int integers = Integer.parseInt(integ);
            if (integers<0 || integers>=1000000) {
                view.printMessage(View.WRONG_INPUT_DATA);
                return getInt();
            }
            return integers;
        } catch (Exception e) {
            view.printMessage(View.WRONG_INPUT_DATA);
            return getInt();
        }
    }

    String getStr() {
        return sc.nextLine();
    }

    double getDoub() {
        try {
            String doub = sc.nextLine();
            double doubles = Double.parseDouble(doub);
            return doubles;
        } catch (Exception e) {
            view.printMessage(View.WRONG_INPUT_DATA);
            return getDoub();
        }
    }

    void control(String command) {
        switch (command) {
            case "ADD": {
                view.printMessage(View.INPUT_NAME);
                String name = getStr();
                view.printMessage(View.INPUT_AUTHOR);
                String author = getStr();
                view.printMessage(View.INPUT_PUBHOUSE);
                String pubhouse = getStr();
                view.printMessage(View.INPUT_YEAR);
                int year = getInt();
                view.printMessage(View.INPUT_PAGES);
                int pages = getInt();
                view.printMessage(View.INPUT_PRICE);
                double price = getDoub();
                if (!model.addBook(name, author, pubhouse, year, pages, price)) {
                    view.printMessage(View.MANY_BOOKS);
                    int size = getInt();
                    if (size == 0) {
                        view.printMessage(View.COMMAND);
                        String commandTwo = getStr();
                        control(commandTwo);
                    } else {
                        model.recreateBooks(size);
                        control("ADD");
                    }
                } else {
                    view.printMessage(View.BOOK_CREATED);
                    view.printMessage(View.COMMAND);
                    String commandTwo = getStr();
                    control(commandTwo);
                }
                    break;
            }

            case "ALL": {
                view.printMessage(model.allBooks());
                view.printMessage(View.COMMAND);
                String commandTwo = getStr();
                control(commandTwo);
                break;
            }

            case "PRICE": {
                view.printMessage(View.INPUT_NEW_PRICE);
                int price = getInt();
                model.changePrice(price);
                view.printMessage(View.COMMAND);
                String commandTwo = getStr();
                control(commandTwo);
                break;
            }

            case "AUTHOR": {
                view.printMessage(View.INPUT_SEARCH_BY_AUTHOR);
                String author = getStr();
                view.printMessage(model.findByAuthor(author));
                view.printMessage(View.COMMAND);
                String commandTwo = getStr();
                control(commandTwo);
                break;
            }

            case "YEAR": {
                view.printMessage(View.INPUT_SEARCH_BY_YEAR);
                int year = getInt();
                view.printMessage(model.findByYear(year));
                view.printMessage(View.COMMAND);
                String commandTwo = getStr();
                control(commandTwo);
                break;
            }

            default: {
                view.printMessage(View.WRONG_INPUT_DATA);
                view.printMessage(View.COMMAND);
                String commandTwo = getStr();
                control(commandTwo);
            }
        }
    }

    public void start() {
        view.printMessage(View.NEW_BOOKS_DATA);
        model.createBooks(getInt());
        view.printMessage(View.BOOKS_CREATED);
        view.printMessage(View.COMMAND);
        String command = getStr();
        control(command);
    }


}
