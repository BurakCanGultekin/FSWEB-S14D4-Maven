package org.example.model;

public class Bread extends ProductForSale {
    private double gram;

    public Bread(String type, double price, String description, double gram) {
        super(type, price, description);
        this.gram = gram;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Bread{" +
                "gram=" + gram +
                '}';
    }
}

