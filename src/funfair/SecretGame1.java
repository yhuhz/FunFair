/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfair;

import static funfair.FunFair.tickets;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Lord Julius
 */
public class SecretGame1 extends FunFair{
    Game1 gm1 = new Game1();
    int[] Results = new int[5];
    String[] Choices = new String[21];
    int[] playerNums = new int[5];
    int points;
    double prize;
    
    public double Lotto(){
      try {
        ResultMet();
        userInput();
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        for (int a = 0; a<5; a++){
            for (int b = 0; b<5; b++){
                if (playerNums[b] == Results [a]){
                    points++;
                }
            }
        }
        
        if (points == 5){
            TicketReturn(10);
            prize = earnings;
            earnings = earnings*2;
            
            JOptionPane.showMessageDialog(null,"You won ₱"+(decimalFormat.format(prize))+" and 10 tickets!\n"
                    + "You now have ₱"+(decimalFormat.format(earnings))+" and "+tickets+" tickets!");
            MainMenu();
        } else if (points == 4) {
            TicketReturn(6);
            prize = earnings*.5;
            earnings = earnings*1.5;
            
            JOptionPane.showMessageDialog(null,"You won ₱"+decimalFormat.format(prize)+" and 6 tickets!\n"
                    + "You now have ₱"+(decimalFormat.format(earnings))+" and "+tickets+" tickets!");
            MainMenu();
        } else if (points == 3) {
            TicketReturn(5);
            
            JOptionPane.showMessageDialog(null,"You won 5 tickets!\n"
                    + "You now have ₱"+(decimalFormat.format(earnings))+" and "+tickets+" tickets!");
            MainMenu();
        } else {
            prize = (earnings*0.1);
            earnings = earnings - (earnings*0.1);
            JOptionPane.showMessageDialog(null, "Better luck next time! You have lost "+(decimalFormat.format(prize)),
                      "Error", JOptionPane.ERROR_MESSAGE);
            MainMenu();
        }
        
       } catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            MainMenu();
        }
    }
            
        return earnings;
    }
    
    public int TicketReturn(int x){
        tickets = tickets + x;
        return tickets;
    }
    
    public int[] ResultMet(){
        gm1.randNum(20);
        
        for (int i = 0; i<5; i++){
        Results[i] = gm1.c[i];
            System.out.println(Results[i]+1);
        }
        
        return Results;
    }
    public String[] ChoicesNum() {
        for (int count = 0; count<20; count++){
            int num = count+1;
            Choices[count] = Integer.toString(num);
        }
        Choices[20] = "Quit";
        return Choices;
    }
    public int[] userInput(){
        try {
            ChoicesNum();

            for (int choose = 5; choose > 0; choose--){
            int player = JOptionPane.showOptionDialog(null, "Choose "+choose+" numbers.",
            "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Choices, Choices[0]);

            if (player == 20){
                String[] options = {"Quit"};
                int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (x == 0){
                    JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
                    MainMenu();
                    }
            } else {
                Choices[player] = "**";
            playerNums[choose-1] = player;
            }
            }
        } catch (Exception e){
            String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            MainMenu();
        }
        }
        return playerNums;
    }
}
