package Day4.ListAssignment.HashSet;

import java.util.HashSet;

// # HashSet
// 3. Write a Java program to get the number of elements in a hash set. 

public class hs3 {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
        
        switch (cats.size()) {
            case 1: System.out.println("1 cat");               
                break;
            default: System.out.println(cats.size() +" cats");
                break;
        }
        
    }
}
