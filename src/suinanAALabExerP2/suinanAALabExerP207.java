/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExerP2;
import java.io.*;
/**
 *
 * @author suinan
 */
public class suinanAALabExerP207 {
    public static void main(String[] args) throws IOException {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        // declare and initialize variables for the two largest
        // compute the two largest
        int large1 = data[0];
        int large2 = data[1];
        for (int index = 0 ; index < data.length; index++) {
            if(data[index]>=large1){
                large1 = data[index];
            }
            else if(data[index] >=large2){
                large2 = data[index];
            }
        }
        // write out the two largest
        System.out.println(large1+" and "+large2);
    }
}
