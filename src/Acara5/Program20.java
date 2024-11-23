package Acara5;
import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Integer: ");
        long p = n.nextLong();
        System.out.println("jumlah digit integer: " +
        tambahDigit(p));
        }
    public static int tambahDigit(long p) {
        int sum = 0;
        while (p != 0) {
            sum += p % 10;
            p /= 10;
        }
    return sum;
    }
}