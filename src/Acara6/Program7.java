package Acara6;
import java.awt.*;
public class Program7 extends Frame{
    public Program7(){
    }
    public static void main(String[] args) {

        Program7 c = new Program7();
        Panel panelUtara = new Panel();
        Panel panelTengah = new Panel();
        Panel panelSelatan = new Panel();
        panelUtara.add(new Button("Satu"));
        panelUtara.add(new Button("Dua"));
        panelUtara.add(new Button("Tiga"));
        panelTengah.setLayout(new GridLayout(5,5));
        panelTengah.add(new TextField("Ke satu"));
        panelTengah.add(new TextField("Ke dua"));
        panelTengah.add(new TextField("Ke tiga"));
        panelTengah.add(new TextField("Ke empat"));
        panelSelatan.setLayout(new BorderLayout());
        panelSelatan.add(new Checkbox("Pilih Aku!"),
        BorderLayout.CENTER);
        panelSelatan.add(new Checkbox("Aku disini!"),
        BorderLayout.EAST);
        panelSelatan.add(new Checkbox("Ambil !"),
        BorderLayout.WEST);
        c.add(panelUtara, BorderLayout.NORTH);
        c.add(panelTengah, BorderLayout.CENTER);
        c.add(panelSelatan, BorderLayout.SOUTH);
        c.setSize(600,600);
        c.setVisible(true);
    }
}
