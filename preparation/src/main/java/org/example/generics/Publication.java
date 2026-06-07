package org.example.generics;
import java.util.*;

public class Publication {
    private int isbn;
    private String title;

    public Publication(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public  int getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public void setIsbn(int isbn) { this.isbn = isbn; }
    public void setTitle(String title) { this.title = title; }
}

class Book extends Publication {
    public Book(int isbn, String title) {
        super(isbn, title);
    }
}

class Magazine extends Publication {
    public Magazine(int isbn, String title) {
        super(isbn, title);
    }
}

class Library<T extends Publication> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();

        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                result.add(item);
            }
        }
        return result;
    }

    public T getByIsbn(int isbn) {
        for (T item : items) {
            if (item.getIsbn() == isbn) {
                return item;
            }
        }

        return null;
    }
}
