/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanaalabexer1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author suinan
 */
public class SuinanAALabExer14 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input1 = "";
        System.out.print("Please enter start number:");
        try{
            input1 = dataIn.readLine();   
        }catch( IOException e){
            System.out.println("Error!");
        }
        String input2 = "";
        System.out.print("Please enter end number:");
        try{
            input2 = dataIn.readLine();   
        }catch( IOException e){
            System.out.println("Error!");
        }
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        for( int x = num1; x <= num2; x++ ) {
            System.out.println(x);
        }
    }
}
