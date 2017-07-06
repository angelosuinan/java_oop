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
public class suinanAALabExerPQ128 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter start:");
        int start = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter end:");
        int end = Integer.parseInt(dataIn.readLine());
        System.out.println();
        
        for(int x=start; x<=end; x++)
            System.out.println(x);
    }
}
