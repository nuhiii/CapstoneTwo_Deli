package com.ps;

public abstract class Product {
    protected double price;

    public abstract double calcPrice();

    public double getPrice() {
        return price;
    }
}
