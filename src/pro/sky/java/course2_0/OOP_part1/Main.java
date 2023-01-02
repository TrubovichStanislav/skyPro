package pro.sky.java.course2_0.OOP_part1;

import pro.sky.java.course2_0.OOP_part1.transport.Car;
import pro.sky.java.course2_0.OOP_part1.transport.Car.Key;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2.5, "желтый", 2015, "Россия","механика","седан","111",5,false,new Key(false,false));

        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","автомат","седан","222",5,false,new Key(false,false));
        Car z8 = new Car("BMW" ,"Z8",3.0, "черный", 2021, "Германия","автомат","родстер" , "333", 2,false,new Key(false,false));
        Car avante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","механика", "седан","444",5,false,new Key(false,false));
        Car sportage = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея","автомат","кросовер","555",5,false,new Key(false,false));
        System.out.println(granta.changeTiresSeasonal());
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(avante);
        System.out.println(sportage);
    }
}
