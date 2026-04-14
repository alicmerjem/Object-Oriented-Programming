package org.example;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof Book) {
            Book book = (Book) obj;

            return this.title.equals(book.title) && this.author.equals(book.author) && this.year == book.year;
        }

        return false;
    }
}

class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java mastery", "Merjem", 2026);
        Book b2 = new Book("Java mastery", "Merjem", 2026);

        Book b3 = new Book("Android Development", "Merjem", 2026);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        for (Book b : books) {
            System.out.println(b.toString());
        }

        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
    }
}
