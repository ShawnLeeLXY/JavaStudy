package testpack.polymorphismtest;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }

    public void playGame() {
        System.out.println("Cat play game");
    }
}
