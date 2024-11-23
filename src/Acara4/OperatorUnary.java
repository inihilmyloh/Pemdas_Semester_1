package Acara4;

public class OperatorUnary {
    public static void main(String[] args) {
        // declare variables
        int a = 12, b = 12;
        int result1, result2;
        // original value
        System.out.println("a = " + a);
        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);
        // original value
        System.out.println("b = " + b);
        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
    }
}
