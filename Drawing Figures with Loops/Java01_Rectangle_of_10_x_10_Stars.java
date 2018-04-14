/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing_Figures_with_Loops;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Java01_Rectangle_of_10_x_10_Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
