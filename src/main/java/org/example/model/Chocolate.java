package org.example.model;

public class Chocolate extends ProductForSale {

    private String flavor;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.flavor = "Classic";
    }

    public Chocolate(String type, double price, String description, String flavor) {
        super(type, price, description);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flavor: " + flavor);
    }
}