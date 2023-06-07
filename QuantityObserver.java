package com.design.challenge;
class QuantityObserver implements OrderObserver {
    private static final int THRESHOLD_QUANTITY = 5;
    private static final double DEFAULT_SHIPPING_COST = 10.0;
    private static final double ZERO_SHIPPING_COST = 0.0;

    @Override
    public void updated(Order order) {
        int itemCount = order.getItemCount();
        if (itemCount > THRESHOLD_QUANTITY) {
            order.setShippingCost(ZERO_SHIPPING_COST);
        } else {
            order.setShippingCost(DEFAULT_SHIPPING_COST);
        }
    }
}