package testpack.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thd1 = new MyThread("窗口1");
        MyThread thd2 = new MyThread("窗口2");
        MyThread thd3 = new MyThread("窗口3");
        thd1.start();
        thd2.start();
        thd3.start();
    }
}
