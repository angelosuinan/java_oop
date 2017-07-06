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
public class suinanAALabExerPQ126 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input right front pressure");
        int rightf = Integer.parseInt(dataIn.readLine());
        if(rightf<35 || rightf>45)
            System.out.println("Warning: pressure is out of range");
        System.out.println("Input left front pressure");
        int leftf = Integer.parseInt(dataIn.readLine());
        if(leftf<35 || leftf>45)
            System.out.println("Warning: pressure is out of range");
        System.out.println("Input right rear pressure");
        int rightr = Integer.parseInt(dataIn.readLine());
        if(rightr<35 || rightr>45)
            System.out.println("Warning: pressure is out of range");
        System.out.println("Input left rear pressure");
        int leftr = Integer.parseInt(dataIn.readLine());
        if(leftr<35 || leftr>45)
            System.out.println("Warning: pressure is out of range");
        
        boolean goodPressure = true;
        if(rightf<35 || rightf>45 || leftf<35 || leftf>45 || rightr<35 || rightr>45 ||
                leftr<35 || leftr>45)
                goodPressure = false;
        if(rightf==leftf && rightr==leftr && goodPressure==true)
            System.out.println("Inflation is OK");
        else
            System.out.println("Inflation is NOT OK");
    }
}
