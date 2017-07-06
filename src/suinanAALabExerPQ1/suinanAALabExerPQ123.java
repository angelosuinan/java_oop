/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExerPQ1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author suinan
 */
public class suinanAALabExerPQ123 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Welcome to Yertle's Quest\n"
                + "Enter the name of your character:");
        String name = dataIn.readLine();
        System.out.println("Enter strength (1-10): ");
        int strength = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter health (1-10): ");
        int health = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter luck (1-10):");
        int luck = Integer.parseInt(dataIn.readLine());
        
        if(strength+health+luck<15)
            System.out.println("You have give your character too many points! Default values have been assigned:\n"
                    + "Chortle, strength: "+strength+", health: "+ health+", luck:"+ luck);
        else
            System.out.println("You have give your character too many points! Default values have been assigned:\n"
                    + "Chortle, strength: 5, health: 5, luck: 5");
    }
}
