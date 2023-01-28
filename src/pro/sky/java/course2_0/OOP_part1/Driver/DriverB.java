package pro.sky.java.course2_0.OOP_part1.Driver;

public class DriverB extends Driver {
    public DriverB(String name, boolean isDrivingLicense, int experienceDrivingYear) {
        super(name, isDrivingLicense, experienceDrivingYear);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории B " + getName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории B " + getName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getName() + " заправился");
    }
}
