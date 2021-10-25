package Day5;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2;
        
        System.out.print("Enter First Number : ");
        try {
            n1 = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        // checkIfBlank(n1);
        System.out.print("Enter Second Number: ");
        try {
            n2 = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        // checkIfBlank(n2);       
        System.out.print("\n");  
        System.out.println("Select Option: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiple");
        System.out.print("4 - Divide\t");
        int option;
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        
        scanner.close();
        
        float result;
        switch (option) {
            case 1: result = n1+n2;
                break;
            case 2: result = n1-n2;
                break;
            case 3: result = n1*n2;
                break;
            case 4: result = n1/n2;
                break;
            default:
                System.out.println("Invalid input: Out of range");
                return;
        }
        
        System.out.println("Result: "+ result);
        
    }

}
