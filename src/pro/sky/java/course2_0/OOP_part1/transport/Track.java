package pro.sky.java.course2_0.OOP_part1.transport;

import pro.sky.java.course2_0.OOP_part1.Driver.DriverC;

public class Track extends Transport<DriverC> {
    private TrackLoadCapacity type;
    public Track(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + this.getModel() + " начал движение");
    }

    @Override
    public void diagnostics() {
        System.out.println("Грузовик " + this.getModel() + " прошел диагностику");
    }
    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + this.getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + this.getModel() + " произвел Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 120;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Грузовик " + this.getModel() + " показал лучшее время круга " + bestLapTime + " секунд");
    }

    @Override
    public void maxSpeed() {
        int minBound = 150;
        int maxBound = 180;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Грузовик " + this.getModel() + " показал максимальную скорость " + bestLapTime + " км/ч");
    }

    public TrackLoadCapacity getType() {
        return type;
    }

    public void setType(TrackLoadCapacity type) {
        this.type = type;
    }
    @Override
    public void printType() {
        if (this.getType() != null) {
            System.out.println(this.getType().toString());
        }else{
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
