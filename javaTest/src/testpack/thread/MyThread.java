package testpack.thread;

public class MyThread extends Thread {
    private int tickets;

    public MyThread() {
        tickets = 100;
    }

    public MyThread(String name) {
        super(name);
        tickets = 100;
    }

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(getName() + "正在售票，还剩" + (--tickets) + "张票");
        }
    }
}
