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
public class suinanAALabExerPQ130 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter first word: ");
        String first = dataIn.readLine();
        System.out.println("Enter second word: ");
        String second = dataIn.readLine();
        
        for(int x=0; x<=30; x++){
            if(x<first.length()-1)
                continue;
            if(x==first.length()-1)
                System.out.print(first);
            else if(30-second.length()-1==x){
                    System.out.print(second);
                    break;
            }
            else
                System.out.print(".");
        }
              
    }
}
