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
public class Java09_House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int stars;
        if (n % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;
        }
        //roof
        for (int i = 0; i < (n + 1) / 2; i++) {

            String dash = "-";
            System.out.print(repeat(dash, (n - stars) / 2));
            System.out.print(repeat("*", stars));
            System.out.println(repeat(dash, (n - stars) / 2));
            stars += 2;
        }

        //basis
        for (int row = 1; row <= n / 2; row++) {
            System.out.print("|");
            System.out.print(repeat("*", n - 2));
            System.out.println("|");
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
