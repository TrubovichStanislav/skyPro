package pro.sky.java.course2_0.OOP_part1;


import pro.sky.java.course2_0.OOP_part1.Driver.Driver;
import pro.sky.java.course2_0.OOP_part1.Driver.DriverB;
import pro.sky.java.course2_0.OOP_part1.Driver.DriverC;
import pro.sky.java.course2_0.OOP_part1.Driver.DriverD;
import pro.sky.java.course2_0.OOP_part1.exception.DrivingLicenseException;
import pro.sky.java.course2_0.OOP_part1.transport.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
  public static Set<Driver> drivers = new HashSet<>();
    public static void main(String[] args) {

        Car granta = new Car("Lada", "Granta", 2.5, new DriverB("Иван Иванов", true, 5));
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, new DriverB("Петр Петров", true, 4));
        Car z8 = new Car("BMW", "Z8", 3.0, new DriverB("Сергей Сергеев", true, 3));
        Car avante = new Car("Hyundai", "Avante", 1.6, new DriverB("Сидр Сидоров", true, 6));
        Bus a1 = new Bus("Лиаз", "a1", 5.0, new DriverD("Сергей Соловьев", true, 3));
        Bus pazik = new Bus("ПАЗ", "Пазик", 5.5, new DriverD("Виктор Коржаков", true, 7));
        Bus c3 = new Bus("ISIZU", "c3", 7.0, new DriverD("Илья Борисюк", true, 4));
        Bus sprinter = new Bus("Mercedes", "Sprinter", 7.0, new DriverD("Семен Семенов", true, 5));
        Track kamazPlas = new Track("Камаз", "Камаз+", 9.0, new DriverC("Трубович Станислав", true, 9));
        Track s140 = new Track("Volvo", "s140", 12.0, new DriverC("Максим Струценко", true, 10));
        Track valday = new Track("Газель", "Валдай", 5.0, new DriverC("Дмитрий Епанчинцев", false, 7));
        Track j6 = new Track("Faw", "j6", 10.0, new DriverC("Дмитрий Епанчинцев", false, 7));
        Mechanic mechanic1 = new Mechanic("Иванов Иван", "drive");
        Mechanic mechanic2 = new Mechanic("Сидоров Виктор", "drive1");
        Mechanic mechanic3 = new Mechanic("Петров Петр", "drive2");
        granta.addMechanic(mechanic1);
        granta.addMechanic(mechanic2);
        granta.addMechanic(mechanic3);
        a8.addMechanic(mechanic1);
        z8.addMechanic(mechanic1);
        avante.addMechanic(mechanic1);
        a1.addMechanic(mechanic2);
        pazik.addMechanic(mechanic2);
        c3.addMechanic(mechanic2);
        sprinter.addMechanic(mechanic2);
        kamazPlas.addMechanic(mechanic3);
        s140.addMechanic(mechanic3);
        valday.addMechanic(mechanic3);
        j6.addMechanic(mechanic3);
        ArrayList<Transport> transports = new ArrayList<>();
        printInfoAllDrives(drivers);
        transports.add(granta);
        transports.add(a8);
        transports.add(z8);
        transports.add(avante);
        transports.add(a1);
        transports.add(pazik);
        transports.add(c3);
        transports.add(sprinter);
        transports.add(kamazPlas);
        transports.add(s140);
        transports.add(valday);
        transports.add(j6);
        j6.setType(TrackLoadCapacity.N1);
        pazik.setType(BusNumberSeats.EXTRA_LARGE);
        a8.setType(CarBodyType.COUPE);
        printInfoMechanic(granta);

      /*
        for (Transport transport : transports
        ) {
            try {
                transport.diagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                if (!transport.getDriver().isDrivingLicense()) {
                    throw new DrivingLicenseException("У Водителя нет прав", transport.getDriver());
                }
            } catch (DrivingLicenseException e) {
                System.out.println(" Для участия в гонке необходимы права");
                System.out.println(e.getDriver().getName() + " " + e.getMessage());

            }
        }*/
    }

    private static void printInfoAllDrives(Set drivers) {
        System.out.println("Список водителей" + drivers);
    }
    private static void printInfo(Transport transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getModel() + " и будет участвовать в заезде");
    }

    private static void printInfoMechanic(Transport transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getModel() + " и его ослуживает команда механиков" + transport.getMechanics());
    }
}