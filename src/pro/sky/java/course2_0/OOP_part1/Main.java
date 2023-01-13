package pro.sky.java.course2_0.OOP_part1;

import pro.sky.java.course2_0.OOP_part1.transport.Bus;
import pro.sky.java.course2_0.OOP_part1.transport.Car;
import pro.sky.java.course2_0.OOP_part1.transport.Car.Key;

public class Main {
    public static void main(String[] args) {
       Car granta = new Car("Lada", "Granta", 2.5, "желтый", 2015, "Россия","механика","седан","111",5,false,new Key(false,false),150);

        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","автомат","седан","222",5,false,new Key(false,false),150);
        Car z8 = new Car("BMW" ,"Z8",3.0, "черный", 2021, "Германия","автомат","родстер" , "333", 2,false,new Key(false,false),200);
        Car avante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","механика", "седан","444",5,false,new Key(false,false),200);
        Car sportage = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея","автомат","кросовер","555",5,false,new Key(false,false),180);
        System.out.println(granta.changeTiresSeasonal());
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(avante);
        System.out.println(sportage);
        Bus liaz = new Bus("Лиаз","a1",2015,"Росиия","Белый",120);
        Bus paz = new Bus("ПАЗ","Пазик",2020,"Росиия","Серый",110);
        Bus isuzu = new Bus("ISIZU","c3",2020,"Япония","Красный",150);
        System.out.println(liaz);
        System.out.println(paz);
        System.out.println(isuzu);

    }
}
