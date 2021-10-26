package Day6.Assignment;

abstract class Bank {
    abstract void deposit(double mon);
    abstract double getBalance();
}

class BankA extends Bank{
    private double balance = 0;
    void deposit(double mon) {
        balance += mon;
    }
    double getBalance() {
        return balance;
    }
}

// class BankB extends Bank{
//     private double balance = 0;
//     void deposit(double mon) {
//         balance += mon;
//     }
//     double getBalance() {
//         return balance;
//     }
// }

// class BankC extends Bank{
//     private double balance = 0;
//     void deposit(double mon) {
//         balance += mon;
//     }
//     double getBalance() {
//         return balance;
//     }
// }

public class Q5 {
    public static void main(String[] args) {
        // BankB and BankC are copies of BankA
        BankA bankA = new BankA();
        BankA bankB = new BankA();
        BankA bankC = new BankA();
        
        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);
        
        System.out.println(bankA.getBalance());
        System.out.println(bankB.getBalance());
        System.out.println(bankC.getBalance());        
    }
}
/*
Q5: Create an abstract class 'Bank' with an abstract method 'getBalance'. 
    $100, $150 and $200 are deposited in banks A, B and C respectively. 
    'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
    each having a method named 'getBalance'. 
    Call this method by creating an object of each of the three classes.
*/