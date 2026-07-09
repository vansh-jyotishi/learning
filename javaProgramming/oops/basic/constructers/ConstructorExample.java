package javaProgramming.oops.basic.constructers;

public class ConstructorExample {
    int objectAge;
    //non parameterised constructor
    ConstructorExample(){
        System.out.println("non parameterize constructor called");
        this.objectAge = 0;
    }
    //parameterized constructor
    ConstructorExample(int age){
        System.out.println("parameterize constructor called with age:"+age);
        this.objectAge=age;
    }
    //copy constructor
    ConstructorExample(ConstructorExample objectGetting){
        System.out.println("copy constructor called");
        this.objectAge = objectGetting.objectAge;
    }
}
