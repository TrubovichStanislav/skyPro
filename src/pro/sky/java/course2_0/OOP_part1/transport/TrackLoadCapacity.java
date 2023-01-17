package pro.sky.java.course2_0.OOP_part1.transport;

public enum TrackLoadCapacity {
    N1("N1", null, BoundLoadCapacity.MIN_BOUND),
    N2("N2", BoundLoadCapacity.MIN_BOUND, BoundLoadCapacity.MAX_BOUND),
    N3("N3", BoundLoadCapacity.MAX_BOUND, null);
    private final BoundLoadCapacity lowerBoundLoadCapacity;
    private final BoundLoadCapacity topBoundLoadCapacity;
    private final String value;


    TrackLoadCapacity(String value, BoundLoadCapacity lowerBound, BoundLoadCapacity topBound) {
        this.value = value;
        this.lowerBoundLoadCapacity = lowerBound;
        this.topBoundLoadCapacity = topBound;

    }

    @Override
    public String toString() {
        if (lowerBoundLoadCapacity == null) {
            return "Грузоподъемность: до " + topBoundLoadCapacity + " тонн";
        } else if (topBoundLoadCapacity == null) {
            return "Грузоподъемность: свыше " + lowerBoundLoadCapacity + " тонн";
        } else {
            return "Грузоподъемность: от " + lowerBoundLoadCapacity + " тонн до " + topBoundLoadCapacity + "  тонн";
        }
    }

    private enum BoundLoadCapacity {

        MIN_BOUND(3.5f),
        MAX_BOUND(12.0f);
        private final float bound;

        BoundLoadCapacity(float bound) {
            this.bound = bound;
        }

        @Override
        public String toString() {
            return bound + "";
        }
    }
}
