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
public class nameandnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String firstname = Scanner.nextLine();
        String secondname = Scanner.nextLine();
        int Age = Integer.parseInt(Scanner.nextLine());
        String town = Scanner.nextLine();
        System.out.println("you are "+firstname+" "+secondname+" "+Age+" "+town);
    }
    
}
