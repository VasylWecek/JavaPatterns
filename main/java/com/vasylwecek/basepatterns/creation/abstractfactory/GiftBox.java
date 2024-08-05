package main.java.com.vasylwecek.basepatterns.creation.abstractfactory;

public class GiftBox implements Packaging{
    @Override
    public String getPackagingType() {
        return "Packing Gift Box";
    }
}
