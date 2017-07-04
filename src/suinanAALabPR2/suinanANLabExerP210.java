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
public class suinanANLabExerP210 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        float cost, kwatts, total;              
        System.out.println("Enter cost of kilowatt-hour  in cents : ");  
        cost = Float.parseFloat(dataIn.readLine());  
        System.out.println("Enter kilowatt-hours used per year : ");  
        kwatts = Float.parseFloat(dataIn.readLine());  
        total =  (cost * kwatts )/100  ;  
        System.out.println("Annual cost : " + total);  
    }
}
