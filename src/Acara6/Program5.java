package Acara6;
import java.awt.*;
public class Program5 {
    public Program5(){
    }
    public static void main(String[] args) {
        Program4 bld = new Program4();
        bld.setLayout(new BorderLayout(10, 10));
        bld.add(new Button("UTARA"), BorderLayout.NORTH);
        bld.add(new Button("SELATAN"), BorderLayout.SOUTH);
        bld.add(new Button("TIMUR"), BorderLayout.EAST);
        bld.add(new Button("BARAT"), BorderLayout.WEST);
        bld.add(new Button("TENGAH"), BorderLayout.CENTER);
        bld.setSize(300, 300);
        bld.setVisible(true); 
    }
}
