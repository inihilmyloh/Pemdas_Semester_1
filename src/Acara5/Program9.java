package Acara5;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner dika = new Scanner(System.in);
        System.out.print("Masukkan Nilai BHS Inggris: ");
        int n1 = dika.nextInt();
        System.out.print("Masukkan Nilai Dasar Pemrograman: ");
        int n2 = dika.nextInt();
        System.out.print("Masukkan Nilai Agama: ");
        int n3 = dika.nextInt();
        System.out.print("Masukkan Nilai Basis Data: ");
        int n4 = dika.nextInt();
        System.out.print("Masukkan Nilai Algoritma Pemrograman: ");
        int n5 = dika.nextInt();
        
        int total = n1+n2+n3+n4+n5;
        double rerata = total/5;
        System.out.println("rerata "+ rerata);
        
    }
}
