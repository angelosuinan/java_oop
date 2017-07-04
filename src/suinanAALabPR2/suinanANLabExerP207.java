/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;

import java.io.*;

/**
 *
 * @author suinan
 */
public class suinanANLabExerP207 {
    public static void main(String[] args) throws Exception {
        System.out.print("Input the cents: ");
        int input = 0;
        double input1 = 0;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(dataIn.readLine());
       
        int dollars = input/100;  
        int cents = input%100;
        System.out.println("That is "+dollars+" dollars and "+cents+" cents.");
    }
}
