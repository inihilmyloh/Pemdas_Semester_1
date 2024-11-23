package Acara5;
import java.util.Scanner;
public class Program13 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int a1 = n.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int a2 = n.nextInt();
        System.out.printf("tambahakan kedua bilangan: %d%n", a1 + a2);
        
        System.out.printf("Selisih kedua bilangan: %d%n", a1 - a2);
        
        System.out.printf("Perkalian kedua bilangan: %d%n", a1 * a2);
        
        System.out.printf("rata rata dari kedua bilangan: %.2f%n", (double) (a1 + a2) / 2);
        
        System.out.printf("Selisih antara dua bilangan bulat: %d%n", Math.abs(a1 - a2));
        
        System.out.printf("Bilangan Terbesar: %d%n", Math.max(a1,a2));
        
        System.out.printf("Bilangan terkecil: %d%n", Math.min(a1,a2));
    }    
}
