package javaProgramming.oops.inheritance;

class GrandFather{
    public String[] grandFatherHobbies = {"yawning","crying over property"};
}
class Father extends GrandFather {
    public String[] dadHobbies = { "drawing", "singing", "plumbing", "repairing old stuff", "drinking" };
}

class Son extends Father {
    public String[] sonHobbies = { "playing", "eating", "coding" };
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();

         System.out.println("grandFather's hobbies =====");
        for (int i = 0; i < s.grandFatherHobbies.length; i++) {
            System.out.println(s.grandFatherHobbies[i]);
            ;
        }

        System.out.println("dad's hobbies =====");
        for (int i = 0; i < s.dadHobbies.length; i++) {
            System.out.println(s.dadHobbies[i]);
            ;
        }

        System.out.println("sons's hobbies =====");
        for (int i = 0; i < s.sonHobbies.length; i++) {
            System.out.println(s.sonHobbies[i]);
            ;
        }
    }
}
