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
public class suinanAALabExerPQ119 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Year of Birth");
        int birth = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter Current year");
        int current = Integer.parseInt(dataIn.readLine());
        if (current < birth) {
            birth = 100 - birth;
            int a = birth + current;
            System.out.println("Your age is " + a);
        } else {
            System.out.println("Your age is "+ (current - birth));
        }
    }
}
