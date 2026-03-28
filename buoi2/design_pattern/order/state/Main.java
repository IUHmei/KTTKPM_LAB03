package buoi2.design_pattern.order.state;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.nextStep(); // New → Processing
        order.nextStep(); // Processing → Delivered
        order.nextStep(); // Delivered

        // test single Processing → Delivered 
        System.out.println("\n--- Test Processing → Delivered ---");
        Order order2 = new Order();
        order2.setState(new ProcessingState());
        order2.nextStep();

        // test single hủy
        System.out.println("\n--- Test Hủy ---");
        Order order3 = new Order();
        order3.setState(new CancelledState());
        order3.nextStep();
    }
}