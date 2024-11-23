package Acara6;

import java.awt.*;
import java.awt.Frame;

public class Program3 extends Frame{
    public Program3(){
    }
    public static void main(String[] args) {
        Program3 fwc = new Program3();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600,600);
        fwc.add(new Button("Test Me"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
        List list = new List(3, false);
        list.add("MTV");
        list.add("V");
        fwc.add(list);
        Choice chooser = new Choice();
        chooser.add("Hilmy");
        chooser.add("Ayyub");
        chooser.add("Yusuf");
        fwc.add(chooser);
        fwc.add(new Scrollbar());
        fwc.setVisible(true);
    }
}
