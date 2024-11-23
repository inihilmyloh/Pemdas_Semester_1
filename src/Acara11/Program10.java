package Acara11;
public class Program10 {
    public static void main(String[] args) {
        int tinggi = 6; // Tinggi segitiga

        for (int i = 0; i < tinggi; i++) {
            // Mencetak spasi
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 0; k < (tinggi - i); k++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
