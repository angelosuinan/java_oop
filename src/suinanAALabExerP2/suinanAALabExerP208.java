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
public class suinanAALabExerP208 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        

        for (int j = 0; j < data.length / 2;j++){
            int temp = data[j];
            data[j] = data[data.length - 1 - j];
            data[data.length - 1 - j] = temp;
        }
        // write out the result
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j]+" ");
        }
        
        System.out.println();
        
        
    }
}
