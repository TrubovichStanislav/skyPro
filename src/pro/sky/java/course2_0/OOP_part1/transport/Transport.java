package pro.sky.java.course2_0.OOP_part1.transport;

import pro.sky.java.course2_0.OOP_part1.Driver.Driver;
import pro.sky.java.course2_0.OOP_part1.Mechanic;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;
    private final List<Mechanic> mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (Double.compare(engineVolume, 0.0) == 0 || engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.driver = driver;
    }

    public abstract void diagnostics() throws Exception;

    public abstract void startMoving();

    public abstract void stopMoving();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0.0) == 0 || engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public abstract void printType();

    @Override
    public String toString() {
        return "Transport{" +
                "Бренд='" + brand + '\'' +
                ", Модель='" + model + '\'' +
                ", Объем двигателя=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

}


