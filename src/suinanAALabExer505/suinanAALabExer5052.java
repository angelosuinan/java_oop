/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer505;

/**
 *
 * @author suinan
 */
import java.awt.*; 
import java.awt.event.*;
class MyFrame extends Frame {

    MyFrame(String s) {
        super(s);
        
        setBackground(Color.blue);
        setSize(250, 100);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
public class suinanAALabExer5052 {
    public static void main(String[] args) {
        System.out.println("Creating a 250x100-pixel frame.");
        new MyFrame("Example 2");
        System.out.println("To quit, click on this window and press Ctrl+C");
    }
    
}
