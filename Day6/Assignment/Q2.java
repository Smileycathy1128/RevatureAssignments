package Day6.Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String name, interest;
        int roll;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.next();
        System.out.print("Roll number: ");
        roll = scan.nextInt();
        System.out.print("Interest: ");       
        interest = scan.next();
        scan.close();
        
        System.out.println(
            "Hey, my name is "+ name
            +".\nMy roll number is "+ roll
            +".\nMy field of interest are "+ interest 
            +"."
        );
    }
}
// Q2: Take name, roll number and field of interest from user and print in the format below:
//     "Hey, my name is xyz and my roll number is xyz. My field of interest are xyz."
