package Day4.ListAssignment.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

// # TreeSet
// 2. Write a Java program to iterate through all elements in a tree set.

public class ts2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<String>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        colors.add("white");
        colors.add("black");
        colors.add("brown");
        
        System.out.println(colors);
        
        for(String c: colors){
            System.out.println(c);
        }
        
        System.out.println("=================================");
        
        Iterator<String> iterator = colors.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
