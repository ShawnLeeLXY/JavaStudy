package PlayerAndCoach;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃菜");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何投篮和运球");
    }
}
