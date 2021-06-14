package PlayerAndCoach;

public class PingpongPlayer extends Player implements SpeakEnglish {
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员喝菜汤");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
