package com.design.challenge;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1); // Set the order ID

        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        // Perform actions on the order
        order.addItem(50.0); // Adding an item with a price of 50.0
        order.addItem(100.0); // Adding an item with a price of 100.0

        System.out.println(order);

        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("Shipping Cost: $" + order.getShippingCost());

        order.detach(priceObserver);
        order.detach(quantityObserver);

        // Perform more actions on the order
        order.addItem(75.0); // Adding an item with a price of 75.0

        System.out.println(order);

        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("Shipping Cost: $" + order.getShippingCost());
    }
}
