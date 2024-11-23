package Acara5;
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.print("Berapa data yang anda mau: ");
            int jumlah = n.nextInt();
            
            double total = 0;
            
            for(int i=0; i<jumlah; i++){
                System.out.println("Masukkan angka (" +(i+1)+")");
                double j = n.nextInt();
                total+=j;
        }
            double rerata = total/jumlah;
            System.out.println("rata rata"+rerata);
    }

}