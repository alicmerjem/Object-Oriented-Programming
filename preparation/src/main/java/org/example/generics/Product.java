package org.example.generics;
import java.util.*;

public class Product {
    private int productId;
    private String name;

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
}

class Electronics extends Product {
    public Electronics(int productId, String name) {
        super(productId, name);
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name) {
        super(productId, name);
    }
}

class Inventory <T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> filterByName(String name) {
        List<T> result = new ArrayList<>();

        for (T product : products) {
            if(product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }

        return result;
    }

    public T getByProductId(int productId) {
        for (T product : products) {
            if(product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }
}
