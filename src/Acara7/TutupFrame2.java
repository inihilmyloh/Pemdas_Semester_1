package Acara7;
import java.awt.*;
import java.awt.event.*;
class TutupFrame2 extends Frame{
    Label label;
    CFdengar n = new CFdengar(this);
    private Object ref;
    TutupFrame2(String title) {
        super(title);
        label = new Label("tutup frame.");
        this.addWindowListener(n);
    }
    void luncurkan() {
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]) {
        TutupFrame2 cf = new TutupFrame2("contoh menutup jendela");
        cf.luncurkan();
    }
    class CFdengar extends WindowAdapter{
        TutupFrame2 ref;
        CFdengar( TutupFrame2 ref ){
            this.ref = ref;
        }
        public void windowClosing(WindowEvent e) {
        ref.dispose();
        System.exit(1);
        }
    }
}
