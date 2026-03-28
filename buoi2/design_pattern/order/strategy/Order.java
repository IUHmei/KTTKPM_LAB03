package buoi2.design_pattern.order.strategy;

public class Order {
    private ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void shipOrder() {
        if (shippingStrategy == null) {
            System.out.println("Chưa chọn phương thức giao hàng!");
        } else {
            shippingStrategy.ship();
        }
    }
}