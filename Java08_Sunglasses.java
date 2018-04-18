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
public class Java08_Sunglasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
             
        int n = Integer.parseInt(scanner.nextLine());
        String star = "*";
        String space = " ";

        //first part
        System.out.print(repeat(star, n * 2));
        System.out.print(repeat(space, n));
        System.out.println(repeat(star, n * 2));

        //middle part 
        for (int row = 1; row <= n - 2; row++) {
            System.out.print(star);
            System.out.print(repeat("/", 2 * n - 2));
            System.out.print(star);
            if (row == (n - 1) / 2) {
                System.out.print(repeat("|", n));
            } else {
                System.out.print(repeat(space, n));
            }
            System.out.print(star);
            System.out.print(repeat("/", 2 * n - 2));
            System.out.println(star);
        }

        //last part
        System.out.print(repeat(star, n * 2));
        System.out.print(repeat(space, n));
        System.out.println(repeat(star, n * 2));
    }

    public static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    
}
