/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_Loops;

/**
 *
 * @author admin
 */
public class Java02_Numbers_Ending_in_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
            
            
        }
    }
    
}
