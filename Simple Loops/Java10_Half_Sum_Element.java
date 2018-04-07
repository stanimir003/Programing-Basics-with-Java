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
public class Java10_Half_Sum_Element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        if (max == sum -max) {
            System.out.println("Yes");
            System.out.println("Sum : " + max);
        }
        else  {
            System.out.println("No");
            System.out.println("diff : " + Math.abs(max - (sum - max)));
        }
    }
    
}
