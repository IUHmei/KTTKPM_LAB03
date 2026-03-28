package buoi2.design_pattern.tax.state;

public class NormalState implements ProductState {
    public void handle() {
        System.out.println("Sản phẩm bình thường");
    }
}