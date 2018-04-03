
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
public class Java05_Invalid_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
         
        boolean valid = ((number >= 100) && (number <= 200));
        if ((!valid) && (number != 0)) {           
            System.out.println("invalid");
 
            
        
        }
    }
}
    
    

