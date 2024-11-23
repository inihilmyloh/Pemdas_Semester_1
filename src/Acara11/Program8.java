package Acara11;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris piramida
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Mencetak pola piramida
        for (int i = 1; i <= rows; i++) {
            // Mencetak spasi sebelum angka di baris ke-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Mencetak angka yang sama sebanyak i kali
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Pindah baris setelah setiap baris dicetak
            System.out.println();
        }
    }

}
