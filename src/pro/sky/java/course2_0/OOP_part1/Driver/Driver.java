package pro.sky.java.course2_0.OOP_part1.Driver;

public abstract class Driver {
    private final String name;
    private boolean isDrivingLicense;
    private int experienceDrivingYear;

    public Driver(String name, boolean isDrivingLicense, int experienceDrivingYear) {
        this.name = name;
        this.isDrivingLicense = isDrivingLicense;
        this.experienceDrivingYear = experienceDrivingYear;
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

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuel();
}
