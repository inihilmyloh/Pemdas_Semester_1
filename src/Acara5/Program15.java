package Acara5;
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
            int x, y, z;
            Scanner n = new Scanner(System.in);
            System.out.print("bilangan pertama : ");
            x = n.nextInt();
            System.out.print("bilangan kedua : ");
            y = n.nextInt();
            z = x;    
            System.out.println(" Sebelum ditukar :" + x + " dan " + y);
            x = y;
            y = z;
            System.out.println(" Setelah ditukar :" + x + " dan " + y);
    }
}
