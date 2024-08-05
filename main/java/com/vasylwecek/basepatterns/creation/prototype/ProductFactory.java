package main.java.com.vasylwecek.basepatterns.creation.prototype;

public class ProductFactory {
    private Product product;

    public ProductFactory(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product cloneProduct() {
        return (Product) product.copy();
    }
}
