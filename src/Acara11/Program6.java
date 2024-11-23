
package Acara11;

public class Program6 {
        public static void main(String[] args) {
        int tinggi = 5;  // Jumlah baris piramida

        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
