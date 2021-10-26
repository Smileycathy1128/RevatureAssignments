package Day4.ListAssignment.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

// # LinkedList
// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

public class ll3 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        
        Iterator<String> iterator = cats.listIterator(1);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
