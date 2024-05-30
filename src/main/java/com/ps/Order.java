package com.ps;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<Product> products;
    private String orderID;

    public Order() {
        this.orderID = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void orderDetails() {
        double total = 0.0;
        for (Product product : this.products) {
            System.out.println(product);
            total += product.calcPrice();
        }
        System.out.println("Total Price: $" + total);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public String getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderID).append("\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }
}
