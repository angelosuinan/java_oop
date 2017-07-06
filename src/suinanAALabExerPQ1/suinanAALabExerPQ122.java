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
public class suinanAALabExerPQ122 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of items");
        int item = Integer.parseInt(dataIn.readLine());
        System.out.println("Enter single-item heating time");
        int single = Integer.parseInt(dataIn.readLine());
        if(item==1)
            System.out.println("heating time: "+single);
        else if(item==2)
            System.out.println("heating time: "+(single + single*.5));
        else if (item>3)
            System.out.println("Heating more than three items at once is not recommended");
        else
            System.out.println("Invalid Input");
        
    }
}
