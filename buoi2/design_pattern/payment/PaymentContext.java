package buoi2.design_pattern.payment;

import buoi2.design_pattern.payment.state.PaymentState;
import buoi2.design_pattern.payment.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;
    private PaymentState state;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void pay(int amount) {
        state.handle();
        strategy.pay(amount);
    }
}