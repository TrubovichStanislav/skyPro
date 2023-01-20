package pro.sky.java.course2_0.OOP_part1.transport;

import pro.sky.java.course2_0.OOP_part1.Driver.DriverD;

public class Bus extends Transport<DriverD> {

    private BusNumberSeats type;

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void diagnostics()throws Exception   {
        throw new Exception("Объекты класса «Автобусы» диагностику проходить не могут");
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус " + this.getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + this.getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + this.getModel() + " произвел Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 120;
        int maxBound = 150;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Автобус " + this.getModel() + " показал лучшее время круга " + bestLapTime + " секунд");
    }

    @Override
    public void maxSpeed() {
        int minBound = 120;
        int maxBound = 150;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Автобус " + this.getModel() + " показал максимальную скорость " + bestLapTime + " км/ч");
    }

    public BusNumberSeats getType() {
        return type;
    }

    public void setType(BusNumberSeats type) {
        this.type = type;
    }

    @Override
    public void printType() {
        if (this.getType() != null) {
            System.out.println(this.getType().toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
