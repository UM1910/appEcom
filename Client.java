package com.design.challenge;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        // Perform actions on the order
        order.addItem();
        // ...

        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("Shipping Cost: $" + order.getShippingCost());

        order.detach(priceObserver);
        order.detach(quantityObserver);
    }
}