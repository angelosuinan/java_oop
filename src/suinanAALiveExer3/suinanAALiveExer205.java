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
public class suinanAALiveExer205 {
    public static void main(String[] args) {
        String pword, pword2;
        
        pword = JOptionPane.showInputDialog("Register your password : ");
        JPasswordField varA= new JPasswordField(); 
        
        String flag = "f";
        
        do{
            JOptionPane.showConfirmDialog(null, varA, "Enter Password",JOptionPane.OK_CANCEL_OPTION);
            if (pword.equalsIgnoreCase(pword)){
                flag="t";
                System.out.println("Congratulation, Access Granted");
            }
            else
                System.out.println("Access Denied");
        }while(flag.equals("f"));
    }
}
