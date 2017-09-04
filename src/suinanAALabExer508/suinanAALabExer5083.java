
package suinanAALabExer508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class suinanAALabExer5083 extends JFrame {
    
    private JButton plainButton, fancyButton, b3;
    public suinanAALabExer5083() {
        super("Testing Buttons");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        plainButton = new JButton("Plain Button");
        plainButton.setToolTipText("Button1");
        c.add(plainButton);
        Icon image1 = new ImageIcon("HTMLFILE.gif");
        Icon image2 = new ImageIcon("folder.gif");
        fancyButton = new JButton("Fancy Button", image1);
        fancyButton.setRolloverIcon(image2);
        fancyButton.setToolTipText("Button2");
        c.add(fancyButton);
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);
        b3 = new JButton("Hide Button!");
        b3.addActionListener(handler);
        c.add(b3);
        setSize(275, 100);
        show();
    }
    public static void main(String[] args) {
        suinanAALabExer5083 app = new suinanAALabExer5083();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b3){
                plainButton.setVisible(false);
                fancyButton.setVisible(false);
            }
            JOptionPane.showMessageDialog(null, "You pressed: " +
            e.getActionCommand()); 
        }
    }
}
