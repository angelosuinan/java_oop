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
public class suinanAALabExerPQ116 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final int miles = 200;
        System.out.println("Tank Capacity: ");
        int capacity = Integer.parseInt(dataIn.readLine());
        System.out.println("Gage reading: ");
        int gage = Integer.parseInt(dataIn.readLine());
        System.out.println("Miles per gallon");
        int milesPerGallon = Integer.parseInt(dataIn.readLine());
        
        int currentGal = gage * capacity / 100;
        int maxdistance = currentGal * milesPerGallon;
        
        if (maxdistance < 200)
            System.out.print("Get Gas!");
        else
            System.out.print("Safe to Proceed");
    }
}
