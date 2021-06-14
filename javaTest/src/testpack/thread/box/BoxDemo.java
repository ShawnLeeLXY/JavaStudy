package testpack.thread.box;

public class BoxDemo {
    public static void main(String[] args) {
        int num = 10;
        Box box = new Box();
        Producer producer = new Producer(num, box);
        Customer customer = new Customer(num, box);
        Thread thd1 = new Thread(producer);
        Thread thd2 = new Thread(customer);
        thd1.start();
        thd2.start();
    }
}
