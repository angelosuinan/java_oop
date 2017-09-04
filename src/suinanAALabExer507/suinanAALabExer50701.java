
package suinanAALabExer507;


import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Apl1 extends Frame implements ActionListener, WindowListener {
    TextField T1, T2, T3;
    Label L1, L2, L3, label;
    Button B1, B2, B3, B4, B5;
    Apl1(String s) {
    super(s);
    setLayout(new FlowLayout());
    setSize(280,200);
    addWindowListener(this);
    label = new Label("");
    Panel p = new Panel();
    p.setLayout(new GridLayout(3,2));
    L1 = new Label("Firstname: ");
    L2 = new Label("Middle Initial: ");
    L3 = new Label("Lastname: ");
    T1 = new TextField();
    T2 = new TextField();
    T3 = new TextField();
    p.add(L1);
    p.add(T1);
    p.add(L2);
    p.add(T2);
    p.add(L3);
    p.add(T3);
    Panel q = new Panel();
    q.setLayout(new FlowLayout());
    B1 = new Button("Output");
    B2 = new Button("Clear");
    B3 = new Button("Exit");
    B4 = new Button("CAPITAL");
    B5 = new Button("SMALL");
    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);
    q.add(B1);
    q.add(B2);
    q.add(B4);
    q.add(B5);
    q.add(B3);
    Panel r = new Panel();
    r.setLayout(new GridLayout(2,1));
    r.add(label);
    r.add(q);
    add(p);
    add(r);
    layout();
    show();
}
    
public void windowClosed(WindowEvent event) {}
public void windowDeiconified(WindowEvent event) {}
public void windowIconified(WindowEvent event) {}
public void windowActivated(WindowEvent event) {}
public void windowDeactivated(WindowEvent event) {}
public void windowOpened(WindowEvent event) {}

public void windowClosing(WindowEvent event)
{
    System.exit(0);
}

public void actionPerformed(ActionEvent event) {
    if(event.getActionCommand().equals("Output")) {
        label.setAlignment(1);
        label.setText(T1.getText()+" "+ T2.getText()+". "+T3.getText());
    }
    else if (event.getActionCommand().equals("Clear")) {
        T1.setText("");
        T2.setText("");
        T3.setText("");
        label.setText("");
    } else if (event.getActionCommand().equals("Exit")) {
        int x = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.OK_CANCEL_OPTION);
        if(x == 0){
            System.exit(0);
        }
    } else if (event.getActionCommand().equals("CAPITAL")) {
        T1.setText(T1.getText().toUpperCase());
        T2.setText(T2.getText().toUpperCase());
        T3.setText(T3.getText().toUpperCase());
        label.setText(label.getText().toUpperCase());
    } else if (event.getActionCommand().equals("SMALL")) {
        T1.setText(T1.getText().toLowerCase());
        T2.setText(T2.getText().toLowerCase());
        T3.setText(T3.getText().toLowerCase());
        label.setText(label.getText().toLowerCase());
    }
}
}

public class suinanAALabExer50701 {
    public static void main(String[] args) {
        new Apl1("Example");
    }
    
}
