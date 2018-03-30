
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
public class Java07_Sum_Seconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondone = Integer.parseInt(scanner.nextLine());
        int secondtwo = Integer.parseInt(scanner.nextLine());
        int secondthree = Integer.parseInt(scanner.nextLine());
        if (secondone<=50 & secondone>=1 &secondtwo<=50 &secondtwo>=1 &secondthree<=50 &secondthree>=1) {
            
       
        int sumSeconds = secondone + secondtwo + secondthree;
        int minutes = sumSeconds / 60;
        int seconds =sumSeconds  % 60;
        if (seconds < 10) {
            System.out.println(minutes+":0"+seconds);
        }
        else{
            System.out.println(minutes+":"+seconds);
        }
        
                }
        else {
                System.out.println("error");
        }
    }
    
    
}
