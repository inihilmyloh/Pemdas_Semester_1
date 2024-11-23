package Acara5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Program22 {
    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nomor Induk Mahasiswa (NIM) : ");
        String nim = n.readLine();
        System.out.print("Masukkan Nama: ");
        String nama = n.readLine();
        System.out.print("Masukkan Jurusan: " );
        String jurusan = n.readLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = n.readLine();
        System.out.println();
        System.out.println(" DATA DIRI ");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat : " + alamat);
    }
}