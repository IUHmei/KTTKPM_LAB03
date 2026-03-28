package buoi2.design_pattern.order.decorator;

public abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent order;

    public OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    @Override
    public void process() {
        order.process();
    }
}
