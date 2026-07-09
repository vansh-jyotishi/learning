package javaProgramming.oops.basic.learningPackages.Main;

import javaProgramming.oops.basic.learningPackages.tools.Tool1;
import javaProgramming.oops.basic.learningPackages.tools.Tool2;
//we can write import javaProgramming.oops.basic.learningPackages.tools.*; to import all files in the package tools but not the files present in its sub folder 

public class Main {
    public static void main(String[] args) {
        Tool1 t1 = new Tool1();
        Tool2 t2 = new  Tool2();
        t1.sayHello();
        t2.sayHello();
        
    }
}
