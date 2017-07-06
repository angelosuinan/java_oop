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
public class suinanAALabExerPQ120 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        double total_price;

        System.out.println("Enter your item please:");
        String item = dataIn.readLine();

        System.out.println("Enter the price of your item please:");
        double price = Integer.parseInt(dataIn.readLine());

        System.out.println("Do you want overnight delivery? (Y/N): ");
        char overnight = dataIn.readLine().charAt(0);
        int shipping = 0;
        double total = 0;
        if (overnight == 'Y' && price > 10) {
            shipping = 3 + 5;
            total = shipping + price;
            System.out.println("Invoice: \n" + item + "\n" + price + "\n" + "Shipping: " + "$" + shipping + "\n" + "Total: $ " + total);

        } else if (overnight == 'Y' && price < 10) {
            shipping = 2 + 5;
            total = shipping + price;
            System.out.println("Invoice: \n" + item + "\n" + price + "\n" + "Shipping: " + "$" + shipping + "\n" + "Total: $ " + total);

        } else if (overnight == 'N' && price > 10) {
            shipping = 3 + 5;
            total = shipping + price;
            System.out.println("Invoice: \n" + item + "\n" + price + "\n" + "Shipping: " + "$" + shipping + "\n" + "Total: $ " + total);

        } else {
            shipping = 2 + 5;
            total = shipping + price;
            System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + shipping + "\n" + "Total: $ " + total);

        }
    }
}
