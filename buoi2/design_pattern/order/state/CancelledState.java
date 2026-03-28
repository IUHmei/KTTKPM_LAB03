package buoi2.design_pattern.order.state;

public class CancelledState implements OrderState {
    public void handle(Order order) {
        System.out.println("Trạng thái: Đã hủy → Hoàn tiền");
    }
}