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
public class suinanAALabExerPQ112 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a double: ");
        double input = Double.parseDouble(dataIn.readLine());
        System.out.println("Base 2 log of "+input+" is "+Math.log(input)/Math.log(2));
    }
}
