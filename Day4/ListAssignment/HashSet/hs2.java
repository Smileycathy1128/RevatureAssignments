package Day4.ListAssignment.HashSet;

import java.util.HashSet;
import java.util.Iterator;

// # HashSet
// 2. Write a Java program to iterate through all elements in a hash list.

public class hs2 {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
        
        Iterator<String> iterator = cats.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
