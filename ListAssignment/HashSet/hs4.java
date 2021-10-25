package Day4.ListAssignment.HashSet;

import java.util.HashSet;

// # HashSet
// 4. Write a Java program to empty an hash set.

public class hs4 {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
        
        cats.clear();
        System.out.println(cats);
        System.out.println(cats.size() +" cats in the bath");

    }
}
