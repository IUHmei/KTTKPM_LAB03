package buoi2.design_pattern.payment;

import buoi2.design_pattern.payment.decorator.DiscountDecorator;
import buoi2.design_pattern.payment.decorator.FeeDecorator;
import buoi2.design_pattern.payment.state.CompletedState;
import buoi2.design_pattern.payment.strategy.CreditCardPayment;
import buoi2.design_pattern.payment.strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setState(new CompletedState());

        PaymentStrategy payment = new CreditCardPayment();

        // thêm decorator
        payment = new FeeDecorator(payment);
        payment = new DiscountDecorator(payment);

        context.setStrategy(payment);

        context.pay(100);
    }
}