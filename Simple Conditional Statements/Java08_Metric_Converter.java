
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
public class Java08_Metric_Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outMetric = scanner.nextLine();
        
        double m = 1;
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        
        double result = 0.0;
        switch (inputMetric){
            case "m":
                   result = distance / m; 
                   break;
                    case "mm":
                   result = distance / mm; 
                   break;
                     case "cm":
                   result = distance / cm; 
                   break;
                     case "mi":
                   result = distance / mi; 
                   break;
                     case "in":
                   result = distance / in; 
                   break;
                     case "km":
                   result = distance / km; 
                   break;
                     case "ft":
                   result = distance / ft; 
                   break;
                     case "yd":
                   result = distance / yd; 
                   break;
        }
        switch (outMetric){
            case "m":
                   result = result * m; 
                   break;
                    case "mm":
                   result = result * mm; 
                   break;
                     case "cm":
                   result = result * cm; 
                   break;
                     case "mi":
                   result = result * mi; 
                   break;
                     case "in":
                   result = result * in; 
                   break;
                     case "km":
                   result = result * km; 
                   break;
                     case "ft":
                   result = result * ft; 
                   break;
                     case "yd":
                   result = result * yd; 
                   break;
        }
        System.out.print(result);
    }
    
}
