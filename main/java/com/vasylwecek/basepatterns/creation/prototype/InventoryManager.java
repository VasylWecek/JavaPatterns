package main.java.com.vasylwecek.basepatterns.creation.prototype;

public class InventoryManager {
    public static void main(String[] args) {
        Product originalProduct = new Product(1, "Laptop", 1500.00);
        System.out.println("Original Product: " + originalProduct);

        ProductFactory productFactory = new ProductFactory(originalProduct);
        Product clonedProduct = productFactory.cloneProduct();
        System.out.println("Cloned Product: " + clonedProduct);

        clonedProduct = new Product(2, "Smartphone", 800.00);
        productFactory.setProduct(clonedProduct);
        Product anotherClonedProduct = productFactory.cloneProduct();
        System.out.println("Another Cloned Product: " + anotherClonedProduct);
    }
}

