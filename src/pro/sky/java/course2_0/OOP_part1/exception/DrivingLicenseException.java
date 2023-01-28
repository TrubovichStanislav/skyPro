package pro.sky.java.course2_0.OOP_part1.exception;

import pro.sky.java.course2_0.OOP_part1.Driver.Driver;

public class DrivingLicenseException extends Exception{
    private final Driver driver;

    public DrivingLicenseException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return  driver.getName();
    }
}
