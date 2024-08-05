package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public class LilyBouquetFactory implements FlowerShopFactory {
    @Override
    public Flower createFlower() {
        return new Lily();
    }

    @Override
    public Packaging createPackaging() {
        return new GiftBox();
    }
}
