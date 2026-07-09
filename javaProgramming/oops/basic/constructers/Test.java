package javaProgramming.oops.basic.constructers;
public class Test {
    public static void main(String[] args) {
        // using non parameterised constructor
        ConstructorExample o1 = new ConstructorExample();
        // using parameterised constructor
        ConstructorExample o2 = new ConstructorExample(28);
        // using copy constructor
        ConstructorExample o3 = new ConstructorExample(o2);
        System.out.println("object 1 age:"+o1.objectAge);
        System.out.println("object 2 age:"+o2.objectAge);
        System.out.println("object 3 age:"+o3.objectAge);
        
    }
}
