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
public class suinanAALabExerPQ115 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final int boltPrice = 5, nutPrice = 3, washerprice = 1;
        System.out.println("Number of bolts: ");
        int bolts = Integer.parseInt(dataIn.readLine());
        System.out.println("Number of nuts: ");
        int nuts = Integer.parseInt(dataIn.readLine());
        System.out.println("number of washer: ");
        int washers = Integer.parseInt(dataIn.readLine());
        
        if (bolts>nuts)
            System.out.println("Check the order");
        else
            System.out.println("Order is Ok");
        int ans = (boltPrice * bolts) + (nutPrice * nuts) + (washerprice * washers);
        System.out.println("Total cost: "+ans);
    }
}
