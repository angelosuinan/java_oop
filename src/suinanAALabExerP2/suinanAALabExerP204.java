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
public class suinanAALabExerP204 {
    public static void main(String[] args) {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {0, 0, 0, 0};

        // Put values into valB so that the sum of the values
        // in corresponding slots of valA and valB is 25.
        for(int x=0; x<valB.length; x++)
            valB[x] = 25 - valA[x];
        System.out.println("valA: "
                + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);
        System.out.println("valB: "
                + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
        System.out.println("sum: "
                + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " "
                + (valA[2] + valB[2]) + " " + (valA[3] + valB[3]));
    }
}
