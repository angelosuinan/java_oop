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
public class suinanAALabExerPQ118 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Price per pound package A: ");
        double priceA = Double.parseDouble(dataIn.readLine());
        System.out.println("Percent lean package A: ");
        double leanA = Double.parseDouble(dataIn.readLine());
        System.out.println("Price per pound package B: ");
        double priceB = Double.parseDouble(dataIn.readLine());
        System.out.println("Percent lean package B: ");
        double leanB = Double.parseDouble(dataIn.readLine());

        double percentA = 100 - leanA;
        double percentB = 100 - leanB;
        double A = priceA / leanA * 100;
        double B = priceB / leanB * 100;

        System.out.println("");
        System.out.printf("Package A cost per pound of lean: %.2f ", A);
        System.out.println("");
        System.out.printf("Package B cost per pound of lean:%.4f ", B);
        System.out.println("");

        if (A < B) {
            System.out.println("package A is the best value");
        } else {
            System.out.println("package B is the best value");
        }
    }
}
