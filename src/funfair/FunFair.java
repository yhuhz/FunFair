/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfair;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Lord Julius
 */
public class FunFair {

    /**
     * @param args the command line arguments
     */
    static double earnings = 0;
    static int tickets = 1;
    static Game1 gm1 = new Game1();
    static Game2 gm2 = new Game2();
    
    public static void main(String[] args) {
        
        while(tickets > 0){
            MainMenu();
        }
 
    }
    
    public static void MainMenu(){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
    if (tickets > 0){    
        String tickW;
        if (tickets > 1){
          tickW = "tickets";  
        } else {
           tickW = "ticket";
        }
        
        if (tickets < 5){
        String[] gchoice = {"Who Wants to Be a Patriarch?","Deal or No Deal","Quit"};
        int mMenu = JOptionPane.showOptionDialog(null, "You have earned a total of ₱"+(decimalFormat.format(earnings))+"\nYou have "+tickets+" "+tickW+"\nEach game costs 1 ticket to play.\nPlease choose a game.",
        "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gchoice, gchoice[0]);
        
            switch (mMenu) {
                case 0:
                    tickets--;
                    FirstGame();
                    break;
                case 1:
                    tickets--;
                    gm2.ResetDeal();
                    SecondGame();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Thank you for playing! You now have: ₱"+(decimalFormat.format(earnings)));
                    System.exit(0);
            }
        
        } else {
            String[] gchoice = {"Who Wants to Be a Patriarch?","Deal or No Deal","SECRET GAME","Quit"};
        int mMenu = JOptionPane.showOptionDialog(null, "You have earned a total of ₱"+(decimalFormat.format(earnings))+"\nYou have "+tickets+" "+tickW+"\nEach game costs 1 ticket to play.\nPlease choose a game.",
        "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gchoice, gchoice[0]);
        
            switch (mMenu) {
                case 0:
                    tickets--;
                    FirstGame();
                    break;
                case 1:
                    tickets--;
                    gm2.ResetDeal();
                    SecondGame();
                    break;
                case 2:
                    String[] secChoice = {"Yes","No"};
                    int secMen = JOptionPane.showOptionDialog(null, "The secret game requires 5 tickets. You have "+tickets+" tickets.\nAre you sure you want to continue?",
                            "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, secChoice, secChoice[0]);
                    if (secMen == 0){
                        tickets = tickets - 5;
                        SecretGame1 secGame = new SecretGame1();
                        secGame.Lotto();
                        break;
                    } else {
                        MainMenu();
                    }       break;
                default:
                    JOptionPane.showMessageDialog(null,"Thank you for playing! You now have: ₱"+(decimalFormat.format(earnings)));
                    System.exit(0);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null,"Thank you for playing! You now have: ₱"+(decimalFormat.format(earnings)));
                    System.exit(0);
    }
    }
    
    public static double FirstGame(){
        JOptionPane.showMessageDialog(null,"WELCOME TO\nWHO WANTS TO BE A PATRIARCH!");
            //LEVEL 1
            gm1.amounts();
            gm1.Level1();
            if (earnings>0){   
            gm1.Level2();
            }
            if (earnings>0){   
            gm1.Level3();
            }
            if (earnings>0){   
            gm1.Level4();
            }
            if (earnings>0){   
            gm1.Level5();
            }
            return earnings;
    }
    
    public static double SecondGame(){
       JOptionPane.showMessageDialog(null,"WELCOME TO\nDEAL OR NO DEAL");
       
       gm2.BriefcaseAmts();
       gm2.playerBCase();
       
       for(int i = 0; i<5; i++){
        gm2.bCaseChoose(5, 1);
        if (gm2.deal==true){
            break;
        }
        } if (gm2.deal == false){
            gm2.BankCall(1);
        }
        
        for(int i = 0; i<4; i++){
        gm2.bCaseChoose(4, 2);
        if (gm2.deal==true){
            break;
        }
        } if (gm2.deal == false){
            gm2.BankCall(2);
        }
        
        for(int i = 0; i<3; i++){
        gm2.bCaseChoose(3, 3);
        if (gm2.deal==true){
            break;
        }
        } if (gm2.deal == false){
            gm2.BankCall(3);
        }
        
        for(int i = 0; i<2; i++){
        gm2.bCaseChoose(2, 4);
        if (gm2.deal==true){
            break;
        }
        } if (gm2.deal == false){
            gm2.BankCall(4);
        }
        
        for(int i = 0; i<1; i++){
        gm2.bCaseChoose(1, 5);
        if (gm2.deal==true){
            break;
        }
        } if (gm2.deal == false){
            gm2.BankCall(5);
        }
        
        if (gm2.deal == false){
        gm2.bCaseReveal();
        }
        
       return earnings;
       
    }  
}
