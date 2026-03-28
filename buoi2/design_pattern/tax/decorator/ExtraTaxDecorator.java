package buoi2.design_pattern.tax.decorator;

import buoi2.design_pattern.tax.strategy.TaxStrategy;

public class ExtraTaxDecorator extends TaxDecorator {

    public ExtraTaxDecorator(TaxStrategy tax) {
        super(tax);
    }

    public double calculate(double price) {
        return tax.calculate(price) + 50;
    }
}