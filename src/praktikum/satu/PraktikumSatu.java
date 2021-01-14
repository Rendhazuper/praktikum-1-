/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.satu;

/**
 *
 * @author GAMES
 */
public class PraktikumSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4; 
        for(int i=0;i <=n;i++){
            for(int j=0; j<=n;j++){
                if (i==0||j==0||i==n||j==n){
                    System.out.print("@ ");
                }
                else{
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
    
}
}
