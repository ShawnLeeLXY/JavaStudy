package testpack.thread;

public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets mr = new SellTickets();
        Thread thd1 = new Thread(mr, "窗口1");
        Thread thd2 = new Thread(mr, "窗口2");
        Thread thd3 = new Thread(mr, "窗口3");
        thd1.start();
        thd2.start();
        thd3.start();
    }
}
