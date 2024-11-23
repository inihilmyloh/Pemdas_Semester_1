package Acara9;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan bahasa : ");

        String bahasa = n.nextLine();
        if (bahasa == "madura") {
            System.out.println("adalah bahasa tebaik");
        } else {
            System.out.println("bukan bahasa terbaik");
        }
    }
}
