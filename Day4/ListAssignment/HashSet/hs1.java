package Day4.ListAssignment.HashSet;

import java.util.HashSet;

// # HashSet
// 1. Write a Java program to append the specified element to the end of a hash set.

public class hs1 {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
    }
}
