package buoi2.design_pattern.order.strategy;

public class FastShipping implements ShippingStrategy {
    @Override
    public void ship() {
        System.out.println("Giao hàng nhanh (1-2 ngày)");
    }
}