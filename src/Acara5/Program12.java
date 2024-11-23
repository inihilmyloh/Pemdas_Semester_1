package Acara5;
import java.util.Scanner;
public class Program12 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Berat badan dengan satuan pound : ");
        double brt = n.nextDouble();
        System.out.print("Masukkak Tinggi badan dengan satuan inci : ");
        double tnggi = n.nextDouble();
        double BMI = brt * 0.45359237 / (tnggi * 0.0254 *
        tnggi * 0.0254);
        System.out.print("Massa tubuh mu adalah " + BMI+"\n");

    }
    
}
