package Acara5;
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.print("Masukkan jari-jari lingkaran: ");
    double r = n.nextDouble();
    System.out.println("Keliling = " + (2 * r * Math.PI));
    System.out.println("Luas = " + (Math.PI * r * r));
    }
}