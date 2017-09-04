
package suinanAALabExer508;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class suinanAALabExer5087 extends JFrame {
    
    private JList colorList;
    private Container c;
    private String colorNames[] = {"Black", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow", "Exit"};
    private Color colors[] = {Color.black, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
    public suinanAALabExer5087() {
        super("List Test");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.add(new JScrollPane(colorList));
        colorList.addListSelectionListener (
        new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent e){
            try{
                c.setBackground(colors[colorList.getSelectedIndex()]);
            }catch(ArrayIndexOutOfBoundsException er){
                System.exit(0);
            }
        }
        });
        setSize(350, 150);
        show();
    }
    public static void main(String[] args) {
        suinanAALabExer5087 app = new suinanAALabExer5087();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
