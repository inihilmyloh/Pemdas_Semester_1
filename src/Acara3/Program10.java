package Acara3;
public class Program10 {
    public static void main(String[] args) {
        String hex = "37";
        
        int desimal = Integer.parseInt(hex,16);
        
        String biner = Integer.toBinaryString(desimal);
        
        System.out.println("Hexadesimal: " + hex);
        System.out.println("Nilai biner: " + biner);
    }
}


