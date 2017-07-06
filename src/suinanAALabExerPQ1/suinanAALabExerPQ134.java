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
public class suinanAALabExerPQ134 {
    public static void main(String[] args)throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Upper Limit: ");
        int limit = Integer.parseInt(dataIn.readLine());
        
        int square = 0;
        int cube = 0;
        for(int x=1; x<=limit; x++)          
            square+= Math.pow(x,2);
        System.out.println("The sum of square is: "+square);
        for(int x=1; x<=limit; x++)
            cube+= Math.pow(x, 3);
        System.out.println("The sum of cube is: "+cube);
    }
}
