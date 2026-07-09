package javaProgramming.oops.keywords.staticKeyword;

public class Test {
    public static void main(String[] args) {
        Students s1 = new Students();
    Students s2 = new Students();
    Students s3 = new Students();
    System.out.println(Students.count);
    
    s1.age=1;
    s2.age=1;
    s3.age=1;
    }
}
