package org.example;

import java.util.List;

public class OrderCalculator {
  public double calculateTotal(List<Order> orders) {
      double total = 0.0;
      for (Order order : orders) {
          total += order.getTotalPrice();
      }
      return total;
  }


}
