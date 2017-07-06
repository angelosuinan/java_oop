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
public class suinanAALabExerPQ125 {
    public static void main(String[] args)throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input right front pressure");
        int rightf = Integer.parseInt(dataIn.readLine());
        System.out.println("Input left front pressure");
        int leftf = Integer.parseInt(dataIn.readLine());
        System.out.println("Input right rear pressure");
        int rightr = Integer.parseInt(dataIn.readLine());
        System.out.println("Input left rear pressure");
        int leftr = Integer.parseInt(dataIn.readLine());
        
        if(rightf==leftf && rightr==leftr)
            System.out.println("Inflation is OK");
        else
            System.out.println("Inflation is NOT OK");
    }
}
