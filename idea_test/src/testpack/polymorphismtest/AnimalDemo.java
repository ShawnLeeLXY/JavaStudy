package testpack.polymorphismtest;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.setName("Garfield");
        a1.setAge(6);
        System.out.println(a1.getName() + ", " + a1.getAge());
        a1.eat();
//        System.out.println(a1.playGame());

        Animal a2 = new Cat("Garfield", 6);
        System.out.println(a2.getName() + ", " + a2.getAge());
        a2.eat();
//        System.out.println(a2.playGame());
    }
}
