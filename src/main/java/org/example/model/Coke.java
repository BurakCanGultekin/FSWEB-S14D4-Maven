package org.example.model;

public class Coke extends ProductForSale{
  private int miliLiter;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, int miliLiter) {
        super(type, price, description);
        this.miliLiter = miliLiter;
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Coke{" +
                "miliLiter=" + miliLiter +
                '}';
    }
}
