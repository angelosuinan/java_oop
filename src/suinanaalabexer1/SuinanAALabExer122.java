/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanaalabexer1;
import javax.swing.JOptionPane;
/**
 *
 * @author suinan
 */
public class SuinanAALabExer122 {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Please Enter your name");
        String msg = "Hello " + name + "!"; 
        JOptionPane.showMessageDialog(null, msg);
    }
}
