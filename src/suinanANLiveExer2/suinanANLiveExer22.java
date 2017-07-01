/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanANLiveExer2;

/**
 *
 * @author suinan
 */
public class suinanANLiveExer22 {
    public static void main(String[] args) {
        
        int y = 0;
        for (int x = 0; x < args.length; x++) {
            if (y < 4) {
                System.out.print(args[x] + " ");
                y++;
            } else {
                y = 0;
                System.out.println();
            }
        }
    }
}

