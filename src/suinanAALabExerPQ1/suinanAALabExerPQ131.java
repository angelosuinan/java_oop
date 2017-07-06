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
public class suinanAALabExerPQ131 {
    public static void main(String[] args)throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("How many integers will be added: ");
        int many = Integer.parseInt(dataIn.readLine());
        int sum = 0;
        for(int x=0; x<many; x++){
            System.out.println("Enter an Integer");
            sum+= Integer.parseInt(dataIn.readLine());
        }
        System.out.println("The sum is: "+sum);
    }
}
