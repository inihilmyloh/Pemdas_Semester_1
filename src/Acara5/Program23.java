package Acara5;
import java.util.Scanner;
public class Program23 {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.print("Masukkan Panjang Persegi Panjang: ");
    int p = n.nextInt();
    System.out.print("Masukkan Lebar Persegi Panjang: ");
    int l = n.nextInt();
    
    System.out.println("Keliling = " + (2 * (p + l)));
    System.out.println("Luas = " + (p * l));
    }
}