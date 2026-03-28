package buoi2.design_pattern.tax;

import buoi2.design_pattern.tax.decorator.ExtraTaxDecorator;
import buoi2.design_pattern.tax.state.LuxuryState;
import buoi2.design_pattern.tax.strategy.LuxuryTax;
import buoi2.design_pattern.tax.strategy.TaxStrategy;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1000);

        // State
        product.setState(new LuxuryState());

        // Strategy + Decorator
        TaxStrategy tax = new LuxuryTax();
        tax = new ExtraTaxDecorator(tax);

        product.setTaxStrategy(tax);

        product.calculateTax();
    }
}