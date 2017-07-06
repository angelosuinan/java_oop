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
public class suinanAALabExerPQ135 {
    public static void main(String[] args)throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter X");
        float x = Float.parseFloat(dataIn.readLine());
        System.out.println("Enter N");
        int n = Integer.parseInt(dataIn.readLine());
        
        if(n<1){
            System.out.println("N must be a positive integer.");
            System.exit(0);
        }
        System.out.println(x+" raised to the power "+n+"is: "+(Math.pow(x,n)));
    }
}
