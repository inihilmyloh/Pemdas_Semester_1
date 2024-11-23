package Acara6;
import javax.swing.*;
import java.awt.*;
public class Program9 {
    JOptionPane optionPane;
public Program9(){
}
    void Keluarkan() {
        optionPane = new JOptionPane();
        String name = optionPane.showInputDialog("Siapa namamu teman? ");
        optionPane.showMessageDialog(null,"Senang bertemu dangan mu, " + name +
                ".", "Bagus",optionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    public static void main(String[] args) {
        new Program9().Keluarkan();
    }
}
