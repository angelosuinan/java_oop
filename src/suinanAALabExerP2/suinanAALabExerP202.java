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
public class suinanAALabExerP202 {
    public static void main(String[] args) {
        int[] val = {13, -4, 82, 17};
        int[] twice;

        System.out.println("Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
        // Construct an array object for twice.

        // Put values in twice that are twice the
        // corresponding values in val.
        twice = new int[val.length];
        for(int x=0; x<val.length; x++)
            twice[x] = val[x] * 2;
        
        System.out.println("New Array: "
                + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
}
