package Acara6;
import java.awt.*;
public class Program4 extends Frame{
    public Program4(){
    }
    public static void main(String[] args) {
        Program4 fld = new Program4();
        fld.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        fld.add(new Button("Satu"));
        fld.add(new Button("Dua"));
        fld.add(new Button("Tiga"));
        fld.setSize(300,100);
        fld.setVisible(true);
    }
}
