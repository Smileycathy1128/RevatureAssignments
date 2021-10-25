package Day4.ListAssignment.LinkedList;

import java.util.LinkedList;

// # LinkedList
// 5. Write a Java program to insert the specified element at the specified position in the linked list.

public class ll5 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
        
        cats.add(1, "Mr. Fluffybuns");
        System.out.println(cats);

    }
}
