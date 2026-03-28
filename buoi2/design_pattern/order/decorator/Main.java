package buoi2.design_pattern.order.decorator;

public class Main {
    public static void main(String[] args) {

        // Đơn cơ bản
        OrderComponent order = new BasicOrder();

        System.out.println("=== Đơn cơ bản ===");
        order.process();

        // Thêm bảo hiểm
        System.out.println("\n=== Đơn + bảo hiểm ===");
        order = new InsuranceDecorator(order);
        order.process();

        // Thêm gói quà + bảo hiểm
        System.out.println("\n=== Đơn + bảo hiểm + gói quà ===");
        order = new GiftWrapDecorator(order);
        order.process();
    }
}
