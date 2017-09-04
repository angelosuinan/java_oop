
package suinanAALabExer507;



import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Lst1 extends Frame implements ActionListener {
    List L1;
        Lst1(String s) {
            super(s);
            setLayout(new GridLayout(2,1));
            setSize(200,200);
            L1 = new List(3,false);
            L1.addActionListener(this);
            L1.addItem("Red");
            L1.addItem("Blue");
            L1.addItem("Yellow");
            L1.addItem("Pink");
            L1.addItem("Magenta");
            L1.addItem("Exit");
            add(L1);
            layout();
            pack();
            show();
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
        }
        
    public void actionPerformed(ActionEvent event) {
        String s1 = L1.getSelectedItem();
        if(event.getActionCommand().equals(s1))
        if ("Red".equals(s1))
            setBackground(Color.red);
        else if ("Blue".equals(s1))
            setBackground(Color.blue);
        else if ("Yellow".equals(s1))
            setBackground(Color.yellow);
        else if ("Magenta".equals(s1))
            setBackground(Color.magenta);
        else if ("Pink".equals(s1))
            setBackground(Color.pink);
        else if ("Exit".equals(s1)){
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","WARNING", JOptionPane.OK_CANCEL_OPTION);
            if( x == 0){
                System.exit(0);
            }
        }
    }
}

public class suinanAALabExer50704 {
    public static void main(String[] args) {
        new Lst1("List");
    }
 
}
