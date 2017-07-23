/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer505;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author suinan
 */
class ButtonFrame3 extends Frame {
    ButtonFrame3(String s) {
        super(s);
        setSize(300,200);
        setLayout(new GridLayout(4,3));
        for (int i=0; i<12; i++)
            add(new Button("Button "+i));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
public class suinanAALabExer5056 {
    public static void main(String[] args) {
        new ButtonFrame3("Example 5");
    }
}
