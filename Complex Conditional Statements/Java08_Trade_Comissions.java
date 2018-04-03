
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
public class Java08_Trade_Comissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comission = 0.0;

        boolean condition1 = ((sales >= 0) && (sales <= 500));
        boolean condition2 = ((sales > 500) && (sales <= 1000));
        boolean condition3 = ((sales > 1000) && (sales <= 10000));
        boolean condition4 = (sales > 10000);

        if (condition1) {
            switch (town) {
                case "Sofia":
                    comission = 5 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = 4.5 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = 5.5 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
            }

        } else if (condition2) {
            switch (town) {
                case "Sofia":
                    comission = 7 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = 7.5 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = 8 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (condition3) {
            switch (town) {
                case "Sofia":
                    comission = 8 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = 10 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = 12 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (condition4) {
            switch (town) {
                case "Sofia":
                    comission = 12 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Varna":
                    comission = 13 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                case "Plovdiv":
                    comission = 14.5 * sales / 100;
                    System.out.printf("%.2f", comission);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
    
}
