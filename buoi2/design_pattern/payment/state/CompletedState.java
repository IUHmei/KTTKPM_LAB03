package buoi2.design_pattern.payment.state;
public class CompletedState implements PaymentState {
    public void handle() {
        System.out.println("Thanh toán thành công");
    }
}