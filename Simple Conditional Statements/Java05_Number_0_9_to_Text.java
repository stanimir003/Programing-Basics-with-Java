
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
public class Java05_Number_0_9_to_Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int number = Integer.parseInt(scanner.nextLine());
       switch (number){
           case 1:
               System.out.println("one");
               break;
               case 2:
               System.out.println("two");
               break;
               case 3:
               System.out.println("three");
               break;
               case 4:
               System.out.println("four");
               break;
               case 5:
               System.out.println("five");
               break;
               case 6:
               System.out.println("six");
               break;
               case 7:
               System.out.println("seven");
               break;
               case 81:
               System.out.println("eight");
               break;
               case 9:
               System.out.println("nine");
               break;
               default:
                   System.out.println("Number too big");
       }
    }
    
    
}
