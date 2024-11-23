package Acara3;

public class Swap2 {
    public static void main(String[]args){
    
        int a, b;
        a = 2;
        b = 9;
        System.out.println("Before swapping : a, b = "+a+", "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ b);
    }
}
