/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAAActualExer1;
import java.io.*;
import java.util.*;
/**
 *
 * @author suinan
 */
public class suinanAAActualExer101 {
    public static void main(String[] args) {
        int a;
        Random rand = new Random();
        a = rand.nextInt();
        System.out.println("N = "+a);
        if(a<0){
            System.out.println("**** < 0");
        }
        else
            System.out.println("**** > 0");
        System.out.println("GOODBYE");
    }
}
