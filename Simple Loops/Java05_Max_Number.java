/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_Loops;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Java05_Max_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > max) {
                max = number;
                
            }
            
        }
        System.out.println(max);
    }
    
}
