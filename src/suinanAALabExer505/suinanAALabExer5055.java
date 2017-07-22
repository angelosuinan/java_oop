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
class ButtonFrame2 extends Frame {
    ButtonFrame2(String s) {
        super(s);
        setSize(200,130);
        setLayout(new FlowLayout());
        for (int i=0; i<6; i++)
            add(new Button("Button " + i));
        setVisible(true);
    }
}

public class suinanAALabExer5055 {
    public static void main(String[] args) {
        ButtonFrame2 buttonFrame = new ButtonFrame2("Example 4");
    }
}
