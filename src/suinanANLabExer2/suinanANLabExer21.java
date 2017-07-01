/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanANLabExer2;
import javax.swing.JOptionPane;

/**
 *
 * @author suinan
 */
public class suinanANLabExer21 {
    public static void main(String[] args) {
        int inputs[] = new int[10];
        for( int x=0; x<inputs.length; x++ ) {
            if(x==0){
                continue;
            }
            String name = JOptionPane.showInputDialog("Please Enter input number" + x);
            int num = Integer.parseInt(name);
            for( int y=0; y<inputs.length; y++ ) {
                if(inputs[y]==num){
                    if(x!=0)
                        x--;
                    else
                        x=0;
                    continue;
                }
            }
            inputs[x] = num;
        }
        printInputs(inputs);
        boolean hz = sumHorizontal(inputs);
        boolean vz = sumVertical(inputs);
        boolean diag = sumDiagonal(inputs);
    }
    public static void printInputs(int[] inputs){
        int y = 0;
        for(int x = 0; x<inputs.length; x++){
            if(x==0){
                continue;
            }
            if(y==3){
                    y = 0;
                    System.out.println();                   
            }
            if(y < 3){
                System.out.print(inputs[x]+ " ");
                y++;   
            }           
        }
        System.out.println();   
    }
    public static boolean sumHorizontal(int[] inputs) {
        for(int x=0; x<inputs.length; x++) {
            if(x%3==0 && x!=0){
                int sum = 0;
                for(int y=x; y>x-3; y--){
                    sum+=inputs[x];
                     
                }
               
                if (sum!=15){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sumVertical(int[] inputs) {
        return false;
    }
    public static boolean sumDiagonal(int[] inputs) {
        return false;
    }
}
