
package suinanAALabExer508;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class suinanAALabExer5082 extends JFrame {
    
    JTextField text1, text2, text3;
    JPasswordField password;
    Button b1, b2;
    public suinanAALabExer5082(){
        super("Testing JTextField and JPasswordField");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        text1 = new JTextField(10);
        text1.setToolTipText("This is text1.");
        c.add(text1);
        text2 = new JTextField("Enter text here");
        text2.setToolTipText("This is text2.");
        c.add(text2);
        text3 = new JTextField("Uneditable Text Field", 20);
        text3.setToolTipText("This is text3.");
        text3.setEditable(false);
        c.add(text3);
        password = new JPasswordField("Hidden Text");
        password.setToolTipText("This is password field.");
        c.add(password);
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener(handler);
        text2.addActionListener(handler);
        text3.addActionListener(handler);
        password.addActionListener(handler);
        b1 = new Button("UPPER");
        b1.addActionListener(handler);
        b2 = new Button("CLEAR");
        b2.addActionListener(handler);
        c.add(b1);
        c.add(b2);
        setSize(425, 100);
        show();
    }
    
    public static void main(String[] args) {
        suinanAALabExer5082 app = new suinanAALabExer5082();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = "";
            if (e.getSource() == text1)
                s = "text1: " + e.getActionCommand().toUpperCase();
            else if (e.getSource() == text2)
                s = "text2: " + e.getActionCommand().toUpperCase();
            else if (e.getSource() == text3)
                s = "text3: " + e.getActionCommand().toUpperCase();
            else if (e.getSource() == password){
                JPasswordField pwd = (JPasswordField) e.getSource();
                s = "password: " + new String(pwd.getPassword());
            } else if (e.getSource() == b1){
                text1.setText(text1.getText().toUpperCase());
                text2.setText(text2.getText().toUpperCase());
                text3.setText(text3.getText().toUpperCase());
                password.setText(password.getText().toUpperCase());
                s = "CAPITALIZED!";
            } else if (e.getSource() == b2){
                text1.setText(" ");
                text2.setText(" ");
                text3.setText(" ");
                password.setText(" ");
                s = "CLEARED!";
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }

}
