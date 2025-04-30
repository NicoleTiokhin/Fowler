public enum PriceType {
    REGULAR {
        @Override
        public double getCharge(int daysRented) {
            if (daysRented > 2) return (daysRented - 2) * 1.5;
            return 2;
        }

        @Override
        public int getFrequentRenterPoints(int daysRented) {
            return 1;
        }
    },
    CHILDRENS {
        @Override
        public double getCharge(int daysRented) {
            if (daysRented > 3) return (daysRented - 3) * 1.5;
            return 1.5;
        }

        @Override
        public int getFrequentRenterPoints(int daysRented) {
            return 1;
        }
    },
    NEW_RELEASE {
        @Override
        public double getCharge(int daysRented) {
            return daysRented * 3;
        }

        @Override
        public int getFrequentRenterPoints(int daysRented) {
            return 2;
        }
    };

    public abstract double getCharge(int daysRented);
    public abstract int getFrequentRenterPoints(int daysRented);
}