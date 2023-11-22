package com.example.womenshop;

public class Stat {


    //initialisation du capital et des coûts
    //la valeur du capital est initialisée arbitrairement
    private static double capital = 10000;
    private static double cost = 0;



    //constructeur
    public Stat(double capital, double cost) {
        setCapital(capital);
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    // les couts seront ajustés à l'achat des articles
    public void adjustCost(double purchasePrice, int nbItems) {
        cost += purchasePrice * nbItems;
    }
    // si pas de quantité alors quantité =1
    public void adjustCost(double itemCost) {
        adjustCost(itemCost, 1);
    }
    //on peut initialiser ou réinitialiser les coûts
    public void setCost(double value) {
        if (value < 0) throw new IllegalArgumentException("Cost cannot be negative");
        cost = value;
        adjustCapital(-value);
    }

    public double getCapital() {
        return capital;
    }
    // le capital ne peut pas être nul
    public void setCapital(double value) {
        if (value < 0) throw new IllegalArgumentException("Capital cannot be negative");
        capital = value;
    }
    // on peut ajuster le capital :
    // ennoncé :
    // The capital changes also according to the costs and
    //incomes.
    public void adjustCapital(double value) {
        capital += value;
    }



}
