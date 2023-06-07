package com.design.challenge;
class PriceObserver implements OrderObserver {
    private static final double DISCOUNT_AMOUNT = 20.0;
    private static final double THRESHOLD_PRICE = 200.0;

    @Override
    public void updated(Order order) {
        double totalPrice = order.getTotalPrice();
        if (totalPrice > THRESHOLD_PRICE) {
            totalPrice -= DISCOUNT_AMOUNT;
            order.setTotalPrice(totalPrice);
        }
    }
}