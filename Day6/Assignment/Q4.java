package Day6.Assignment;

abstract class Marks {
    abstract float getPercentage();
}

class A extends Marks{
    private float mark;
    float getAvg(float n1, float n2, float n3) {
        mark = (n1+n2+n3)/3;
        return mark;
    }
    float getPercentage() {
        return mark;
    }
}

class B extends Marks{
    private float mark;
    float getAvg(float n1, float n2, float n3, float n4) {
        mark = (n1+n2+n3+n4)/4;
        return mark;
    }
    float getPercentage() {
        return mark;
    }
}

public class Q4 {
    public static void main(String[] args) {
        float a1 = 0.7f;
        float a2 = 0.7f;
        float a3 = 0.7f;
        float b1 = 0.7f;
        float b2 = 0.7f;
        float b3 = 0.7f;
        float b4 = 0.7f;
        A a = new A();
        B b = new B();      
        System.out.println(a.getAvg(a1, a2, a3));
        System.out.println(b.getAvg(b1, b2, b3, b4));
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
        
    }
}
/*
Q4: Calculate the percentage of marks obtained 
    in three subjects by student A and in four subjects by student B.
    Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
    It is inherited by two other classes 'A' and 'B' each having 
    a method with the same name which returns the percentage of the students.     
    The constructor of student A takes the marks in three subjects as its parameters 
    and the marks in four subjects as its parameters for student B.
    Create an object for each of the two classes 
    and print the percentage of marks for both the students.
*/