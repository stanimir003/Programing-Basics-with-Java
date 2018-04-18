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
public class Java07_Christmas_Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        
            System.out.printf("%s | %s%n" , repeat(" " , n),repeat(" " , n));
            int space = 3;
            int stars = 1;
            for (int i = 0; i <n; i++) {
                System.out.printf("%s%s | %s%s%n",
                        repeat(" " , space),
                        repeat("*" , stars),
                        repeat("*" , stars),
                        repeat(" " , space));
                  space--;
                  stars++;
            
        }
    }
     public static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    
}
