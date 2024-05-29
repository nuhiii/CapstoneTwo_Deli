package com.ps;

public class Topping {
    private String name;
    private String type;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String name, String type, boolean isPremium, boolean isExtra) {
        this.name = name;
        this.type = type;
        this.isPremium = isPremium;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
}
