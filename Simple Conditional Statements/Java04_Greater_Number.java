
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Java04_Greater_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("a= ");
       int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b= ");
       int b = Integer.parseInt(scanner.nextLine());
        if (a>b) {
            System.out.println("Greater number: "+a);
        }
        else {
            System.out.println("Greater number:"+b);
        }
    }
    
}
