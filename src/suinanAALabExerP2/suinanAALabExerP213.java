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
public class suinanAALabExerP213 {
    public static void main(String[] args) throws Exception {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};
        // declare the sum
        // compute the sums for each row
        for (int col = 0; col < data[3].length; col++) {
            int sum = 0;
            try{
                for (int row = 0; row < data[col].length; row++) {
                    try{
                        sum += data[row][col];
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        continue;
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                
            }
            System.out.println("sum of col : " + sum);
        }
    }
}
