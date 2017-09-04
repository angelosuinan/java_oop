
package suinanAALabExer508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class suinanAALabExer5085 extends JFrame {
    
    private JTextField t;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plain, bold, italic, boldItalic, clear;
    private ButtonGroup radioGroup;
    
    public suinanAALabExer5085(){
        super("RadioButton Test");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Watch the font style change.", 25);
        c.add(t);
        plain = new JRadioButton("Plain", true);
        bold = new JRadioButton("Bold", false);
        italic = new JRadioButton("Italic", false);
        boldItalic = new JRadioButton("Bold/Italic", false);
        clear = new JRadioButton("Clear", false);
        c.add(plain);
        c.add(bold);
        c.add(italic);
        c.add(boldItalic);
        c.add(clear);
        RadioButtonHandler handler = new RadioButtonHandler();
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);
        clear.addItemListener(handler);
        radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);
        radioGroup.add(clear);
        plainFont = new Font("Verdana", Font.PLAIN, 14);
        boldFont = new Font("Verdana", Font.BOLD, 14);
        italicFont = new Font("Verdana", Font.ITALIC, 14);
        boldItalicFont = new Font("Verdana", Font.BOLD+Font.ITALIC, 14);
        t.setFont(plainFont);
        setSize(350, 100);
        show();
    }

    public static void main(String[] args) {
        suinanAALabExer5085 app = new suinanAALabExer5085();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class RadioButtonHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == plain)
                t.setFont(plainFont);
            else if (e.getSource() == bold)
                t.setFont(boldFont);
            else if (e.getSource() == italic)
                t.setFont(italicFont);
            else if (e.getSource() == boldItalic)
                t.setFont(boldItalicFont);
            else if (e.getSource() == clear)
                t.setText(" ");
            t.repaint();
        }
    }

}
