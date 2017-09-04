/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer506;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class suinanAALabExer5061 extends Frame implements ActionListener{
    Button b1,b2,b3;
    TextField W,X,Y;
    public suinanAALabExer5061(String s) {
            super(s);
            setLayout(new BorderLayout());
            setFont(new Font("Arial",Font.BOLD,14));
            setBackground(Color.blue);
            setForeground(Color.white);
            setResizable(false);
            Label A = new Label("Student Information",Label.CENTER);
            add("North",A);
            Panel p = new Panel();
            p.setLayout(new GridLayout(3,1));
            p.setFont(new Font("Arial",(Font.BOLD+Font.ITALIC),11));
            p.setForeground(Color.black);
            Label B = new Label("Student Number: ");
            Label C = new Label("Student Name : ");
            Label D = new Label("Student Grade : ");
            W = new TextField();
            X = new TextField();
            Y = new TextField();
            p.add(B);
            p.add(W);
            p.add(C);
            p.add(X);
            p.add(D);
            p.add(Y);
            add(p,"Center");
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q.setForeground(Color.black);
            q.setFont(new Font("Arial",Font.BOLD,12));
            b1 = new Button("Save");
            b2 = new Button("Cancel");
            b3 = new Button("Exit");
            q.add(b1);
            q.add(b2);
            q.add(b3);
            add("South",q);
            pack();
            show();
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
        }

    public static void main(String[] args) {
        // TODO code application logic here
        suinanAALabExer5061 a = new suinanAALabExer5061("Example 1");
    }
    
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == b1){
            JOptionPane.showMessageDialog(null, "Record has been saved!");
            W.setText(" ");
            X.setText(" ");
            Y.setText(" ");
        } else if(e.getSource() == b2){
            JOptionPane.showMessageDialog(null, "Record has been cancelled!");
            W.setText(" ");
            X.setText(" ");
            Y.setText(" ");
        } else if(e.getSource() == b3){
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","WARNING", JOptionPane.OK_CANCEL_OPTION);
            if( x == 0){
                System.exit(0);
            }
        }
    }
    
}
