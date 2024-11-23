package Acara5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Program21{
public static void main (String args[]){
    BufferedReader br = new BufferedReader(new
    InputStreamReader(System.in));
    String nama;
    String alamat;
    try
    {
    System.out.print("Masukkan nama anda : ");
    nama = br.readLine();
    System.out.print("Masukkan alamat anda : ");
    alamat = br.readLine();
    System.out.println("Nama anda : " + nama);
    System.out.println("Alamat anda : " + alamat);
    }
    catch(IOException eox)
    {
    System.out.println(eox);
    }
}
}