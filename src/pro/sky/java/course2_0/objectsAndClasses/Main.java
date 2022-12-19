package pro.sky.java.course2_0.objectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Алескандр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book book1 = new Book("Евгений Онегин", pushkin, 2015);
        Book book2 = new Book("Герой нашего времени", lermontov, 2000);
        book1.setYearOfPublication(2010);
        System.out.printf("Количество книг "+ Book.getBookCounter());
    }
}