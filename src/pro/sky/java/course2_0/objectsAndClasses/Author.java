package pro.sky.java.course2_0.objectsAndClasses;

import java.util.HashSet;
import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private static HashSet<Author> authors = new HashSet<>();

    public Author(String name, String surname) {
        //  В конструкторе не даем создать автора если такой уже есть
        if (isNewAuthor(name, surname)) {
            this.name = name;
            this.surname = surname;
            authors.add(this);
        } else {
            System.out.println("Невозможно добавить " + name + " " + surname + " такой автор уже существует");
        }
    }

    private boolean isNewAuthor(String name, String surname) {
        for (Author author : authors) {
            if (author.name.equals(name) && author.surname.equals(surname)) {
                return false;
            }
        }
        return true;
    }

    @Override
    // Автор один и тот же только если совпадает и имя и фамилия
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static HashSet<Author> getAuthors() {
        return authors;
    }
}
