package buoi2.design_pattern.payment.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán bằng thẻ: " + amount);
    }
}