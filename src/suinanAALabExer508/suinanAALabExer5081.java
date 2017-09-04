
package suinanAALabExer508;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class suinanAALabExer5081 extends JFrame {

    JLabel label1, label2, label3;
    
    public suinanAALabExer5081() {
        super("Testing JLabel");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,1));
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1.");
        c.add(label1);
        Icon anchor = new ImageIcon("folder_closed.png");
        label2 = new JLabel("Label with text and icon",anchor,SwingConstants.LEFT);
        label2.setToolTipText("This is label2.");
        c.add(label2);
        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(anchor);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        c.add(label3);
        setSize(375,270);
        show();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        suinanAALabExer5081 app = new suinanAALabExer5081();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
