package buoi2.design_pattern.order.decorator;

public class BasicOrder implements OrderComponent {

    @Override
    public void process() {
        System.out.println("Xử lý đơn hàng cơ bản");
    }
}
