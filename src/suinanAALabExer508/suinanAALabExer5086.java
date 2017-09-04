
package suinanAALabExer508;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class suinanAALabExer5086 extends JFrame {
    
    private JComboBox images;
    private JLabel label;
    private String names[] = {"superman.gif","kitten.gif","dog.gif"};
    private Icon icons[] = {new ImageIcon(names[0]), new ImageIcon(names[1]), new ImageIcon(names[2])};
    
    public suinanAALabExer5086() {
        super("Testing JComboBox");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        images = new JComboBox(names);
        images.setMaximumRowCount(3);
        images.addItemListener(
        new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setIcon(icons[images.getSelectedIndex()]);
            }
        });
        c.add("North", images);
        label = new JLabel(icons[0]);
        c.add("Center", label);
        setSize(350, 300);
        show();
    }
    public static void main(String[] args) {
        suinanAALabExer5086 app = new suinanAALabExer5086();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
