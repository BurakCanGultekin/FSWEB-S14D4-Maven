package org.example.model;

public class Chocolate extends ProductForSale{
    private double gram;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, double gram) {
        super(type, price, description);
        this.gram = gram;
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Chocolate{" +
                "gram=" + gram +
                '}';
    }
}
