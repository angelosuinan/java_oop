
package suinanAALabExer507;


import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Lst extends Frame {
    List L1;
    Button B1, B2, B3;
    Label Lb;
        Lst(String s) {
            super(s);
            setLayout(new FlowLayout());
            L1 = new List(3,false);
            L1.addItem("Red");
            L1.addItem("Blue");
            L1.addItem("Yellow");
            L1.addItem("Pink");
            L1.addItem("Magenta");
            B1 = new Button("Select");
            B2 = new Button("Reset");
            B3 = new Button("Exit");
            Lb = new Label("Output here");
            add(L1); add(B1);
            add(B2); add(B3); layout();
            pack(); show();
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            
        }
    public boolean action(Event e, Object o) {
        if ("Select".equals(e.arg))
        if ("Red".equals(L1.getSelectedItem()))
        setBackground(Color.red);
        else if ("Blue".equals(L1.getSelectedItem()))
        setBackground(Color.blue);
        else if ("Yellow".equals(L1.getSelectedItem()))
        setBackground(Color.yellow);
        else if ("Magenta".equals(L1.getSelectedItem()))
        setBackground(Color.magenta);
        else if ("Pink".equals(L1.getSelectedItem()))
        setBackground(Color.pink);
        if("Exit".equals(e.arg)){
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","WARNING", JOptionPane.OK_CANCEL_OPTION);
            if( x == 0){
                System.exit(0);
            }
        }
        if ("Reset".equals(e.arg))
            setBackground(Color.white);
        return(super.action(e,e.target));
    }
}

public class suinanAALabExer50703 {
    public static void main(String[] args) {
        new Lst("List");
    }
}
