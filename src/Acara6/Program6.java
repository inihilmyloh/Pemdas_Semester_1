package Acara6;
import java.awt.*;
public class Program6 extends Frame{
    public Program6(){
    }
    public static void main(String[] args) {
        Program6 gld = new Program6();
        gld.setLayout(new GridLayout(2, 3, 4, 4));
        gld.add(new Button("ONE"));
        gld.add(new Button("TWO"));
        gld.add(new Button("THREE"));
        gld.add(new Button("FOUR"));
        gld.add(new Button("FIVE"));
        gld.setSize(200, 200);
        gld.setVisible(true); 
    }
}
