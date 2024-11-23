package Acara5;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Inputkan nilai :");
   
        int nilai = n.nextInt();
        System.out.println("Kamu memberi nilai: " + nilai);
        
        n.close();
    }
}
