package Day4.ListAssignment.TreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

// # TreeSet
// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

public class ts4 {
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
        
        ArrayList<String> colorsNew = new ArrayList<String>();
        Iterator<String> iterator = colors.descendingIterator();
        while(iterator.hasNext()){
            colorsNew.add(iterator.next());
        }
        System.out.println(colorsNew);
    }
}
