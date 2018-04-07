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

public class Java08_Odd_Even_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
        }
            
    }
        if (evenSum == oddSum) {
            System.out.printf( "Yes Sum = %d" + evenSum );
        }
        else {
            System.out.printf("NO dif = %d" , Math.abs(evenSum-oddSum));
        }
    
    }
}
