package Acara9;

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("nol");
        } else {
            String sign = number > 0 ? "Positive" : "Negative";
            String size = Math.abs(number) < 1 ? "small" : (Math.abs(number) > 1000000 ? "large" : "");

            // Print result based on conditions
            if (size.isEmpty()) {
                System.out.println(sign);
            } else {
                System.out.println(sign + " " + size);
            }
        }
    }
}
