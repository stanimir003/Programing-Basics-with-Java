
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
public class Java06_Bonus_Score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bonusScore;
        double score = Double.parseDouble(scanner.nextLine());
        if (score <= 100) {
            bonusScore = 5;
        }
        else if (score>100 & score<1000) {
            bonusScore = (score*20)/100;
        }
        else {
                bonusScore = (score*10/100);       
        }
        if (score % 2 ==0) {
            bonusScore=bonusScore + 1;
        }
        if (score %10 ==5){
           bonusScore = bonusScore + 2;
    }
     System.out.println(bonusScore);
      System.out.println(score + bonusScore);
    }
}
