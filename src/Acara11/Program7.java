package Acara11;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris (n)
        System.out.print("Input number of n: ");
        int n = scanner.nextInt();

        // Menampilkan pola segitiga
        for (int i = 1; i <= n; i++) {
            // Menampilkan angka yang sama berulang sebanyak i kali
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Pindah baris setelah setiap baris dicetak
            System.out.println();
        }
    }

}
