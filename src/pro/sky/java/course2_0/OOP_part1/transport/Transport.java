package pro.sky.java.course2_0.OOP_part1.transport;

import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int yearProduction;
    private final String countryAssembly;
    private String color;

    private int maxSpeed;

    public Transport(String brand, String model, int yearProduction, String countryAssembly, String color, int maxSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (countryAssembly != null && !countryAssembly.isEmpty() && !countryAssembly.isBlank()) {
            this.countryAssembly = countryAssembly;
        } else {
            this.countryAssembly = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (yearProduction > 0) {
            this.yearProduction = yearProduction;
        } else {
            this.yearProduction = 2000;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 80;
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 80;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getCountryAssembly() {
        return countryAssembly;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", countryAssembly='" + countryAssembly + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearProduction == transport.yearProduction && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(countryAssembly, transport.countryAssembly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearProduction, countryAssembly);
    }
}


