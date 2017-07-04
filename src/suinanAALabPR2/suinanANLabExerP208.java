/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;
import java.io.*;
/**
 *
 * @author suinan
 */
public class suinanANLabExerP208 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int payment, dollar, quarter, dime, nickel, cents;
        System.out.print("Enter Currency: ");
        payment= Integer.parseInt(dataIn.readLine());
        dollar = payment / 100;
        quarter = (payment % 100) / 25;
        dime = ((payment % 100) % 25) / 10;
        nickel = (((payment % 100) % 25) % 10) / 5;
        cents = (((payment % 100) % 25) % 10) % 5;

        System.out.print("Your Change is: "+dollar +" dollar, "+quarter +" quarter, "+
                dime +" dime, "+nickel +" nickel, and "+cents +"cents");
    }
}
