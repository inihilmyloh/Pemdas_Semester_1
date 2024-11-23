package Acara9;

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan nilai a, b, dan c
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        // Menampilkan kembali input
        System.out.println("Input a: " + a);
        System.out.println("Input b: " + b);
        System.out.println("Input c: " + c);

        // Menghitung diskriminan
        double discriminant = b * b - 4 * a * c;

        // Memeriksa kondisi berdasarkan nilai diskriminan
        if (discriminant > 0) {
            // Jika diskriminan positif, ada dua akar nyata
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // Jika diskriminan nol, ada satu akar ganda
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            // Jika diskriminan negatif, tidak ada akar nyata
            System.out.println("The equation has no real roots");
        }
    }
}
