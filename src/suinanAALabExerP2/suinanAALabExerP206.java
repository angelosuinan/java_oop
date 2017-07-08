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
public class suinanAALabExerP206 {
    public static void main(String[] args) {
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        // declare and initialize three sums
        // compute the sums
        int totalSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        for (int index = 0; index < data.length; index++) {
            //compute the sums of all the elements
            totalSum += data[index];
            //compute the sums of all the even elements
            evenSum = data[index];
            oddSum = data[index];
            if (evenSum % 2 == 0) {
                evenSum += data.length;
            } else {
                oddSum += data[index];

            }
        }

        // write out the three sums
        System.out.println("Total sum ="+totalSum);
        System.out.println("Even sum ="+evenSum);
        System.out.println("Odd sum ="+oddSum);
    }
}
