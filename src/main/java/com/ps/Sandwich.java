package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String size;
    private String bread;
    private List<Topping> toppings = new ArrayList<>();
    private boolean toasted;

    public Sandwich(String size, String bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    protected double calcPrice() {
        price = 0.0;
        switch (size) {
            case "4\"":
                price += 5.50;
                break;
            case "8\"":
                price += 7.00;
                break;
            case "12\"":
                price += 8.50;
                break;
        }

        for (Topping topping : toppings) {
            if (topping.getType().equals("Meat")) {
                switch (size) {
                    case "4\"":
                        price += 1.00;
                        break;
                    case "8\"":
                        price += 2.00;
                        break;
                    case "12\"":
                        price += 3.00;
                        break;
                }
                if (topping.isExtra()) {
                    switch (size) {
                        case "4\"":
                            price += 0.50;
                            break;
                        case "8\"":
                            price += 1.00;
                            break;
                        case "12\"":
                            price += 1.50;
                            break;
                    }
                }
            } else if (topping.getType().equals("Cheese")) {
                switch (size) {
                    case "4\"":
                        price += 0.75;
                        break;
                    case "8\"":
                        price += 1.50;
                        break;
                    case "12\"":
                        price += 2.25;
                        break;
                }
                if (topping.isExtra()) {
                    switch (size) {
                        case "4\"":
                            price += 0.30;
                            break;
                        case "8\"":
                            price += 0.60;
                            break;
                        case "12\"":
                            price += 0.90;
                            break;
                    }
                }
            }
        }
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(bread).append(" sandwich");
        if (toasted) sb.append(" (toasted)");
        sb.append(" with ");
        for (Topping topping : toppings) {
            sb.append(topping.getName());
            if (topping.isPremium()) {
                sb.append(" (premium)");
            }
            if (topping.isExtra()) {
                sb.append(" (extra)");
            }
            sb.append(", ");
        }
        sb.append("[END]");
        return sb.toString();
    }
}
