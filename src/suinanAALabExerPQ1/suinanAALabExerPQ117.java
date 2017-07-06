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
public class suinanAALabExerPQ117 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your weight");
        int weight = Integer.parseInt(dataIn.readLine());
        if(weight>=220 && weight<=280)
            System.out.println("Your allowed");
        else 
            System.out.println("Your not allowed");
    }
}
