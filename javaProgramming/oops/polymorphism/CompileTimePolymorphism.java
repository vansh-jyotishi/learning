package javaProgramming.oops.polymorphism;
class Student{
    int age;
    String name;
    public void displayInfo(String n){
        System.out.println("name:"+n);
    }
    public void displayInfo(int a){
        System.out.println("age:"+a);
    }
    public void displayInfo(String n,int a){
        System.out.println("name:"+n);
        System.out.println("age:"+a);
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
    s1.displayInfo("hello");
    s1.displayInfo(18);
    s1.displayInfo("hello",18);
    }
}
