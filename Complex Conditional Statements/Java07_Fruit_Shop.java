
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
public class Java07_Fruit_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quality = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        double sum = 0.0;
        
        fruit = fruit.toLowerCase();
        day = day.toLowerCase();
        
        boolean condition1 = ((day.equals("monday")) || (day.equals("tusday")) || (day.equals("wednesday"))
                || (day.equals("thursday")) || (day.equals("friday")));
        boolean condition2 = ((day.equals("saturday")) || (day.equals("sunday")));
        
        if (condition1) {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "apple":
                    price = 1.20;
                    sum = price * quality;
                    System.out.println(sum);
                    break;    
                case "orange":
                    price = 0.85;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "grapefruit":
                    price = 1.45;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "kiwi":
                    price = 2.70;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "pineapple":
                    price = 5.50;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "grapes":
                    price = 3.85;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                default:
                        System.out.println("error");
            
                    
            }
        }
        else if (condition2) {
            switch (fruit){
                case "banana":
                    price = 2.70;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "apple":
                    price = 1.25;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "orange":
                    price = 0.90;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "grapefruit":
                    price = 1.60;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "kiwi":
                    price = 3.00;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "pineapple":
                    price = 5.60;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                case "grapes":
                    price = 4.20;
                    sum = price * quality;
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("error");
            }
        }
        else 
        System.out.println("error");
    }
    
}
