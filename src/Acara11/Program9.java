package Acara11;

import java.util.Scanner;

public class Program9 {

    // Fungsi untuk menghitung nilai kombinasi (nCk)
    public static int kombinasi(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return kombinasi(n - 1, k - 1) + kombinasi(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Menampilkan segitiga Pascal
        for (int i = 0; i < rows; i++) {
            // Mencetak spasi untuk menjaga bentuk segitiga
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Mencetak angka untuk baris ke-i
            for (int j = 0; j <= i; j++) {
                System.out.print(kombinasi(i, j) + " ");
            }

            // Pindah baris setelah mencetak satu baris
            System.out.println();
        }
    }

}
