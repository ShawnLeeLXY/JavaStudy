package testpack.thread.box;

public class Box {
    private int milkBottle = 0;
    private boolean state = false;

    public Box() {
    }

    public synchronized void put(int milkBottle) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milkBottle = milkBottle;
        System.out.println("送奶工将第" + milkBottle + "瓶奶放入奶箱");
        state = true;
        notifyAll();
    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + milkBottle + "瓶奶");
        state = false;
        notifyAll();
    }
}
