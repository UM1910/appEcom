package com.design.challenge;

import java.util.ArrayList;
import java.util.List;


class Order {
    private int id;
    private int quantity;
    private double price;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;

    public Order() {
        observers = new ArrayList<>();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.updated(this);
        }
    }

    public void addItem(double price) {
        // Add item to the order
        // ...
        // Update itemCount and itemCost properties
        quantity++;
        this.price = price;
        totalPrice += price;

        // Notify observers after adding the item
        notifyObservers();
    }

    public int getItemCount() {
        // Return the count of items in the order
        // ...
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
    }

    private class Item {
        // Item details
    }
}
