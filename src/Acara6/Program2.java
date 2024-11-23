package Acara6;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Font;
public class Program2 extends Panel{
    public Program2(){
        setBackground(Color.black);
    }
    public void paint(Graphics g) {
        g.setColor(new Color(0,255,0)); //green
        g.setFont(new Font("Sans-serif",Font.PLAIN,16));
        g.drawString("Ahmad Hilmy Febriandika", 30, 100);
        g.setColor(new Color(1.0f,0,0)); //red
        g.fillRect(30, 100, 150, 5);
    }
    public static void main(String args[]) {
        Frame f = new Frame("Testing Graphics Panel");
        Program2 gp = new Program2();
        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
}
