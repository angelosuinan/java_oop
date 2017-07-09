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
public class suinanAALabExerP211 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5}, {1, 4, 4, 8, 13},
        {9, 1, 0, 2},
        {0, 2, 6, 3, -1, -8}};
        // declare the sum
        // compute the sum
        int sum = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
        }
// write out the sum
        System.out.println("sum is : "+sum);
    }
}
