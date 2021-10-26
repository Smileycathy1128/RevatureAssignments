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
// Q2: Take name, roll number and field of interest from user 
//     and print in the format below:
//         "Hey, my name is xyz and my roll number is xyz. My field of interest are xyz."
// Q3: Print the average of three numbers entered by user
//     by creating a class named 'Average' 
//     and having a method to calculate and print the average.
// Q4: Calculate the percentage of marks obtained 
//     in three subjects by student A and in four subjects by student B.
//     Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
//     It is inherited by two other classes 'A' and 'B' each having 
//     a method with the same name which returns the percentage of the students. 
//     The constructor of student A takes the marks in three subjects as its parameters 
//     and the marks in four subjects as its parameters for student B.
//     Create an object for eac of the two classes 
//     and print the percentage of marks for both the students.
// Q5: Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//     $100, $150 and $200 are deposited in banks A, B and C respectively. 
//     'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
//     each having a method named 'getBalance'. 
//     Call this method by creating an object of each of the three classes.