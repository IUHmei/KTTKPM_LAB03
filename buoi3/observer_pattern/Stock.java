package buoi3.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private int price;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update("Giá mới: " + price);
        }
    }
}
