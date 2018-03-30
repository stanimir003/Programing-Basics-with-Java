
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
public class Java02_Small_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town =scanner.nextLine();
        String product =scanner.nextLine();
        double qality = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        double sum = 0.0;

        if (town.equals("Sofia")) {
            switch(product){
                case "coffee":
                    price = 0.50;
                    sum = price * qality;
                    System.out.printf(("%,2f"),sum);
                    break;
                    case "water":
                    price = 0.80;
                    sum = price * qality;
                    System.out.printf("sum: "+("%.2f"),+ sum);
                    break;
                    case "beer":
                    price = 1.20;
                    sum = price * qality;
                    System.out.printf("sum: "+("%.2f"),+ sum);
                    break;
                    case "sweets":
                    price = 1.45;
                    sum = price * qality;
                   System.out.printf("sum: "+("%.2f"),+ sum);
                   break;
                    case "peanuts":
                    price = 1.60;
                    sum = price * qality;
                   System.out.printf("sum: "+("%.2f"),+ sum);
                   break;
            }
        }
             else if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = 0.40;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "water":
                    price = 0.70;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "beer":
                    price = 1.15;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "sweets":
                    price = 1.30;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "peanuts":
                    price = 1.50;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
            }
        } else if (town.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = 0.45;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "water":
                    price = 0.70;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "beer":
                    price = 1.10;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "sweets":
                    price = 1.35;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
                case "peanuts":
                    price = 1.55;
                    sum = price * qality;
                    System.out.printf(("%.2f"), sum);
                    break;
        }
    }
        }
    }

