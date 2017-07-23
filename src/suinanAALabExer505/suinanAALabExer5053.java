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

class ColoredFrame extends Frame {
    ColoredFrame(String s, Color color, int x, int y) {
        super(s+color.toString());
        setBackground(color);
        setSize(350,100);
        setLocation(x,y);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}

public class suinanAALabExer5053 {
    public static void main(String[] args) {
        new ColoredFrame("Red: ",Color.red, 0,0);
        new ColoredFrame("Green: ",Color.green,0,100);
        new ColoredFrame("Yellow: ",Color.yellow,0,200);
        new ColoredFrame("Blue: ",Color.blue,0,300);
        new ColoredFrame("Pink: ",Color.pink,0,400);
        
    }
}

