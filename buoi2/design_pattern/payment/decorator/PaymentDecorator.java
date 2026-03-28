package buoi2.design_pattern.payment.decorator;

import buoi2.design_pattern.payment.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy payment;

    public PaymentDecorator(PaymentStrategy payment) {
        this.payment = payment;
    }
}
