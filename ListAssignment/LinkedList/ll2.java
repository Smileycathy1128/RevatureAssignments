package Day4.ListAssignment.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

// # LinkedList
// 2. Write a Java program to iterate through all elements in a linked list.

public class ll2 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        
        Iterator<String> iterator = cats.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
