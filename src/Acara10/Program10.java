package Acara10;

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int pilihan, jumlah;
        int totalHarga = 0;
        boolean tambahPesanan = true;

        // Input nama pelanggan
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        // Tampilkan menu
        System.out.println("Pilihan:");
        System.out.println("1. Nasi Goreng (Rp. 10.000,00)");
        System.out.println("2. Mie Ayam (Rp. 7.000,00)");
        System.out.println("3. Bakso (Rp. 15.000,00)");

        while (tambahPesanan) {
            // Input pilihan makanan
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            // Input jumlah pesanan
            System.out.print("Jumlah pesan: ");
            jumlah = scanner.nextInt();
            
            System.out.println("===================");

            // Hitung total harga untuk pilihan saat ini
            switch (pilihan) {
                case 1:
                    totalHarga += 10000 * jumlah;
                    System.out.println("Anda memilih Nasi Goreng sebanyak " + jumlah + " porsi.");
                    break;
                case 2:
                    totalHarga += 7000 * jumlah;
                    System.out.println("Anda memilih Mie Ayam sebanyak " + jumlah + " porsi.");
                    break;
                case 3:
                    totalHarga += 15000 * jumlah;
                    System.out.println("Anda memilih Bakso sebanyak " + jumlah + " porsi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Tanyakan apakah ingin menambah pesanan
            System.out.print("Apakah ingin menambah (y/t)? ");
            char tambah = scanner.next().charAt(0);
            tambahPesanan = (tambah == 'y' || tambah == 'Y');
        }

        // Tampilkan total pesanan
        System.out.println("\nTotal harga pesanan: Rp. " + totalHarga + ",00");

    }
}
