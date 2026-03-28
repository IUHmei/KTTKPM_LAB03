package buoi2.design_pattern.tax;

import buoi2.design_pattern.tax.state.ProductState;
import buoi2.design_pattern.tax.strategy.TaxStrategy;

public class Product {
    private double price;
    private TaxStrategy taxStrategy;
    private ProductState state;

    public Product(double price) {
        this.price = price;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void calculateTax() {
        state.handle();
        double tax = taxStrategy.calculate(price);
        System.out.println("Thuế phải trả: " + tax);
    }
}
