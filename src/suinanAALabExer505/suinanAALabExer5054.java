/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer505;
import java.awt.*;
/**
 *
 * @author suinan
 */

class ButtonFrame1 extends Frame {
    Button button;
    ButtonFrame1(String s) {
        super(s);
        setBackground(Color.blue);
        setSize(200,100);
        setLocation(400,50);
        button = new Button("Click Me!");
        add(button);
        setVisible(true);
    }
}
public class suinanAALabExer5054 {
    public static void main(String[] args) {
        ButtonFrame1 buttonFrame = new ButtonFrame1("Example 3");
    }
}
