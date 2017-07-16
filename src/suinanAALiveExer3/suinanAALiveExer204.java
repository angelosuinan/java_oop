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
public class suinanAALiveExer204 {
    public static void main(String[] args) {
        String name;
        
        name = JOptionPane.showInputDialog("Enter your name : ");
        System.out.println("Hello "+ name);
        
        String input;
        input = JOptionPane.showInputDialog("How old are you? :");
        
        int age, year;
        age = Integer.parseInt(input);
        year = 18 - age;
        if(year > 0){
            System.out.println("Your not allowed in this club");
            System.out.println("Wait for more than " + Math.abs(year)+ " years");
        }
        else
            System.out.println("Your allowed in this club");
            
    }
}
