package org.example.model;

public class Store {
    public static void main(String[] args) {
     ProductForSale[] productForSale = new ProductForSale[3];
        ProductForSale chocolate = new Chocolate("Eatable", 10, "Milky Chocolate",100);
        ProductForSale coke = new Coke("Drinkable", 5, "Light Coke",330);
        ProductForSale bread = new Bread("Eatable", 2, "White Bread",250);
        productForSale[0] = chocolate;
        productForSale[1] = coke;
        productForSale[2] = bread;

    listProducts(productForSale);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products ){
            product.showDetails();
        }

        //((products)products[]).forEach((product) -> product.showDetails());
    }
}