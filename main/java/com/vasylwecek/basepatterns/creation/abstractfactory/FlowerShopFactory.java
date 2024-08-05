package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public interface FlowerShopFactory {
    Flower createFlower();

    Packaging createPackaging();
}
