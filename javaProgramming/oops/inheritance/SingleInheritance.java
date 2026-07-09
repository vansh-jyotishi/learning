package javaProgramming.oops.inheritance;

class Father {
    public String[] dadHobbies = { "drawing", "singing", "plumbing", "repairing old stuff", "drinking" };
}

class Son extends Father {
    public String[] sonHobbies = { "playing", "eating", "coding" };
}

public class SingleInheritance {
    public static void main(String[] args) {
        Son s = new Son();

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
