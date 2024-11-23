package Acara7;
import java.awt.*;
import java.awt.event.*;
class CloseFrame4 extends Frame{
    Label label;
    CloseFrame4(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
                System.exit(1);
            }
        });
    }
    void launchFrame() {
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]) {
        CloseFrame4 cf = new CloseFrame4("Tutup contoh Jendela");
        cf.launchFrame();
    }
}