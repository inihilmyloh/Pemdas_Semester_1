package Acara9;

import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga angka
        System.out.print("Masukkan angka ke-1: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka ke-2: ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan angka ke-3: ");
        int angka3 = input.nextInt();
        // Menentukan angka terbesar dengan if, else if, dan else
        int terbesar;
        if (angka1 >= angka2 && angka1 >= angka3) {
            terbesar = angka1;
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            terbesar = angka2;
        } else {
            terbesar = angka3;
        }

        // Menampilkan angka terbesar
        System.out.println("Angka terbesar: " + terbesar);
    }
}
