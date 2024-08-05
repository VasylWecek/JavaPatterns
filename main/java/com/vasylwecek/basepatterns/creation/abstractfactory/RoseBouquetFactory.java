package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public class RoseBouquetFactory implements FlowerShopFactory {
    @Override
    public Flower createFlower() {
        return new Rose();
    }

    @Override
    public Packaging createPackaging() {
        return new PaperWrap();
    }
}

