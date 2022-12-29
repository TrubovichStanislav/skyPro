package pro.sky.java.course2_0.OOP_part1;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (model == null || model.equals("")) {
            this.model = "default";
        }
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        }
        if (Double.compare(engineVolume,0.0)==0) {
            this.engineVolume = 1.5;

        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
