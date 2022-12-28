package practicedesignpatterns.builder.housebuilder;

public class Client {

    public static void main(String[] args) {
        House h1 = House.getBuilder()
                .setArea(4000)
                .setNumFloors(2)
                .setNumRoomsPerFloor(3)
                .setNumGatesPerFloor(8)
                .setNumWindowsPerFloor(6)
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .setHasFancyStatues(true)
                .setHasGarden(true)
                .build();

        House h2 = House.getBuilder()
                .setArea(2000)
                .setNumFloors(2)
                .setNumRoomsPerFloor(3)
                .setNumGatesPerFloor(8)
                .setNumWindowsPerFloor(6)
                .setHasGarage(true)
                .build();

        System.out.println(h1.toString());
        System.out.println(h2.toString());

    }

}
