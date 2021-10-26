package Day6.Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double n1, n2, area2;
        int areaInt;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        n1 = scan.nextDouble();
        System.out.println("Width of rectangle: ");
        n2 = scan.nextDouble();
        scan.close();
        
        area2 = n1*n2;
        areaInt = (int)area2;
        System.out.println("Area is "+ areaInt);
        
    }
}

// Q1: Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
