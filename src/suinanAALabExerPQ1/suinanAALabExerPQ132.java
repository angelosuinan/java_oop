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
public class suinanAALabExerPQ132 {
    public static void main(String[] args)throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter N: ");
        int num = Integer.parseInt(dataIn.readLine());
        double sum =0;
        for(int x=1; x<=num; x++)
            sum+= 1.0/x;
        System.out.println("Sum is:" +sum);
    }
}
