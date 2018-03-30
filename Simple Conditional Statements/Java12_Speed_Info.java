
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
public class Java12_Speed_Info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double speed = Double.parseDouble(scanner.nextLine());
         if (speed <= 10) {
             System.out.println("slow");
        }
         else if (speed >10 & speed <= 50) {
             System.out.println("average");   
        }
         else if (speed > 50 & speed <= 150) {
             System.out.println("fast");
        }
         else if (speed > 150 & speed <=1000) {
             System.out.println("ultra fast");
        }
         else {
             System.out.println("extremely fast");
         }
    }
    
}
