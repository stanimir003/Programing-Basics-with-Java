
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
public class Java01_Personal_Titles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter age:");
        double age = Double.parseDouble(scanner.nextLine());
        System.out.print("enter gender (f or m):");
        String gender = scanner.nextLine();
        if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Mr.");
            }
            else {
                System.out.println("Master");
            }
    }
        else if(gender.equals("m")) {
            if (age < 16) {
                System.out.println("Miss");
            }
            else {
            System.out.println("Ms.");
        }
    }
 }
}
