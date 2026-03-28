package buoi3.library;

public class ExtendTime extends BorrowDecorator {

    public ExtendTime(Borrow borrow) {
        super(borrow);
    }

    public void borrow() {
        borrow.borrow();
        System.out.println("Gia hạn thời gian");
    }
}
