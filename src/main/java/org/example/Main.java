package org.example;

import org.example.Order;
import org.example.OrderCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        // Tambah item
        orders.add(new Order("Nasi Goreng", 2, 15000));
        orders.add(new Order("Ayam Bakar", 1, 25000));
        orders.add(new Order("Es Teh", 3, 5000));

        // Kalkulasi total harga
        OrderCalculator calculator = new OrderCalculator();
        double totalAmount = calculator.calculateTotal(orders);

        System.out.println("Nota Pemesanan:");
        for (Order order : orders) {
            System.out.printf("%s x%d - Rp%.2f\n", order.getItemName(), order.getQuantity(), order.getTotalPrice());
        }
        System.out.printf("Total: Rp%.2f\n", totalAmount);
        System.out.println(" hshsh");


    }
}
