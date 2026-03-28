package buoi2.design_pattern.order.strategy;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        // Giao nhanh
        order.setShippingStrategy(new FastShipping());
        order.shipOrder();

        // Giao tiết kiệm
        order.setShippingStrategy(new EconomyShipping());
        order.shipOrder();
    }
}
