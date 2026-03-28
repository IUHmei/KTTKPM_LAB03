package buoi2.design_pattern.payment.decorator;

import buoi2.design_pattern.payment.strategy.PaymentStrategy;

public class FeeDecorator extends PaymentDecorator {

    public FeeDecorator(PaymentStrategy payment) {
        super(payment);
    }

    public void pay(int amount) {
        amount += 10;
        payment.pay(amount);
        System.out.println("Thêm phí xử lý");
    }
}
