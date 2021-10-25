package Day4.ListAssignment.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

// # TreeSet
// 5. Write a Java program to get the first and last elements in a tree set

public class ts5 {
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
        
        System.out.println("first color: "+ colors.first());
        System.out.println("last color: "+ colors.last());
        
        System.out.println("==================================");
        
        String[] colorsArr = new String[colors.size()];
        Iterator<String> iterator = colors.iterator();
        for(int i=0; i<colors.size(); i++) {
            colorsArr[i] = iterator.next();
        }
        System.out.println("first color: "+ colorsArr[0]);
        System.out.println("last color: "+ colorsArr[colorsArr.length-1]);        
    }
    
}
/*
==================================================================
    TreeSet
==================================================================
package Day4;

import java.util.TreeSet;

public class Demo23 {
    public static void main(String[] args) {
        // create TreeSet and add element
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("John");
        treeSet.add("Apple");

        for(String name: treeSet){
            System.out.println(name);
        }
    }
}
==================================================================
package Day4;

import java.util.TreeSet;

public class Demo24 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(65);
        set.add(21);
        set.add(11);
        set.add(2);
        set.add(15);

        for(int number: set){
            System.out.println(number);
        }
        
        // pollFirst()
        // PostLast()
        System.out.println("Highest: "+ set.pollLast());
        System.out.println("Lowest: "+ set.pollFirst());
    }
}

*/
