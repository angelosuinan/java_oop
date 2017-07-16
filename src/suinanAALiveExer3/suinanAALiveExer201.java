/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALiveExer3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author suinan
 */
public class suinanAALiveExer201 {
    public static void main(String[] args) {
        double q1, q2, q3, ave;
        q1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Q1 : "));
        q2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Q2 : "));
        q3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Q3 : "));
        
        ave = (q1 + q2 + q3) / 3;
     
        System.out.println("("+q1+"+"+q2+"+"+q3+")/3 = "+ave);
    }
}
