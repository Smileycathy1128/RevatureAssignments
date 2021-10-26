package Day4.ListAssignment.LinkedList;

import java.util.LinkedList;

// # LinkedList
// 1. Write a Java program to append the specified element to the end of a linked list.

public class ll1 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Mr. Mittens");
        cats.add("Callico");
        cats.add("Tina");
        System.out.println(cats);
        
        System.out.println("===================");
        
        for(int i=cats.size()-1; i>=0;i--){
            System.out.println(cats.get(i));
        }
    }
}
