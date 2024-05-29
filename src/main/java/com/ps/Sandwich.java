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

    @Override
    public double calcPrice() {
        double total = 0.0;
        switch (size) {
            case "4\"":
                total += 5.50;
                break;
            case "8\"":
                total += 7.00;
                break;
            case "12\"":
                total += 8.50;
                break;
        }

        for (Topping topping : toppings) {
            if (topping.getType().equals("Meat")) {
                if (topping.isExtra()) {
                    switch (size) {
                        case "4\"":
                            total += 0.50;
                            break;
                        case "8\"":
                            total += 1.00;
                            break;
                        case "12\"":
                            total += 1.50;
                            break;
                    }
                } else {
                    switch (size) {
                        case "4\"":
                            total += 1.00;
                            break;
                        case "8\"":
                            total += 2.00;
                            break;
                        case "12\"":
                            total += 3.00;
                            break;
                    }
                }
            } else if (topping.getType().equals("Cheese")) {
                if (topping.isExtra()) {
                    switch (size) {
                        case "4\"":
                            total += 0.30;
                            break;
                        case "8\"":
                            total += 0.60;
                            break;
                        case "12\"":
                            total += 0.90;
                            break;
                    }
                } else {
                    switch (size) {
                        case "4\"":
                            total += 0.75;
                            break;
                        case "8\"":
                            total += 1.50;
                            break;
                        case "12\"":
                            total += 2.25;
                            break;
                    }
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size='" + size + '\'' +
                ", bread='" + bread + '\'' +
                ", toppings=" + toppings +
                ", toasted=" + toasted +
                ", price=" + price +
                '}';
    }
}
