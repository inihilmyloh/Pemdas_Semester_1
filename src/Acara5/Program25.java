package Acara5;
import java.util.Scanner;

public class Program25 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = n.nextDouble();

        double square = Math.pow(angka, 2);
        double cube = Math.pow(angka, 3);
        double fourthPower = Math.pow(angka, 4);

        System.out.printf("Angka: %.2f\n", angka);
        System.out.printf("Square (Kuadrat): %.2f\n", square);
        System.out.printf("Cube (Kubus): %.2f\n", cube);
        System.out.printf("Fourth Power (Pangkat Empat): %.2f\n", fourthPower);
    }
}
