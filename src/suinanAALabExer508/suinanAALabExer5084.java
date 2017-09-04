
package suinanAALabExer508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class suinanAALabExer5084 extends JFrame {
    
    private JTextField t;
    private JCheckBox bold, italic;
    public suinanAALabExer5084() {
        super("JCheckBox Test");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Watch the font style change", 20);
        t.setFont(new Font("Verdana", Font.PLAIN, 14));
        c.add(t);
        bold = new JCheckBox("Bold");
        c.add(bold);
        italic = new JCheckBox("Italic");
        c.add(italic);
        CheckBoxHandler handler = new CheckBoxHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        setSize(275,100);
        show();
    }

    public static void main(String[] args) {
        suinanAALabExer5084 app = new suinanAALabExer5084();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private class CheckBoxHandler implements ItemListener {
        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;
        int ctr = 0;
        public void itemStateChanged(ItemEvent e){
            if (e.getSource() == bold){
                if (e.getStateChange() == ItemEvent.SELECTED){
                    valBold = Font.BOLD;
                    ctr++;
                }else{
                    valBold = Font.PLAIN;
                    ctr--;
                }
            }
            if (e.getSource() == italic){
                if (e.getStateChange() == ItemEvent.SELECTED){
                    valBold = Font.ITALIC;
                    ctr++;
                }else{
                    valBold = Font.PLAIN;
                    ctr--;
                }
            }
            if (ctr == 2){
                valBold = Font.BOLD+Font.ITALIC;
            }
            t.setFont(new Font("Verdana", valBold+valItalic, 14));
            t.repaint();
        }
    }
}
