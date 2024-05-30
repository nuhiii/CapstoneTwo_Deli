package com.ps;

public abstract class Product {
    protected double price;

    public double getPrice() {
        return calcPrice();
    }

    public abstract double calcPrice();
    public abstract String toString();
}
