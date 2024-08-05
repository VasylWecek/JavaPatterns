package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public class TulipBouquetFactory implements FlowerShopFactory {
    @Override
    public Flower createFlower() {
        return new Tulip();
    }

    @Override
    public Packaging createPackaging() {
        return new PlasticWrap();
    }
}
