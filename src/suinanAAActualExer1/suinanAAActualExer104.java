/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAAActualExer1;
//Test if a given Random Number is prime or not
import java.io.*;
import java.util.*;
/**
 *
 * @author suinan
 */
public class suinanAAActualExer104 {
    public static void main(String[] args) {
        Random x = new Random();
        float y = x.nextFloat();
        System.out.println("y = " + y);
        int n = (int)Math.floor(99*y+2);
        for(int d=2; d<n; d++)
            if(n%d==0){
                System.out.println(n + " is not prime.");
                return;
            }
        System.out.println(n + " is prime.");
    }
}
