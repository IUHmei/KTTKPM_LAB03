package buoi2.design_pattern.tax.decorator;

import buoi2.design_pattern.tax.strategy.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {
    protected TaxStrategy tax;

    public TaxDecorator(TaxStrategy tax) {
        this.tax = tax;
    }
}