package Acara13;

import javax.swing.JOptionPane;

public class Program7 {

    public static void main(String[] args) {
        int jumlahNilai = 0; // Total jumlah nilai
        int totalInput = 0; // Jumlah input
        int nilai; // Variabel untuk menyimpan input pengguna

        do {
            // Input nilai menggunakan JOptionPane
            String input = JOptionPane.showInputDialog(null,
                    "Masukkan nilai siswa (integer)\nInput program berakhir jika nilai input 0",
                    "Nilai Siswa", JOptionPane.QUESTION_MESSAGE);

            // Konversi input dari String ke integer
            nilai = Integer.parseInt(input);

            if (nilai != 0) { // Jika nilai bukan 0, tambahkan ke total
                jumlahNilai += nilai;
                totalInput++;
            }
        } while (nilai != 0); // Berhenti jika input 0

        // Hitung rata-rata
        double rataRata = (totalInput > 0) ? (double) jumlahNilai / totalInput : 0;

        // Tampilkan hasil
        JOptionPane.showMessageDialog(null,
                "Jumlah nilai input: " + totalInput
                + "\nTotal nilai input: " + jumlahNilai
                + "\nNilai rata-rata: " + String.format("%.2f", rataRata),
                "Nilai Rata-rata", JOptionPane.INFORMATION_MESSAGE);
    }
}
