package buoi2.design_pattern.order.state;

public class NewState implements OrderState {
    public void handle(Order order) {
        System.out.println("Trạng thái: Mới tạo → Kiểm tra đơn hàng");

        // chuyển sang trạng thái tiếp theo
        order.setState(new ProcessingState());
    }
}