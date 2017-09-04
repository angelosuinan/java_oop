/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer506;

import java.awt.Button;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ASUS
 */
public class suinanAALabExer5064 {
    static class Event1 extends Frame {
        Label label1;
        Button button1, button2;
        public Event1(String s) {
            super(s);
            button1 = new Button("Click Me!");
            label1 = new Label("This is where we will show if button was clicked.");
            button2 = new Button("Exit");
            setLayout(new FlowLayout());
            add(button1);
            add(label1);
            add(button2);
            layout();
            pack();
            show();
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
        }
        public boolean action(Event e, Object o) {
            if ("Click Me!".equals(e.arg))
                label1.setText("Button was clicked!");
            
            if ("Exit".equals(e.arg))
                System.exit(0);
            
            return(super.action(e,e.target));
        }
    }
    public static void main(String[] args) {
        new Event1("Event Example 1");
    }
}
