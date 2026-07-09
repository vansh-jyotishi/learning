package javaProgramming.oops.innerClasses;
class Animal{
    int age;
    String name;
    public void speak(){
        System.out.println("blah blah blah...");
    };
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //by subclass method
        Animal bigFoot = new Animal(){
        @Override
        public void speak(){
            System.out.println("YAAAAAA-AUGH");
        }
    };
    bigFoot.speak();
    //by interface 
    TestInterface obj = new TestInterface() {
        public void show(){
            System.out.println("helloooooooo");
        }
    };
    obj.show();
    }
}
