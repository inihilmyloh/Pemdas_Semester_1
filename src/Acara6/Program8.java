package Acara6;
import java.awt.*;
import javax.swing.*;
public class Program8 {
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPanel;
    public Program8(){
    }
    void keluar(){
    frame = new JFrame("Aplikasi Swing pertamaku");
    panel = new JPanel();
    textField = new JTextField("kosong");
    button = new JButton("Kirim");
    contentPanel = frame.getContentPane();
    panel.add(textField);
    panel.add(button);
    contentPanel.add(panel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    }
    public static void main(String[] args) {
        Program8 sd = new Program8();
        sd.keluar();
    }
}
