package Acara5;
import java.util.Scanner;
public class Program18 {
public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.print("sisi poligon : ");
    int s = n.nextInt();
    System.out.print("panjang sisi : ");
    double sisi = n.nextDouble();
    System.out.println("area : " + Areapoli(s,sisi));
    }
public static double Areapoli(int s, double sisi) {
    return (s * (sisi * sisi)) / (4.0 * Math.tan((Math.PI /s)));
    }
}