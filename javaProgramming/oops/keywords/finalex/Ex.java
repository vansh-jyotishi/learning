package javaProgramming.oops.keywords.finalex;

public final class Ex {
    final public double pi = 3.14;
    final void sayHello(){
        System.out.println("hello from final class");
    }
}
//no other class can inherit this final class Ex
//no other function can override this final function sayHello
//no one can change the value of the final vaiable pi