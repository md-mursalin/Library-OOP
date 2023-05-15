package org.example;

import java.util.ArrayList;
import java.util.List;

public record Book(String title, String author, Boolean availability_status, Integer year) {
    public Book {
        if (title.isBlank()){
            throw new IllegalArgumentException("title cannot be empty");
        }
        if (author.isBlank()){
            throw new IllegalArgumentException("author cannot be empty");
        }
        if (availability_status == null){
            throw new IllegalArgumentException("availability_status cannot be null");
        }
        if (year == null || year < 0){
            throw new IllegalArgumentException("year must be a positive value");
        }
    }

    static List<Book> list = new ArrayList<>();

    public void add(Book book){
        list.add(book);

    }

    public void remove(Book book){
        list.remove(book);

    }

    public boolean searchByTitle(String title){
        for (Book b: list) {
            return b.title.equals(title);


        }

        return false;
    }

    public boolean searchByAuthor(String author){
        for (Book b: list) {
            return b.title.equals(author);


        }

        return false;
    }







}
