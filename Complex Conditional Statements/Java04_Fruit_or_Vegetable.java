
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
public class Java04_Fruit_or_Vegetable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        switch (product){
            case "banana":
            case "kiwi":
            case "apple":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
         break;
             case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("Unknow");
         }
              
    }
    
}
