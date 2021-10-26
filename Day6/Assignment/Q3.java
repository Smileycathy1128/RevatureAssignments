package Day6.Assignment;

import java.util.Scanner;

class average {
    static void printAvg(float n1, float n2, float n3) {
        System.out.println("Average: "+ (n1+n2+n3)/3);
    }
}

public class Q3 {
    public static void main(String[] args) {
        float n1, n2, n3;
        System.out.println("Enter three numbers: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        scan.close();
        average.printAvg(n1, n2, n3);
    }
}

/*
Q3: Print the average of three numbers entered by user
    by creating a class named 'Average' 
    and having a method to calculate and print the average.
*/
