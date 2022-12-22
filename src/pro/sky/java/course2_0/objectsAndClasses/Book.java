package pro.sky.java.course2_0.objectsAndClasses;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    private static int bookCounter = 0;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        bookCounter++;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return
                "Название книги - " + name +
                        ", автор " + author +
                        ", год публикации " + yearOfPublication;
    }

    @Override
    // Книга одна и таже если совподает автор и название, год публикации нам не важен
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication < 1950 || yearOfPublication > 2050) {
            System.out.println("Недопустимый год публикации:" + yearOfPublication);
            return;
        }
        this.yearOfPublication = yearOfPublication;
    }
}