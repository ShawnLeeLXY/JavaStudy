package PlayerAndCoach;

public class PersonDemo {
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer("李小明", 21);
        System.out.println(player1.getName() + ", " + player1.getAge());
        player1.eat();
        player1.study();

        System.out.println("--------");

        PingpongPlayer player2 = new PingpongPlayer("张小壮", 19);
        System.out.println(player2.getName() + ", " + player2.getAge());
        player2.eat();
        player2.study();
        player2.speak();
    }
}
