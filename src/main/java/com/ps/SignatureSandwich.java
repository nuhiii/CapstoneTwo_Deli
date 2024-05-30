package com.ps;

public abstract class SignatureSandwich extends Sandwich {
    public SignatureSandwich(String size, String bread, boolean toasted) {
        super(size, bread, toasted);
        addSignatureToppings();
    }

    protected abstract void addSignatureToppings();
}
