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
public class suinanAALabExerPQ124 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What is the balance of your checking account: $");
        int checking = Integer.parseInt(dataIn.readLine());
        System.out.println("What is your balance of your saving account: $");
        int saving = Integer.parseInt(dataIn.readLine());
        
        if(checking>1000||saving>1500)
            System.out.println("0.00 dollars per check");
        else
            System.out.println("0.15 dollars per check");
    }
}
