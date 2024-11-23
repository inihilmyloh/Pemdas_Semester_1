package Acara3;

public class Program9 {
    public static void main(String[] args) {
        String oktal = "7";
        
        int desimal = Integer.parseInt(oktal,8);
        
        String biner = Integer.toBinaryString(desimal);
        
        System.out.println("Nilai oktal: "+oktal);
        System.out.println("Nilai biner: " + biner);
    }
}
