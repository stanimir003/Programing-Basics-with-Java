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
public class Java07_Left_and_Right_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int  leftSum = 0;
        int rightsum = 0;
        for (int i = 0; i < 2*n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                leftSum += number;
            }
            else {
                rightsum += number;
            }
            
        }
       if (leftSum == rightsum){
           System.out.printf("yes, sum= %d " ,leftSum );
       }
       else {
           System.out.printf("no , diff  = %d",Math.abs(leftSum - rightsum));
       }
    }
    
    
}
