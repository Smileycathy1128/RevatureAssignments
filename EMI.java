package Day5;

import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float loan, interestRate, tenure;
        
        System.out.print("Loan Amount : ");
        try {
            loan = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        
        System.out.print("Interest Rate: ");
        try {
            interestRate = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        
        System.out.print("Tenure: ");
        try {
            tenure = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
                
        scanner.close();
        
        float result = calculateEMI(loan, interestRate, tenure);
        System.out.println("EMI: "+ result);
        
    }
    
    static float calculateEMI(float loan, float interestRate, float tenure) {
        float temp1,temp2,temp3,temp4;
        temp1 = 1 + (interestRate/12);
        temp2 = (float)Math.pow(temp1, tenure);
        temp3 = temp2-1;
        temp4 = loan*(interestRate/12)*(temp2/temp3);
        return temp4;
    }
}
