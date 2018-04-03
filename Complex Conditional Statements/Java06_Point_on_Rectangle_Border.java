
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
public class Java06_Point_on_Rectangle_Border {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean condition1 = (x == x1) || (x == x2);
        boolean condition2 = (y >= y1 && y <= y2) || (y <= y1 && y >= y2);
        boolean condition3 = (y == y1) || (y == y2);
        boolean condition4 = (x >= x1 && x <= x2) || (x <= x1 && x >= x2);

        if ((condition1 && condition2) || (condition3 && condition4)) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
    
}
