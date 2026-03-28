package buoi2.design_pattern.order.decorator;

public class InsuranceDecorator extends OrderDecorator {

    public InsuranceDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Thêm bảo hiểm đơn hàng");
    }
}