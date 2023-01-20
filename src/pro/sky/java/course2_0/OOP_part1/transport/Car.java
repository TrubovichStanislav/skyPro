package pro.sky.java.course2_0.OOP_part1.transport;


import pro.sky.java.course2_0.OOP_part1.Driver.DriverB;


public class Car extends Transport<DriverB> {
    private CarBodyType type;

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void diagnostics() {
        System.out.println("Автомобиль " + this.getModel() + " прошел диагностику");
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + this.getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + this.getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (this.getType() != null) {
            System.out.println(this.getType().toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + this.getModel() + " произвел Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 60;
        int maxBound = 90;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Автомобиль " + this.getModel() + " показал лучшее время круга " + bestLapTime + " секунд");

    }

    @Override
    public void maxSpeed() {
        int minBound = 180;
        int maxBound = 210;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Автомобиль " + this.getModel() + " показал максимальную скорость " + bestLapTime + " км/ч");
    }

    public CarBodyType getType() {
        return type;
    }

    public void setType(CarBodyType type) {
        this.type = type;
    }
}
