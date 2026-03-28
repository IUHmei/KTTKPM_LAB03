package buoi2.design_pattern.order.strategy;

public class EconomyShipping implements ShippingStrategy {
    @Override
    public void ship() {
        System.out.println("Giao hàng tiết kiệm (5-7 ngày)");
    }
}
