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
public class suinanAALabExerPQ121 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Air Temperature in Kelvins: ");
        int air = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter Steam Temperature in Kelvins: ");
        int steam = Integer.parseInt(dataIn.readLine());
        
        if(steam<373){
            System.out.println("Efficieny is Zero");
            System.exit(0);
        }
        float eff =  1 - air/steam;
        System.out.println("Efficieny is: "+eff);
    }
}
