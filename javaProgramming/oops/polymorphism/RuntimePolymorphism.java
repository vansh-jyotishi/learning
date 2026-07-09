package javaProgramming.oops.polymorphism;

class Shape {
    public void area() {
        System.out.println("area of shape");
    }
}

class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("area of triangle");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Triangle t = new Triangle();
        t.area();
    }
}
