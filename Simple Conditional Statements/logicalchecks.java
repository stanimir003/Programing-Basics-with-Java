/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfuirstprogram;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class logicalchecks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Double grade = Double.parseDouble(scanner.nextLine());
        if (grade >=5.50) {
            System.out.println("Excellent");
        }
    }
    
}
