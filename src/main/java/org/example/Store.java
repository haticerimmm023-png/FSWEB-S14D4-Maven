package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 25.0, "Dark chocolate", "Bitter");
        products[1] = new Coke("Coke", 15.0, "Cold drink", 1.5);
        products[2] = new Bread("Bread", 10.0, "Fresh bread", 400);

        listProducts(products);
    }
}