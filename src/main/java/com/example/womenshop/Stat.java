package com.example.womenshop;

public class Stat {

    private static double capital = 10000;
    private static double cost = 0;


    public Stat(double capital, double cost) {
        setCapital(capital);
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    public void adjustCost(double itemCost, int nbItems) {
        cost += itemCost * nbItems;
    }

    public void adjustCost(double itemCost) {
        adjustCost(itemCost, 1);
    }

    public void setCost(double value) {
        if (value < 0) throw new IllegalArgumentException("Cost cannot be negative");
        cost = value;
        adjustCapital(-value);
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double value) {
        if (value < 0) throw new IllegalArgumentException("Capital cannot be negative");
        capital = value;
    }

    public void adjustCapital(double value) {
        capital += value;
    }



}
