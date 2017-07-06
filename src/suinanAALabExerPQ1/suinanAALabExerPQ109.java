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
public class suinanAALabExerPQ109 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter voltage: ");
        int volt = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter resistance: ");
        int ohm = Integer.parseInt(dataIn.readLine());
        System.out.println("Amperage is: "+((volt+0.0)/ohm));
    }
}
