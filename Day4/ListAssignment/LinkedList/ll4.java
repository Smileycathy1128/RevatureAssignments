package Day4.ListAssignment.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

// # LinkedList
// 4. Write a Java program to iterate a linked list in reverse order.

public class ll4 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        
        Iterator<String> iterator = cats.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
