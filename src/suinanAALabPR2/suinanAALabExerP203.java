/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author suinan
 */
public class suinanAALabExerP203 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Rainfall for April: \t");
        double april = Integer.parseInt(dataIn.readLine());
        System.out.print("Rainfall for May: \t");
        double may = Integer.parseInt(dataIn.readLine());
        System.out.print("Rainfall for June: \t");
        double june = Integer.parseInt(dataIn.readLine());
        double ave = (april+may+june) / 3;
        System.out.println("Average rainfall: \t"+ave);
    }
}
