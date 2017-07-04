/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suinan
 */
public class suinanANLabExerP206 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the radius: ");
        double input1 = 0;
        try{
            input1 = Integer.parseInt(dataIn.readLine());
        }catch( IOException e){
            System.out.println("Error!");
        }
        double area = (Math.PI) * (input1 * input1);
        System.out.println("The radius is "+input1+" The area is: "+ area);
    }
}
