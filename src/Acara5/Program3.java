package Acara5;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        double mentperthn = 60*24*365;
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan menit yang ingin dihitung: ");
        
        double ment = n.nextDouble();
        long tahun = (long) (ment / mentperthn);
        int hari = (int)(ment/60/24) %365;
        
        System.out.println((int)ment +" Menit sekitar " + tahun +
                " tahun dan " + hari + " Hari");
    }
}
