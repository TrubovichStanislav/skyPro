package pro.sky.java.course2_0.OOP_part1.Driver;

import java.util.HashSet;

public abstract class Driver {
    private final String name;
    private boolean isDrivingLicense;
    private int experienceDrivingYear;
    private final static HashSet<Driver> drivers = new HashSet<>();

    public Driver(String name, boolean isDrivingLicense, int experienceDrivingYear) {
        this.name = name;
        this.isDrivingLicense = isDrivingLicense;
        this.experienceDrivingYear = experienceDrivingYear;
        drivers.add(this);
    }

    public String getName() {
        return name;
    }

    public boolean isDrivingLicense() {
        return isDrivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        isDrivingLicense = drivingLicense;
    }

    public int getExperienceDrivingYear() {
        return experienceDrivingYear;
    }

    public void setExperienceDrivingYear(int experienceDrivingYear) {
        this.experienceDrivingYear = experienceDrivingYear;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void printInfoAllDrives() {
        System.out.println("Список водителей" + drivers);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();
}
