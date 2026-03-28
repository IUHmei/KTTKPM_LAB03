package buoi2.design_pattern.order.decorator;

public class GiftWrapDecorator extends OrderDecorator {

    public GiftWrapDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Thêm gói quà");
    }
}
