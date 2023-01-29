package pro.sky.java.course2_0.OOP_part1.Driver;

import pro.sky.java.course2_0.OOP_part1.Main;

import java.util.HashSet;
import java.util.Objects;

public abstract class Driver {
    private final String name;
    private boolean isDrivingLicense;
    private int experienceDrivingYear;


    public Driver(String name, boolean isDrivingLicense, int experienceDrivingYear) {
        this.name = name;
        this.isDrivingLicense = isDrivingLicense;
        this.experienceDrivingYear = experienceDrivingYear;
        Main.drivers.add(this);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();
}
