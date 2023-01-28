package pro.sky.java.course2_0.OOP_part1.transport;

public enum CarBodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String valueRus;

    CarBodyType(String valueRus) {
        this.valueRus = valueRus;
    }

    @Override
    public String toString() {
        return "Тип кузова: <" + valueRus + ">";
    }
}
