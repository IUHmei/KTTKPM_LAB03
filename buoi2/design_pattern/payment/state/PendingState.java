package buoi2.design_pattern.payment.state;

public class PendingState implements PaymentState {
    public void handle() {
        System.out.println("Đang chờ thanh toán");
    }
}