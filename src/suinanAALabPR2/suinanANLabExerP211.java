/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author suinan
 */
public class suinanANLabExerP211 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        float time;
        System.out.println("Enter the number of seconds: ");
        time = Float.parseFloat(dataIn.readLine());
        System.out.println("Distance: "+(0.5*(32.174*(time*time))));
    }
}
