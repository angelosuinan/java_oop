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
public class SuinanAALabExer13 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        System.out.print("Please Enter a number from 10 to 20:");
        try{
            input = dataIn.readLine();   
        }catch( IOException e){
            System.out.println("Error!");
        }
        int number = Integer.parseInt(input);
        if ( number > 10 ) {
            System.out.println("Error! Number is greater than 20");
        }
        else if ( number < 1) {
            System.out.println("Error! Number is less than 10");
        }
        else{
            System.out.println("Thank You");
        }
    }
}
