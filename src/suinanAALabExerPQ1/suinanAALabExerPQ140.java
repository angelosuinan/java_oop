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
public class suinanAALabExerPQ140 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.println("Weight of order: ");
            int weight = Integer.parseInt(dataIn.readLine());
            double cost = 3.0;
            if(weight==0)
                break;
            if(weight>10)
                cost = cost+(weight-10)*0.25;
            System.out.print("Shipping cost: "+ cost);
        }
        System.out.println("bye");
    }
}
