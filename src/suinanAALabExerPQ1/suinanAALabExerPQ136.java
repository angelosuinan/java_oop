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
public class suinanAALabExerPQ136 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Initial number of stars: ");
        int stars = Integer.parseInt(dataIn.readLine());
        int len = stars;
        for(int x=0; x<len; x++){
            for(int y=0; y<stars; y++){
                System.out.print("*");
            }
            stars--;
            System.out.println();
        }
    }
}
