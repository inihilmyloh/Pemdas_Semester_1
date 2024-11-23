package Acara5;
import java.util.Scanner;
public class Program19 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Berikan satu kalimat: ");
        char[] huruf = n.nextLine().toCharArray();
        System.out.print("kebalikan kalimat: ");
        for (int i = huruf.length - 1; i >= 0; i--) {
        System.out.print(huruf[i]);
        }
    }
}
