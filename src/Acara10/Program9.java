package Acara10;

import java.util.Scanner;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class Program9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor bulan
        System.out.print("Masukkan nomer bulan: ");
        int month = scanner.nextInt();

        // Input tahun
        System.out.print("Masukkan tahun: ");
        int year = scanner.nextInt();

        // Validasi input bulan dengan switch
        switch (month) {
            case 1: case 2: case 3: case 4: case 5: case 6: 
            case 7: case 8: case 9: case 10: case 11: case 12:
                // Mendapatkan jumlah hari dalam bulan tertentu di tahun tertentu
                YearMonth yearMonth = YearMonth.of(year, month);
                int daysInMonth = yearMonth.lengthOfMonth();

                // Mendapatkan nama bulan dalam bahasa Inggris
                String monthName = yearMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

                // Output hasil
                System.out.println(monthName + " " + year + " has " + daysInMonth + " days");
                break;
            default:
                System.out.println("Nomor bulan harus antara 1 hingga 12.");
                break;
        }
    }
}
