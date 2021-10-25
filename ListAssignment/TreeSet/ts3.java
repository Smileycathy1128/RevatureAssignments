package Day4.ListAssignment.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

// # TreeSet
// 3. Write a Java program to add all the elements of a specified tree set to another tree set.

public class ts3 {
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
        
        TreeSet<String> colorsNew = new TreeSet<String>();
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            colorsNew.add(iterator.next());
        }
        System.out.println(colorsNew);
    }
}
