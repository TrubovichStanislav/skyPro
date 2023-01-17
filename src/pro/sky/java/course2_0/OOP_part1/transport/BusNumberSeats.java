package pro.sky.java.course2_0.OOP_part1.transport;

public enum BusNumberSeats {

    EXTRA_SMALL("особо малая", null, NumberSeats.SEATS_TEN),
    SMALL("малая", NumberSeats.SEATS_TEN, NumberSeats.SEATS_TWENTY_FIVE),
    MIDDLE("средняя", NumberSeats.SEATS_FORTY, NumberSeats.SEATS_FIFTY),
    LARGE("большая", NumberSeats.SEATS_SIXTY, NumberSeats.SEATS_EIGHTY),
    EXTRA_LARGE("особо большая", NumberSeats.SEATS_ONE_HUNDRED, NumberSeats.SEATS_SEATS_ONE_HUNDRED_TWENTY);
    private final String value;
    private final NumberSeats lowerBound;
    private final NumberSeats topBound;

    BusNumberSeats(String value, NumberSeats lowerBound, NumberSeats topBound) {
        this.value = value;
        this.lowerBound = lowerBound;
        this.topBound = topBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Вместимость: до " + topBound + "мест";
        } else if (topBound == null) {
            return "Вместимость: более " + lowerBound + "мест";
        } else {
            return "Вместимость: " + lowerBound + " - " + topBound + " мест";
        }
    }

    private enum NumberSeats {
        SEATS_TEN(10),
        SEATS_TWENTY_FIVE(25),
        SEATS_FORTY(40),
        SEATS_FIFTY(50),
        SEATS_SIXTY(60),
        SEATS_EIGHTY(80),
        SEATS_ONE_HUNDRED(100),
        SEATS_SEATS_ONE_HUNDRED_TWENTY(120);
        private final int numberSeats;

        NumberSeats(int numberSeats) {
            this.numberSeats = numberSeats;
        }

        @Override
        public String toString() {
            return numberSeats + "";
        }
    }
}
