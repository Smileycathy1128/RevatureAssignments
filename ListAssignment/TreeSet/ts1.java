package Day4.ListAssignment.TreeSet;

import java.util.TreeSet;

// # TreeSet
// 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

public class ts1 {
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
    }
}
