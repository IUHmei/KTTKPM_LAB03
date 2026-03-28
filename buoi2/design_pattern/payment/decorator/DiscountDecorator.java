package buoi2.design_pattern.payment.decorator;

import buoi2.design_pattern.payment.strategy.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator {

    public DiscountDecorator(PaymentStrategy payment) {
        super(payment);
    }

    public void pay(int amount) {
        amount -= 20;
        payment.pay(amount);
        System.out.println("Áp dụng giảm giá");
    }
}
