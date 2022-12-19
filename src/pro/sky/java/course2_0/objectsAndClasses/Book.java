package pro.sky.java.course2_0.objectsAndClasses;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    private static int bookCounter =0;
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