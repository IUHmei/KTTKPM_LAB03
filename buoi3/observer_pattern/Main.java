package buoi3.observer_pattern;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer a = new Investor("A");
        Observer b = new Investor("B");

        stock.attach(a);
        stock.attach(b);

        stock.setPrice(100);
    }
}