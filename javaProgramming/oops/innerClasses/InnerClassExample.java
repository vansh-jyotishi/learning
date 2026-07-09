package javaProgramming.oops.innerClasses;

class OuterClass {
    class InnerClass {
        public void sayHello() {
            System.out.println("hello from inner class");
        }
    }
    static class StaticNestedClass{
        public void sayHello() {
            System.out.println("hello from static nested class");
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        //since InnerClass in non static member of OuterClass we have to make a object of OuterClass first then use it to create a new instance of InnerClass
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner1 = outer.new InnerClass();
        inner1.sayHello();
        
        //now if we have a static inner class we can instantiate directly using OuterClass cause now its related  to OuterClass not instance of OUterClass
        OuterClass.StaticNestedClass inner2 = new OuterClass.StaticNestedClass();
        inner2.sayHello();

        //there is one more type local inner class in which,  a  class is declared instantiated and used inside the same function and has no use outside that function
        
    }
}
