package org.example;

import java.util.*;

record Book(String title, String author, int year) {}

class Library {
    private Map<String, Book> books = new HashMap<>();

    private String clean(String input) {
        return input.trim().toLowerCase();
    }

    public void addBook(Book book) {
        books.put(clean(book.title()), book);
    }

    public void removeBook(String title) {
        books.remove(clean(title));
    }

    public Optional<Book> findByExactTitle(String title) {
        return Optional.ofNullable(books.get(clean(title)));
    }

    public Optional<Book> findByTitleStart(String prefix) {
        String cleanPrefix = clean(prefix);
        for (Book book : books.values()) {
            if (clean(book.title()).startsWith(cleanPrefix)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}

class BookTesting {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("Java Programming", "John Smith", 2022));
        library.addBook(new Book("Clean Code", "Robert Martin", 2008));

        Optional<Book> exactSearch = library.findByExactTitle("Java Programming");
        if (exactSearch.isPresent()) {
            System.out.println("Found: " + exactSearch.get());
        } else {
            System.out.println("Book not found.");
        }

        Optional<Book> prefixSearch = library.findByTitleStart("The Gre");
        if (prefixSearch.isPresent()) {
            System.out.println("Found by prefix: " + prefixSearch.get());
        }

        library.removeBook("Clean Code");

        Optional<Book> searchRemoved = library.findByExactTitle("Clean Code");
        if (searchRemoved.isEmpty()) {
            System.out.println("Clean Code removed successfully.");
        }
    }
}