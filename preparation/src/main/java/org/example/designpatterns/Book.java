package org.example.designpatterns;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBestseller;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publicationYear = builder.publicationYear;
        this.isBestseller = builder.isBestseller;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public  int getPublicationYear() { return publicationYear; }
    public boolean isBestseller() { return isBestseller; }

    public static class BookBuilder {
        private String title;
        private String author;
        private int publicationYear;
        private boolean isBestseller;

        public BookBuilder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public BookBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder isBestseller(boolean isBestseller) {
            this.isBestseller = isBestseller;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
