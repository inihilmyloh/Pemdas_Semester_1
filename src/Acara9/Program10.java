package Acara9;

import java.util.*;

public class Program10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
