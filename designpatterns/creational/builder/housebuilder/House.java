package practicedesignpatterns.builder.housebuilder;

public class House {

    private double area;
    private int numFloors;
    private int numRoomsPerFloor;
    private int numGatesPerFloor;
    private int numWindowsPerFloor;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    private House(Builder b) {
        this.area = b.area;
        this.numFloors = b.numFloors;
        this.numRoomsPerFloor = b.numRoomsPerFloor;
        this.numGatesPerFloor = b.numGatesPerFloor;
        this.numWindowsPerFloor = b.numWindowsPerFloor;
        this.hasGarage = b.hasGarage;
        this.hasSwimmingPool = b.hasSwimmingPool;
        this.hasFancyStatues = b.hasFancyStatues;
        this.hasGarden = b.hasGarden;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", numFloors=" + numFloors +
                ", numRoomsPerFloor=" + numRoomsPerFloor +
                ", numGatesPerFloor=" + numGatesPerFloor +
                ", numWindowsPerFloor=" + numWindowsPerFloor +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }

    static class Builder {
        private double area;
        private int numFloors;
        private int numRoomsPerFloor;
        private int numGatesPerFloor;
        private int numWindowsPerFloor;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasFancyStatues;
        private boolean hasGarden;

        public Builder setArea(double area) {
            this.area = area;
            return this;
        }

        public Builder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public Builder setNumRoomsPerFloor(int numRoomsPerFloor) {
            this.numRoomsPerFloor = numRoomsPerFloor;
            return this;
        }

        public Builder setNumGatesPerFloor(int numGatesPerFloor) {
            this.numGatesPerFloor = numGatesPerFloor;
            return this;
        }

        public Builder setNumWindowsPerFloor(int numWindowsPerFloor) {
            this.numWindowsPerFloor = numWindowsPerFloor;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setHasFancyStatues(boolean hasFancyStatues) {
            this.hasFancyStatues = hasFancyStatues;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
