package Acara4;

public class Program9 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c;
        
        c = a && b;        
        System.out.println("true && false = " +c);
        c = a || b;
        System.out.println("true || false = " +c);
        System.out.println("Negasi, !true = " + !a);
    }
}
