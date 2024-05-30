package com.ps;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double checkout() {
        double total = 0.0;
        for (Product product : this.products) {
            total += product.calcPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}
