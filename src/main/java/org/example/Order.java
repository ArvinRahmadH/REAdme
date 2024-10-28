package org.example;
public class Order {
    private String itemName;
    private int quantity;
    private double price;

    public Order(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    // Method untuk mendapatkan total harga item
    public double getTotalPrice() {
        return quantity * price;
    }
}
