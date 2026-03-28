package buoi2.design_pattern.order.state;

public interface OrderState {
    void handle(Order context);
}