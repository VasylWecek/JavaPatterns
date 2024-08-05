package main.java.com.vasylwecek.basepatterns.creation.build;


public class BuildingBuilderExample {

    public static void main(String[] args) {
        // Создание объекта здания с помощью Builder
        Building building = new Building.Builder()
                .setFoundation("Concrete")
                .setStructure("Steel and Concrete")
                .setRoof("Metal")
                .setFloors(5)
                .setHasGarage(true)
                .setHasSwimmingPool(false)
                .setHasGarden(true)
                .build();

        System.out.println(building);
    }
}
