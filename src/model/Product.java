package model;

public class Product {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private double price;

    public Product(int id, String name, String category, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters omitted for brevity
    public String toString() {
        return String.format("ID: %d | Name: %s | Category: %s | Quantity: %d | Price: %.2f", id, name, category, quantity, price);
    }
}