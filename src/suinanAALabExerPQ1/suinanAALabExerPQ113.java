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
public class suinanAALabExerPQ113 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter X: ");
        int x = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter Y: ");
        int y = Integer.parseInt(dataIn.readLine());
        System.out.println("Arithmetic mean: "+ (x+y)/2);
        System.out.println("Harmonic mean: "+ 2/(1/(x+0.0) +1/(y+0.0)));
    }
}
