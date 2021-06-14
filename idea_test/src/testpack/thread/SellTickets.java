package testpack.thread;

public class SellTickets implements Runnable {
    private int tickets;
    private Object obj;

    public SellTickets() {
        tickets = 100;
        obj = new Object();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在售票，还剩" + (--tickets) + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
