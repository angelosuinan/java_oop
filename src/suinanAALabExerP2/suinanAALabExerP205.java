/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExerP2;

/**
 *
 * @author suinan
 */
public class suinanAALabExerP205 {
    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int temp;
        System.out.println("Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
        // reverse the order of the numbers in the array
        temp = val[0];
        val[0] = val[3]; 
        val[3] = temp;

        temp = val[1];
        val[1] = val[2]; 
        val[2] = temp;
        System.out.println("Reversed Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}
