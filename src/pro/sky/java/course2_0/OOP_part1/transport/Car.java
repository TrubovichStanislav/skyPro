package pro.sky.java.course2_0.OOP_part1.transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int yearProduction;
    private final String countryAssembly;
    private String transmission;
    private final String bodyType;
    private String numberRegistration;
    private final int countPlaces;
    private boolean isTiresWinter;
    private Key key;
    public static final String TIRES_WINTER = "Установлена зимняя ризина";
    public static final String TIRES_SUMMER = "Установлена летняя ризина";

    public static class Key {
        private final boolean isRemoteEngineStart;
        private final boolean isKeylessEntry;


        public Key(boolean isRemoteEngineStart, boolean isKeylessEntry) {

            this.isRemoteEngineStart = isRemoteEngineStart;
            this.isKeylessEntry = isKeylessEntry;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return isKeylessEntry;
        }

    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int yearProduction,
               String countryAssembly,
               String transmission,
               String bodyType,
               String numberRegistration,
               int countPlaces,
               boolean isTiresWinter,
               Key key) {

        /*        if (key != null) {
            this.key = key;
        } else {
            this.key = new Key(false, false);
        }*/
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "механика";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "сидан";
        }
        if (numberRegistration != null && !numberRegistration.isEmpty() && !numberRegistration.isBlank()) {
            this.numberRegistration = numberRegistration;
        } else {
            this.numberRegistration = "x000xx000";
        }
        if (countPlaces > 0) {
            this.countPlaces = countPlaces;
        } else {
            this.countPlaces = 5;
        }
        this.isTiresWinter = isTiresWinter;
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
        if (Double.compare(engineVolume, 0.0) == 0 || engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public String changeTiresSeasonal() {
        LocalDate localDate = LocalDate.now();
        int currentMonth = localDate.getMonthValue();

        switch (currentMonth) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 10:
            case 11:
            case 12:
                isTiresWinter = true;
                return TIRES_WINTER;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                isTiresWinter = false;
                return TIRES_SUMMER;
            default:
                return "Непредвиденая ошибка";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + brand + '\'' +
                ", Модель='" + model + '\'' +
                ", Объем двигателя=" + engineVolume +
                ", Цвет='" + color + '\'' +
                ", Год выпуска=" + yearProduction +
                ", трана производства='" + countryAssembly + '\'' +
                ", коробка передач='" + transmission + '\'' +
                ", Тип кузова='" + bodyType + '\'' +
                ", рег номер='" + numberRegistration + '\'' +
                ", количество мест=" + countPlaces +
                (isTiresWinter ? ", Зимняя резина" : ", Летния резина") +
                (key.isKeylessEntry ? ", Безключевой доступ" : ", нет бесключевого доступа") +
                (key.isRemoteEngineStart ? ", Удаленный запуск" : ", нет удаленного запуска") +
                '}';
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

    public String getBodyType() {
        return bodyType;
    }

    public int getCountPlaces() {
        return countPlaces;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "механика";
        }
    }

    public String getNumberRegistration() {
        return numberRegistration;
    }

    public void setNumberRegistration(String numberRegistration) {
        if (numberRegistration != null && !numberRegistration.isEmpty() && !numberRegistration.isBlank()) {
            this.numberRegistration = numberRegistration;
        } else {
            this.numberRegistration = "x000xx000";
        }
    }

    public boolean isTiresWinter() {
        return isTiresWinter;
    }

    public void setTiresWinter(boolean tiresWinter) {
        isTiresWinter = tiresWinter;
    }
}
