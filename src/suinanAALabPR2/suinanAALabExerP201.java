/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabPR2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author suinan
 */
public class suinanAALabExerP201 {
    public static void loopIt(){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double input1=0;
        System.out.println("3x^2 - 8x + 4 Replace the value of x");
        System.out.print("x = ");
        try{
            input1 = Integer.parseInt(dataIn.readLine());
        }catch( IOException e){
            System.out.println("Error!");
        }
        double answer = 3* (input1*input1) - (8*input1) +4;
        System.out.println(answer);
    }
    public static void main(String[] args) {
        loopIt();
    }
}
