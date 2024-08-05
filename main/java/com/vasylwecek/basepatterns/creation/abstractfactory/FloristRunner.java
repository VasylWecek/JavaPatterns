package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public class FloristRunner {
    public static void main(String[] args) {
        FlowerShopFactory roseFactory = create("rose");
        FlowerShopFactory tulipFactory = create("tulip");
        FlowerShopFactory lilyFactory = create("lily");

        Flower rose = roseFactory.createFlower();
        Packaging rosePackaging = roseFactory.createPackaging();

        Flower tulip = tulipFactory.createFlower();
        Packaging tulipPackaging = tulipFactory.createPackaging();

        Flower lily = lilyFactory.createFlower();
        Packaging lilyPackaging = lilyFactory.createPackaging();

        System.out.println("Bouquet 1: " + rose.getName() + " in " + rosePackaging.getPackagingType());
        System.out.println("Bouquet 2: " + tulip.getName() + " in " + tulipPackaging.getPackagingType());
        System.out.println("Bouquet 3: " + lily.getName() + " in " + lilyPackaging.getPackagingType());
    }

    static FlowerShopFactory create(String specialty) {
        if (specialty.equalsIgnoreCase("rose")){
            return new RoseBouquetFactory();
        } else if (specialty.equalsIgnoreCase("tulip")){
            return new TulipBouquetFactory();
        } else if (specialty.equalsIgnoreCase("lily")){
            return new LilyBouquetFactory();
        } else {
            throw new RuntimeException(specialty + " is not a valid specialty");
        }
    }
}
