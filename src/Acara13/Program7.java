package Acara13;

import javax.swing.JOptionPane;

public class Program7 {

    public static void main(String[] args) {
        int jumlahNilai = 0;
        int totalInput = 0;
        int nilai;

        do {

            String input = JOptionPane.showInputDialog(null,
                    "Masukkan nilai siswa (integer)\nInput program berakhir jika nilai input 0",
                    "Nilai Siswa", JOptionPane.QUESTION_MESSAGE);

            nilai = Integer.parseInt(input);

            if (nilai != 0) {
                jumlahNilai += nilai;
                totalInput++;
            }
        } while (nilai != 0);

        double rataRata = (totalInput > 0) ? (double) jumlahNilai / totalInput : 0;

        JOptionPane.showMessageDialog(null,
                "Jumlah nilai input: " + totalInput
                + "\nTotal nilai input: " + jumlahNilai
                + "\nNilai rata-rata: " + String.format("%.2f", rataRata),
                "Nilai Rata-rata", JOptionPane.INFORMATION_MESSAGE);
    }
}
