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
public class suinanANLiveExer21 {
    public static void main(String[] args) {
        String parts[] = {
        "head", "nose", "toes", "finger",
        "skin", "shoulder", "hand", "eye",
        "penis", "vagina", "lip", "nails",
        "legs", "elbow", "ears", "hair"
        };
        int y = 0;
        for(int x = 0; x<parts.length; x++){
            if(y < 4){
                System.out.print(parts[x]+ " ");
                y++;
            }
            else{
                y = 0;
                System.out.println();
            }         
        }
    }
}
