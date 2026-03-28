package buoi2.design_pattern.order.state;

public class ProcessingState implements OrderState {
    public void handle(Order order) {
        System.out.println("Trạng thái: Đang xử lý → Đóng gói và vận chuyển");

        order.setState(new DeliveredState());
    }
}