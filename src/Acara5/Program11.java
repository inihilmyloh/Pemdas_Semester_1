package Acara5;
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
       Scanner n  = new Scanner(System.in);
        System.out.print("Masukkan nilai Pertama : ");
        int n1 = n.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        int n2 = n.nextInt();
                if (n1 < n2) {
            System.out.println("("+n1+" < "+n2+")");
        } else {
            System.out.println("("+n1+" >= "+n2+")");
        }

        if (n1 <= n2) {
            System.out.println("("+n1+" <= "+n2+")");
        } else {
            System.out.println("("+n1+" > "+n2+")");
        }

        if (n1 != n2) {
            System.out.println("("+n1+" != "+n2+")");
        } else {
            System.out.println("("+n1+" == "+n2+")");
        }

    }
}
