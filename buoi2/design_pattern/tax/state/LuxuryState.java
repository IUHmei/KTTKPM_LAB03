package buoi2.design_pattern.tax.state;

public class LuxuryState implements ProductState {
    public void handle() {
        System.out.println("Sản phẩm xa xỉ");
    }
}
