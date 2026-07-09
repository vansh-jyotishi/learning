package javaProgramming.oops.inheritance;

class Father {
    public String hairColor = "black";
}

class Son extends Father {  
}

class Daughter extends Father{
}

public class HyrarchialInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
        System.out.println("son's hair color:"+s.hairColor);
        System.out.println("daughter's hair color:"+d.hairColor);
    }
}
