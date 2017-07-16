/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALiveExer3;
import javax.swing.*;
/**
 *
 * @author suinan
 */
public class suinanAALiveExer203 {
    public static void main(String[] args) {
        int q1, q2 ,q3, ave;
        q1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Ypur weight from year 1 : "));
        q2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your wieght from yaer 2 : "));
        q3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your weight from year 3 : "));
        ave = (q1 + q2 +q3)/3;
        
        String remarks;
        
        if(ave >= 55 && ave <=60  )
        {
            remarks = "Excellent Job in maintaing your weight";
        }
        else if(ave <=55)
        {
            remarks = "your Underweight"; 
        }
        else
        {
            remarks = "your obese";
        }
        System.out.println("("+q1+"+"+q2+"+"+q3+")/3 = "+ave);
        System.out.println("Your Reading is : "+ remarks);
    }
}
