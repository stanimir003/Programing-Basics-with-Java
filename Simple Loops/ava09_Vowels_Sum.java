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
public class ava09_Vowels_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
         for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case 'a':
                        sum += 1;
                        break;
                        case 'e':
                        sum += 2;
                        break;
                        case 'i':
                        sum += 3;
                        break;
                        case 'o':
                        sum += 4;
                        break;
                        case 'u':
                        sum += 5;
                        break;
        }
    }
         System.out.println(sum);
    }
}
