package pro.sky.java.course2_0.OOP_part1;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 0.000000000000000000000001, "желтый", 2015, "Россия");
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car z8 = new Car("BMW" ,"Z8",3.0, "черный", 2021, "Германия");
        Car avante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Car sportage = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(avante);
        System.out.println(sportage);
    }
}
