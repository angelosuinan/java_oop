/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExerP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author suinan
 */
public class suinanAALabExerP201 {
    public static void main(String[] args) throws Exception {
            int[] val = {0, 1, 2, 3};
            int sum = 0;
            
            for(int x=0; x<val.length; x++)
                sum+=val[x];

            System.out.println("Sum of all numbers = " + sum);       
    }
}
