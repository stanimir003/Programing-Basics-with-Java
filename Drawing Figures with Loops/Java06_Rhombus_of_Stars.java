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
public class Java06_Rhombus_of_Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row ; col++) {
                System.out.print(" ");               
            }
            System.out.print("*");
            for (int i = 1; i < row; i++) {
                System.out.print(" *");
                
            }
            System.out.println();
        }
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = row - 1; col >=  1; col--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        
    }
    
}
