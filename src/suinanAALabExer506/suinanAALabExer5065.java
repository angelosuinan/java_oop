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
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class suinanAALabExer5065 {
    static class Event2 extends Frame {
        Button b1, b2, b3, b4, b5;
        Label label1;
        TextField text1;
        public Event2(String s) {
            super(s);
            setLayout(new FlowLayout());
            //Panel p
            Panel p = new Panel();
            p.setLayout(new GridLayout(2,2));
            b1 = new Button("New"); b2 = new Button("Edit");
            b3 = new Button("Delete"); b4 = new Button("Exit");
            p.add(b1); p.add(b2); p.add(b3); p.add(b4);
            //Panel q
            Panel q = new Panel();
            q.setLayout(new GridLayout(1,2));
            label1 = new Label("Output here: ");
            text1 = new TextField();
            q.add(label1);
            q.add(text1);
            //Main Frame
            add(p); add(q); layout(); pack(); show();
         }
         public boolean action(Event e, Object o) {
            if ("New".equals(e.arg)){
                text1.setText("New");
                JOptionPane.showMessageDialog(null, "New was clicked!");
            }
            else if ("Edit".equals(e.arg)){
                text1.setText("Edit");
                JOptionPane.showMessageDialog(null, "Edit was clicked!");
            }
            else if ("Delete".equals(e.arg)){
                text1.setText("Delete");
                JOptionPane.showMessageDialog(null, "Delete was clicked!");
            }
            else{
                int x = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.OK_CANCEL_OPTION);
                if(x == 0){
                    System.exit(0);
                }
            }
            return(super.action(e,e.target));
         }
         public boolean handleEvent(Event evt) {
            if (evt.id == Event.WINDOW_DESTROY) {
            hide();
            System.exit(0);
            }
            return(super.handleEvent(evt));
         }
    }
    public static void main(String[] args) {
        new Event2("Event Example 2");
    }
}
