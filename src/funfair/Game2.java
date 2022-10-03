/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfair;

import static funfair.FunFair.earnings;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Lord Julius
 */
public class Game2 extends FunFair{
    //GAME 2: DEAL OR NO DEAL
    
    Game1 gm1 = new Game1();
    String[] bCase = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","Quit"};
    String[] AmtTxt = new String[18];
    Integer[] bCaseAmt = new Integer[18];
    int playerBriefCase;
    Random randOffer = new Random(); 
    boolean deal = false;
    
    public boolean acceptDeal(int x){
        if (x == 1) {
            deal = true;
        } else {
            deal = false;
        }
        return deal;
    }

    public Integer[] BriefcaseAmts(){
        gm1.randNum(18);
        
        bCaseAmt[gm1.c[0]] = 1;
        bCaseAmt[gm1.c[1]] = 5;
        bCaseAmt[gm1.c[2]] = 10;
        bCaseAmt[gm1.c[3]] = 50;
        bCaseAmt[gm1.c[4]] = 100;
        bCaseAmt[gm1.c[5]] = 200;
        bCaseAmt[gm1.c[6]] = 500;
        bCaseAmt[gm1.c[7]] = 700;
        bCaseAmt[gm1.c[8]] = 1000;
        bCaseAmt[gm1.c[9]] = 5000;
        bCaseAmt[gm1.c[10]] = 10000;
        bCaseAmt[gm1.c[11]] = 30000;
        bCaseAmt[gm1.c[12]] = 50000;
        bCaseAmt[gm1.c[13]] = 70000;
        bCaseAmt[gm1.c[14]] = 100000;
        bCaseAmt[gm1.c[15]] = 200000;
        bCaseAmt[gm1.c[16]] = 500000;
        bCaseAmt[gm1.c[17]] = 1000000;

        
        return bCaseAmt;
    }
    
    public String[] AmtsTxt(){
        AmtTxt[gm1.c[0]] = "*1";
        AmtTxt[gm1.c[1]] = "*5";
        AmtTxt[gm1.c[2]] = "*10";
        AmtTxt[gm1.c[3]] = "*50";
        AmtTxt[gm1.c[4]] = "*100";
        AmtTxt[gm1.c[5]] = "*200";
        AmtTxt[gm1.c[6]] = "*500";
        AmtTxt[gm1.c[7]] = "*700";
        AmtTxt[gm1.c[8]] = "*1K";
        AmtTxt[gm1.c[9]] = "*5K";
        AmtTxt[gm1.c[10]] = "*10K";
        AmtTxt[gm1.c[11]] = "*30K";
        AmtTxt[gm1.c[12]] = "*50K";
        AmtTxt[gm1.c[13]] = "*70K";
        AmtTxt[gm1.c[14]] = "*100K";
        AmtTxt[gm1.c[15]] = "*200K";
        AmtTxt[gm1.c[16]] = "*500K";
        AmtTxt[gm1.c[17]] = "*1M";
        
        return AmtTxt;
    }
   
   public int playerBCase(){
       try{
       playerBriefCase = JOptionPane.showOptionDialog(null, "Please choose your briefcase!",
                    "Player's briefcase",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bCase, bCase[0]);
       
       
       if (playerBriefCase == 18){
                String[] options = {"Quit"};
                int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (x == 0){
                JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
                ResetBcase();
                MainMenu();
                }
        } else {
           JOptionPane.showMessageDialog(null,"You have chosen Briefcase "+(playerBriefCase+1)+"!");
           playerBCaseRet();
       }
       
       } catch (Exception e){
           String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            ResetBcase();
            MainMenu();
       }
   }
       return playerBriefCase;
   }
   
   public String[] playerBCaseRet(){
       bCase[playerBriefCase] = "**";
       return bCase;
   }
   
   public String[] bCaseChoose(int numBCase, int roundNum){
     try{  
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        String caseText;
        if (numBCase <= 1){
            caseText = "briefcase";
        } else {
            caseText = "briefcases";
        }

       while(true){
           int bCaseChoice = JOptionPane.showOptionDialog(null, "Choose "+numBCase+" "+caseText+"!",
                    "Round "+roundNum,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bCase, bCase[0]);
           
       if (bCase[bCaseChoice].indexOf("*") == 0){
           JOptionPane.showMessageDialog(null, "Briefcase already chosen. Try again!",
                      "Error", JOptionPane.ERROR_MESSAGE);
       } else if (bCaseChoice == 18){
                String[] options = {"Quit"};
                int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (x == 0){
                JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
                ResetBcase();
                MainMenu();
                }
       } else {
       
       AmtsTxt();
       bCase[bCaseChoice] = AmtTxt[bCaseChoice];
       JOptionPane.showMessageDialog(null,"Briefcase "+(bCaseChoice+1)+" has "+(decimalFormat.format(bCaseAmt[bCaseChoice])));
       
       if (bCaseAmt[bCaseChoice] == 1000000){
           EmerCall(1.6);
       } else if (bCaseAmt[bCaseChoice] == 500000) {
           EmerCall(2.5);
       }
       break;
       }
       }
     } catch(Exception e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            ResetBcase();
            MainMenu();
        }
    }
       return bCase;
   }
   
   public double BankCall(int x){
      try{ 
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
       
       double offer;
       
       if (bCaseAmt[playerBriefCase] < 1000){
           offer = (randOffer.nextInt(6000)+500)*x;
       } else if (bCaseAmt[playerBriefCase] > 1000){
           offer = bCaseAmt[playerBriefCase]*((randOffer.nextInt(5)+1)*0.7);
            while (offer > 1000000){
                offer = 30000 * randOffer.nextInt(15)+10;
            }
       } else {
           offer = 15000*(x*0.2);
       }
       
       JOptionPane.showMessageDialog(null,"Banker is calling!\nRing...Ring...\nRing...Ring...\nHello!");
       
       String[] DealNoDeal = {"Deal", "No Deal"};
       int call = JOptionPane.showOptionDialog(null, ("BANKER'S OFFER IS: \n"+decimalFormat.format(offer)),
                    "Banker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, DealNoDeal, DealNoDeal[0]);
       
       if (call == 0){
           earnings = earnings + offer;
           tickets = tickets+2;
           acceptDeal(1);
           JOptionPane.showMessageDialog(null,"YOUR BRIEFCASE HAS: "+decimalFormat.format(bCaseAmt[playerBriefCase])+
                   "\nThank you for playing! You have won "+decimalFormat.format(offer)+
                   "\nYou now have "+decimalFormat.format(earnings));
           
           ResetBcase();
           MainMenu();
       } else {
           JOptionPane.showMessageDialog(null,"Let's continue playing!");
       }
      }catch(Exception e){
        String[] options = {"Quit"};
        int y = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (y == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            ResetBcase();
            MainMenu();
        }
    }
       return earnings;
   }
   
   public double EmerCall(double x){
       try{
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
       
       double offer = (randOffer.nextInt(80000)+10000) * x;
       
       JOptionPane.showMessageDialog(null,"Banker is calling!\nRing...Ring...\nRing...Ring...\nHello!");
       
       String[] DealNoDeal = {"Deal", "No Deal"};
       int call = JOptionPane.showOptionDialog(null, ("BANKER'S OFFER IS: \n"+decimalFormat.format(offer)),
                    "Banker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, DealNoDeal, DealNoDeal[0]);
                    
       if (call == 0){
           earnings = earnings + offer;
           tickets = tickets+2;
           acceptDeal(1);
           JOptionPane.showMessageDialog(null,"YOUR BRIEFCASE HAS: "+decimalFormat.format(bCaseAmt[playerBriefCase])+
                   "\nThank you for playing! You have won "+decimalFormat.format(offer)+
                   "\nYou now have "+decimalFormat.format(earnings));
           ResetBcase();
           MainMenu();
       } else {
           JOptionPane.showMessageDialog(null,"Let's continue playing!");
       }
       }catch(Exception e){
        String[] options = {"Quit"};
        int y = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (y == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            ResetBcase();
            MainMenu();
        }
    }
       return earnings;
   }
   
   public double bCaseReveal(){
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        tickets = tickets+3;
        earnings = earnings + bCaseAmt[playerBriefCase];
        
       JOptionPane.showMessageDialog(null,"YOUR BRIEFCASE HAS: "+decimalFormat.format(bCaseAmt[playerBriefCase])+
                   "\nThank you for playing! You have won "+decimalFormat.format(earnings)+
                   "\nYou now have "+decimalFormat.format(earnings));
       ResetBcase();
       
       return earnings;
   }
   
   public String[] ResetBcase(){
    for (Integer i = 0; i < 18; i++){
        bCase[i] = i.toString();
    }
    
       return bCase;
   }
   
   public boolean ResetDeal() {
       deal = false;
       return deal;
   }
}
