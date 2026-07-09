package javaProgramming.oops.AbstractionAndInterfaces;

abstract class Animal {
    int age;
    String name;

    public abstract void makeNoise();

    public void walks() {
        System.out.println("animal walks");
    }
}

class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("meowwwww");
    }

    
}

public class AbstractClassEx {
    public static void main(String[] args) {
        Cat juli = new Cat();
        juli.makeNoise();
        juli.walks();
    }
}
