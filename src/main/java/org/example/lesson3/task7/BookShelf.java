package org.example.lesson3.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShelf {
    private List<Book> books;
    private int amountOfBooks;
    public BookShelf(){
        books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                ", amountOfBooks=" + amountOfBooks +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }
    public void sort(){
        books = books.stream().sorted(Comparator.comparingInt(Book::getYear)).toList();
    }
    public void reverseSort(){
        books = books.stream().sorted(Comparator.comparingInt(Book::getYear)).sorted(Collections.reverseOrder()).toList();
    }
}

