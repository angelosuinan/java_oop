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
public class suinanAALabExerPQ138 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double initial_o, final_o, gallons, total;

        while (true) {
            System.out.println("Initial miles: ");
            initial_o = Double.parseDouble(dataIn.readLine());
            if (initial_o < 0) {
                break;
            }

            System.out.println("Final miles: ");
            final_o = Double.parseDouble(dataIn.readLine());

            System.out.println("gallons: ");
            gallons = Double.parseDouble(dataIn.readLine());

            total = (final_o - initial_o) / gallons;

            System.out.println("Miles per Gallon: " + total);

        }
        System.out.println("bye");
    }
}
