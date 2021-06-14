package testpack.thread.box;

public class Producer implements Runnable {
    private int num;
    private Box box;

    public Producer(int num, Box box) {
        this.num = num;
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            box.put(i + 1);
        }
    }
}
