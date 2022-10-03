/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfair;

import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Lord Julius
 */
public class Game1 extends FunFair{
    //GAME NAME: WHO WANTS TO BE A PATRIARCH
    int [] amountNum = new int[21];
    String bonus1 = "50/50";
    String bonus2 = "Call a friend";
    int bonus50 = 1;
    int bonusCall = 1;
    int correctAns;
    String finalAns;
    int quit;
    
    Integer[] c;
    public Integer[] randNum(int x){
        c = new Integer[x];
            for (int i=0; i <c.length; i++){
                c[i] = i;
            }
            
            Collections.shuffle(Arrays.asList(c));
            
            return c;
    }
    
    public int[] amounts(){
        amountNum[0] = 100;
        amountNum[1] = 300;
        amountNum[2] = 500;
        amountNum[3] = 800;
        amountNum[4] = 1000;
        amountNum[5] = 1500;
        amountNum[6] = 3000;
        amountNum[7] = 5000;
        amountNum[8] = 7000;
        amountNum[9] = 10000;
        amountNum[10] = 15000;
        amountNum[11] = 20000;
        amountNum[12] = 40000;
        amountNum[13] = 50000;
        amountNum[14] = 70000;
        amountNum[15] = 80000;
        amountNum[16] = 100000;
        amountNum[17] = 200000;
        amountNum[18] = 300000;
        amountNum[19] = 500000;
        amountNum[20] = 1000000;
        
        return amountNum;
    }
    
    public void Level1() {
    try {
            JOptionPane.showMessageDialog(null,"WELCOME TO ROUND 1!\nINSTRUCTIONS:\nAnswer correctly and you get money; answer wrongly and we deduct money.\n"+
                                          "Finish all 10 questions to move on to the next round. If your lose all your earnings, you lose the game.");        
        //QUESTIONS
        ArrayList<String> QLvl1 = new ArrayList<>();
        //Answer A
            QLvl1.add ("Who was the first Pope?\n" +
                    "a. St. Peter\n" + "b. St. John\n" + "c. St. Andrew\n" + "d. St. Phillip\n" + "e. St. Dismas");
            QLvl1.add ("Where does the priest put the reserved Host after the communion?\n" +
                    "a. Tabernacle\n" + "b. Sacristy\n" + "c. Side Table\n" + "d. Chalice\n" + "e. Altar");
            QLvl1.add ("How many sacraments are there?\n" +
                    "a. 7\n" + "b. 6\n" + "c. 9\n" + "d. 8\n" + "e. 12");
            QLvl1.add ("What is the Liturgical Color for Lent?\n" +
                    "a. Purple\n" + "b. Rose\n" + "c. Red\n" + "d. Blue\n" + "e. Green");
        //Answer B
            QLvl1.add ("Who is the Vicar of Christ?\n" +
                    "a. Dominicans\n" + "b. Pope\n" + "c. Metropolitan\n" + "d. Patriarch\n" + "e. Lay");
            QLvl1.add ("What is the official prayer of the Church?\n" +
                    "a. Liturgy of the Days\n" + "b. Liturgy of the Hours\n" + "c. Rosary\n" + "d. Prayer Rope\n" + "e. Jesus Prayer");
            QLvl1.add ("What do we call the 'change' that happens to the bread and wine as it becomes the Body and Blood of Christ?\n" +
                    "a. Confederation\n" + "b. Transubstantiation\n" + "c. Consubstantiation\n" + "d. Transformation\n" + "e. Contrast");
            QLvl1.add ("What special object should be inside every altar and altar stone?\n" +
                    "a. Holy Spoon\n" + "b. Relic\n" + "c. Ciborium\n" + "d. Holy Fork\n" + "e. Chalice");
        //Answer C
            QLvl1.add ("A word used to describe when two or more priests celebrate the Eucharist at the same altar.\n" +
                    "a. Transformation\n" + "b. Trancelebration\n" + "c. Concelebration\n" + "d. Eucharistic Adoration\n" + "e. Communion");
            QLvl1.add ("Which Liturgical season is the singing of Alleluia prohibited?\n" +
                    "a. Advent\n" + "b. Easter\n" + "c. Lent\n" + "d. Ordinary Time\n" + "e. Christmas");
            QLvl1.add ("Which is no longer an official title of the Bishop of Rome?\n"+
                    "a. Supreme Pontiff\n" + "b. Primate of Italy\n" + "c. Patriarch of the West\n" + "d. Servus Servorum Dei\n" + "e. Sovereign of the State of Vatican City");
            QLvl1.add ("What is the official Bible version of the Latin Church\n"+
                    "a. King James Bible\n" + "b. Eastern Orthodox bible\n" + "c. Vulgate\n" + "d. Tawahedo Bible\n" + "d. The Book of Mormon\n" + "e. Apocrypha");
        //Answer D
            QLvl1.add ("What is the main duty of a Cardinal?\n" +
                    "a. Collect money\n" + "b. Revise theology\n" + "c. Act as the Pope's representative\n" + "d. Elect the new Pope\n" + "e. Revise the Mass");
            QLvl1.add ("What does the word Catholic mean?\n" +
                    "a. Holy\n" + "b. Large\n" + "c. Sacramental\n" + "d. Universal\n" + "e. Beginning");
            QLvl1.add ("Which rite of the Latin Church is being used in the Church of Milan?\n" +
                    "a. Byzantine Rite\n" + "b. Roman Rite\n" + "c. Mozarabic Rite\n" + "d. Ambrosian Rite\n" + "e. Alexandrian Rite");
            QLvl1.add ("__________ is the allowance by the Roman Catholic Church of the dissolution of marriage of two persons not baptized at the time the marriage occurred.\n" +
                    "a. Divorce\n" + "b. Petrine Privelege\n" + "c. Andalusian Settlement\n" + "d. Pauline Privelege\n" + "e. Timothian Dispensation");
        //Answer E
            QLvl1.add ("What kind of bread do Greek Catholics use in their Liturgy?\n" +
                    "a. Soy Bread\n" + "b. White Bread\n" + "c. Unleavened Whean Bread\n" + "d. Lavander Wheat Bread\n" + "e. Leavened Wheat Bread");
            QLvl1.add ("What kind of sacramental wine is advised for priests suffering from alcoholism?\n" +
                    "a. Non-alcoholic wine\n" + "b. Soy Wine\n" + "c. Champagne\n" + "d. Grape Juice\n" + "e. Mustum");
            QLvl1.add ("How many sui iuris Churches are there in the Catholic Church?\n" +
                    "a. 1\n" + "b. 21\n" + "c. 22\n" + "d. 23\n" + "e. 24");
            QLvl1.add ("How many 'Testaments' are there in the Bible?\n" +
                    "a. Seven\n" + "b. One\n" + "c. Three\n" + "d. Six\n" + "e. Two");
            
            //Randomized Counter
            randNum(QLvl1.size());
            
            //ANSWERS
            int[] answers = new int[10];
            
            for (int counter = 0; counter < answers.length; counter++){
                Level1Answers(c[counter]);
                
                if ((bonus50 == 0)&&(bonusCall == 0)){
                    String[] options = {"a","b","c","d","e","Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 5){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                    }
                    
                    
                } else if ((bonus50 == 1)&&(bonusCall == 1)){
                    String[] options = {"a","b","c","d","e",bonus1,bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 5){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","--","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","--","d","e","--","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","d","--","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }  else if (correctAns == 3){
                            String[] options2 = {"--","--","c","d","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }  else if (correctAns == 4){
                            String[] options2 = {"a","--","--","d","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 6){
                        Random rand = new Random();
                            int num1 = rand.nextInt(5);
                            String[] options2 = {"a","b","c","d","e","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                            bonusCall = 0;
                    } else if (answers[counter] == 7){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                    }
                } else if ((bonus50 == 1)&&(bonusCall == 0)){
                    String[] options = {"a","b","c","d","e",bonus1,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 5){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","--","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","--","d","e","--","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","d","--","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }  else if (correctAns == 3){
                            String[] options2 = {"--","--","c","d","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }  else if (correctAns == 4){
                            String[] options2 = {"a","--","--","d","e","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 6){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                    }
                } else if ((bonus50 == 0)&&(bonusCall == 1)){
                    String[] options = {"a","b","c","d","e",bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                        if (answers[counter] == 5){
                        Random rand = new Random();
                            int num1 = rand.nextInt(5);
                            String[] options2 = {"a","b","c","d","e","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter]+"\n"+QLvl1.get(c[counter]),
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                            bonusCall = 0;
                    } else if (answers[counter] == 6){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level1AnswerCheck(c[counter], answers[counter], amountNum[counter]);
                    }
                }    
            }        
            popUpCheck(1, earnings);
                    
        } catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            Reset50();
            ResetCall();
            MainMenu();
        }
    }

}
    public int Level1Answers(int a){
        if ((a == 0) || (a == 1) || (a == 2) || (a == 3)){
            correctAns = 0;
        } else if ((a == 4) || (a == 5) || (a == 6) || (a == 7)){
            correctAns = 1;
        } else if ((a == 8) || (a == 9)|| (a == 10) || (a == 11)){
            correctAns = 2;
        } else if ((a == 12) || (a == 13) || (a == 14) || (a == 15)){
            correctAns = 3;
        } else if ((a == 16) || (a == 17) || (a == 18) || (a == 19)){
            correctAns = 4;
        }
        return correctAns;
    }
    
    public double Level1AnswerCheck (int a, int x, int b){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

       
        Level1Answers(a);
        
        if (x == correctAns){
                    earnings = earnings + b;
                    JOptionPane.showMessageDialog(null,"The answer is correct!\nYou now have: ₱"+(decimalFormat.format(earnings)));
        } else {
            earnings = earnings - b;
            if (earnings <= 0){
                earnings = 0;
                JOptionPane.showMessageDialog(null, "You lost!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Reset50();
                ResetCall();
                MainMenu();
            } else {
                if (earnings <= 0){
                    earnings = 0;
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        
        return earnings;
        
    }
    
    public void Level2 () {
    try{
        JOptionPane.showMessageDialog(null,"WELCOME TO ROUND 2!\nINSTRUCTIONS:\nAnswer correctly and you get money; answer wrongly and we deduct money.\n"+
                                          "Finish all 5 questions to move on to the next round. If your lose all your earnings, you lose the game.");
        //QUESTIONS
        String[] QLvl2 = new String[10];
        //Answer A
            QLvl2[0] = "Which is not a mendicant Religious Order?\n" +
                    "a. Cistercians\n" + "b. Dominicans\n" + "c. Franciscans\n" + "d. Augustinians";
            QLvl2[1] = "What event sparked the division of Western Europe into different religious spheres?\n" +
                    "a. Protestant Reformation\n" + "b. East-West Schism\n" + "c. Industrial Revolution\n" + "d. Western Schism";
            QLvl2[2] = "A major conflict in medieval Europe about the right of monarchs to assign bishops and clerics\n" +
                    "a. Investiture Controversy\n" + "b. Institutional Emergency\n" + "c. Proverbial Problem\n" + "d. Puella Schism";
        //Answer B
            QLvl2[3] = "The lowest of the minor orders disestablished after the Second Vatican Council\n" +
                    "a. Ordinary\n" + "b. Subdeacon\n" + "c. Lay Priest\n" + "d. Patoraliate";
            QLvl2[4] = "Who was the last Vicar of Christ to resign the office?\n" +
                    "a. Linus\n" + "b. Benedict XVI\n" + "c. Francis\n" + "d. Sixtus V";
            QLvl2[5] = "What made Martin Luther successful where the previous heretics did not?\n" +
                    "a. Theology\n" + "b. Printing Press\n" + "c. Papal Support\n" + "d. Holy Grail";
        //Answer C
            QLvl2[6] = "Which Rule (Regula) do the Order of Preachers follow?\n" +
                    "a. Rule of St. Francis\n" + "b. Rule of St. Dominic\n" + "c. Rule of St. Augustine\n" + "d. Rule of St. Benedict";
            QLvl2[7] = "How many Franciscan Groups are there today?\n" +
                    "a. One\n" + "b. Two\n" + "c. Three\n" + "d. Four";
        //Answer D
            QLvl2[8] = "Which Council resolved the Western Schism?\n" +
                    "a. Council of Trent\n" + "b. First Vatican Council\n" + "c. Council of Lyons\n" + "d. Council of Constance";
            QLvl2[9] = "What group separated from the Catholic Church after the First Vatican Council?\n" +
                    "a. Jehovah's Witnesses\n" + "b. Anglican Church\n" + "c. Eastern Orthodox Church\n" + "d. Old Catholic Churches";

        //Randomized Counter
            randNum(10);
            
            int[] answers = new int[5];
            
            for (int counter = 0; counter < answers.length; counter++){
                Level2Answers(c[counter]);
                
                if ((bonus50 == 0)&&(bonusCall == 0)){
                    String[] options = {"a","b","c","d","Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 4){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                    }
                    
                    
                } else if ((bonus50 == 1)&&(bonusCall == 1)){
                    String[] options = {"a","b","c","d",bonus1,bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 4){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","--","d","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        }  else if (correctAns == 3){
                            String[] options2 = {"--","--","c","d","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 5){
                        Random rand = new Random();
                            int num1 = rand.nextInt(4);
                            String[] options2 = {"a","b","c","d","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 6){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                    }
                    
                } else if ((bonus50 == 1)&&(bonusCall == 0)){
                    String[] options = {"a","b","c","d",bonus1,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 4){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","--","d","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        }  else if (correctAns == 3){
                            String[] options2 = {"--","--","c","d","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 5){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                    }
                } else if ((bonus50 == 0)&&(bonusCall == 1)){
                    String[] options = {"a","b","c","d",bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                        if (answers[counter] == 4){
                        Random rand = new Random();
                            int num1 = rand.nextInt(4);
                            String[] options2 = {"a","b","c","d","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+10]+"\n"+QLvl2[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 5){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level2AnswerCheck(c[counter], answers[counter], amountNum[counter+10]);
                    }
                }    
            }
                popUpCheck(2, earnings);
                
    } catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            Reset50();
            ResetCall();
            MainMenu();
        }
    }

}
    
    public int Level2Answers(int a){
        if ((a == 0) || (a == 1) || (a == 2)){
            correctAns = 0;
        } else if ((a == 3) || (a == 4) || (a == 5)){
            correctAns = 1;
        } else if ((a == 6) || (a == 7)){
            correctAns = 2;
        } else if ((a == 8) || (a == 9)){
            correctAns = 3;
        }
        return correctAns;
    }
  
    public double Level2AnswerCheck (int a, int x, int b){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        Level2Answers(a);
        
        if (x == correctAns){
                    earnings = earnings + b;
                    JOptionPane.showMessageDialog(null,"The answer is correct!\nYou now have: ₱"+(decimalFormat.format(earnings)));
        } else {
            earnings = earnings - b;
            if (earnings <= 0){
                earnings = 0;
                JOptionPane.showMessageDialog(null, "You lost!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Reset50();
                ResetCall();
                MainMenu();
            } else {
                if (earnings <= 0){
                    earnings = 0;
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        
        return earnings;
        
    }
    
    public void Level3 () {
    try{
        JOptionPane.showMessageDialog(null,"WELCOME TO ROUND 3!\nINSTRUCTIONS:\nAnswer correctly and you get money; answer wrongly and we deduct money.\n"+
                                          "Finish all 3 questions to move on to the next round. If your lose all your earnings, you lose the game.");
        //QUESTIONS
        String[] QLvl3 = new String[6];
        //Answer A
            QLvl3[0] = "How many Rites are there in the Catholic Church?\n" +
                    "a. 6\n" + "b. 10\n" + "c. 4";
            QLvl3[1] = "What is the largest sui iuris Church in the Catholic Church?\n" +
                    "a. Latin Catholic Church\n" + "b. Ukrainian Greek Catholic Church\n" + "c. Melkite Greek Catholic Church";
        //Answer B
            QLvl3[2] = "Which is not a Patriarchal Church?\n" +
                    "a. Armenian Catholic Church\n" + "b. Syro-Malabar Catholic Church\n" + "c. Coptic Catholic Church";
            QLvl3[3] = "Which Liturgy does not have the Institution Narrative?\n" +
                    "a. Liturgy of St. John Chrysostom\n" + "b. Liturgy of Sts. Addai and Mari\n" + "c. Liturgy of St. Nestorius";
        //Answer C    
            QLvl3[4] = "How many claimants to the See of Antioch are there?\n" +
                    "a. 20\n" + "b. 12\n" + "c. 5";
            QLvl3[5] = "Which Church does not add water to the wine in their Liturgy?\n" +
                    "a. Syriac Catholic Church\n" + "b. Italo-Albano Catholic Church\n" + "c. Armenian Catholic Church";
        
        //Randomized Counter
            randNum(6);
                    
            int[] answers = new int[3];
            
            for (int counter = 0; counter < answers.length; counter++){
                Level3Answers(c[counter]);
                
                if ((bonus50 == 0)&&(bonusCall == 0)){
                    String[] options = {"a","b","c","Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 3){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                    }
                    
                    
                } else if ((bonus50 == 1)&&(bonusCall == 1)){
                    String[] options = {"a","b","c",bonus1,bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 3){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 4){
                        Random rand = new Random();
                            int num1 = rand.nextInt(3);
                            String[] options2 = {"a","b","c","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 5){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                    }
                    
                } else if ((bonus50 == 1)&&(bonusCall == 0)){
                    String[] options = {"a","b","c",bonus1,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                   if (answers[counter] == 3){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        } else if (correctAns == 2){
                            String[] options2 = {"a","--","c","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 4){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                    }
                } else if ((bonus50 == 0)&&(bonusCall == 1)){
                    String[] options = {"a","b","c",bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                        if (answers[counter] == 3){
                        Random rand = new Random();
                            int num1 = rand.nextInt(3);
                            String[] options2 = {"a","b","c","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+15]+"\n"+QLvl3[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 4){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level3AnswerCheck(c[counter], answers[counter], amountNum[counter+15]);
                    }
                }    
            }
                popUpCheck(3, earnings);
                
    }catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            Reset50();
            ResetCall();
            MainMenu();
        }
    }
    }
    
    public int Level3Answers(int a){
        if ((a == 0) || (a == 1)){
            correctAns = 0;
        } else if ((a == 2) || (a == 3)){
            correctAns = 1;
        } else if ((a == 4) || (a == 5)){
            correctAns = 2;
        }
        return correctAns;
    }
  
    public double Level3AnswerCheck (int a, int x, int b){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        Level3Answers(a);
        
        if (x == correctAns){
                    earnings = earnings + b;
                    JOptionPane.showMessageDialog(null,"The answer is correct!\nYou now have: ₱"+(decimalFormat.format(earnings)));
        } else {
            earnings = earnings - b;
            if (earnings <= 0){
                earnings = 0;
                JOptionPane.showMessageDialog(null, "You lost!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Reset50();
                ResetCall();
                MainMenu();
            } else {
                if (earnings <= 0){
                    earnings = 0;
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        
        return earnings;
        
    }
    
    public void Level4 () {
    try{
        JOptionPane.showMessageDialog(null,"WELCOME TO ROUND 4!\nINSTRUCTIONS:\nAnswer correctly and you get money; answer wrongly and we deduct money.\n"+
                                          "Finish all 2 questions to move on to the next round. If your lose all your earnings, you lose the game.\n"
                                           + "NOTE: This is the last time you can use your '50/50' or 'Call a friend' if you still have any!");
        //QUESTIONS
        String[] QLvl4 = new String[4];
        //Answer A
            QLvl4[0] = "'I am willing to die for the holy union, for the Supremacy of St. Peter, and of his successors!'— was said by\n" +
                    "a. St. Josaphat Kuntcevych\n" + "b. St. Maximus Hagiorite";
            QLvl4[1] = "The union of 1646 that united the Ruthenian Church to the Church of Rome\n" +
                    "a. Union of Uzhhorod\n" + "b. Union of Brest";
        //Answer B
            QLvl4[2] = "Which ancient See has precedence over the See of Antioch?\n" +
                    "a. Jerusalem\n" + "b. Alexandria";
            QLvl4[3] = "What is the Greek equivalent of a Latin Eucharistic Prayer?\n" +
                    "a. Epiklesis\n" + "b. Anaphora";
        
        //Randomized Counter
            randNum(4);
            
            int[] answers = new int[2];
                    
            for (int counter = 0; counter < answers.length; counter++){
                Level4Answers(c[counter]);
                
                if ((bonus50 == 0)&&(bonusCall == 0)){
                    String[] options = {"a","b","Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 2){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                    }
                    
                    
                } else if ((bonus50 == 1)&&(bonusCall == 1)){
                    String[] options = {"a","b",bonus1,bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (answers[counter] == 2){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 3){
                        Random rand = new Random();
                            int num1 = rand.nextInt(2);
                            String[] options2 = {"a","b","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 4){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                    }
                    
                } else if ((bonus50 == 1)&&(bonusCall == 0)){
                    String[] options = {"a","b",bonus1,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                   if (answers[counter] == 2){
                        if (correctAns == 0){
                            String[] options2 = {"a","--","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                                bonus50 = 0;
                        } else if (correctAns == 1){
                            String[] options2 = {"--","b","Quit"};
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                                "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                                Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                                bonus50 = 0;
                        }
                    } else if (answers[counter] == 3){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                    }
                } else if ((bonus50 == 0)&&(bonusCall == 1)){
                    String[] options = {"a","b",bonus2,"Quit"};
                    answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                        "Question "+(counter+1),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                        if (answers[counter] == 2){
                        Random rand = new Random();
                            int num1 = rand.nextInt(2);
                            String[] options2 = {"a","b","Quit"};
                            
                            JOptionPane.showMessageDialog(null,"Your friend says the answer is "+options2[num1]);
                            
                            answers[counter] = JOptionPane.showOptionDialog(null, "FOR ₱"+amountNum[counter+18]+"\n"+QLvl4[c[counter]],
                            "Question "+(counter+1),
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                            Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                            bonusCall = 0;
                            
                    } else if (answers[counter] == 3){
                        JOptionPane.showMessageDialog(null, "You lost!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        Reset50();
                        ResetCall();
                        MainMenu();
                    } else {
                    Level4AnswerCheck(c[counter], answers[counter], amountNum[counter+18]);
                    }
                }    
            }
                popUpCheck(5, earnings);
                
    }catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            Reset50();
            ResetCall();
            MainMenu();
        }
    }
    }
    
    public int Level4Answers(int a){
        if ((a == 0) || (a == 1)){
            correctAns = 0;
        } else if ((a == 2) || (a == 3)){
            correctAns = 1;
        }
        return correctAns;
    }
    
    public double Level4AnswerCheck (int a, int x, int b){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        Level4Answers(a);
        
        if (x == correctAns){
                    earnings = earnings + b;
                    JOptionPane.showMessageDialog(null,"The answer is correct!\nYou now have: ₱"+(decimalFormat.format(earnings)));
        } else {
            earnings = earnings - b;
            if (earnings <= 0){
                earnings = 0;
                JOptionPane.showMessageDialog(null, "You lost!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Reset50();
                ResetCall();
                MainMenu();
            } else {
                if (earnings <= 0){
                    earnings = 0;
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        
        return earnings;
        
    }
    
    public void Level5 () {
    try{
        JOptionPane.showMessageDialog(null,"WELCOME TO THE FINAL ROUND!\nINSTRUCTIONS:\nThere are no choices in this round. Type in your answer carefully!\n"+
                                          "Win this round, you get ₱ 1,000,000.00 plus your earnings!\nLose and your earnings will be halved!");
        //QUESTION
            String[] QLvl5 = new String[5];
            QLvl5[0] = "Pope Saint __________ the Great rejected the 28th Canon of the Council of Chalcedon.";
            QLvl5[1] = "How many St. Peter's Basilica have been built so far?";
            QLvl5[2] = "What is the name of the Pope's Church? St. _________ ___________";
            QLvl5[3] = "The granting of the Tomos to the Church of __________ caused a great rift in Orthodoxy in 2018.";
            QLvl5[4] = "___________, a name given to the bishop of Rome in the declaration of Ravenna";
            
            Random rand = new Random();
            int count = rand.nextInt(4);
            String answer = JOptionPane.showInputDialog(QLvl5[count]);
            Level5AnswerCheck(answer, count);
            
            
    } catch(HeadlessException e){
        String[] options = {"Quit"};
        int x = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Good day to you!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == 0){
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!");
            Reset50();
            ResetCall();
            MainMenu();
        }
    }
    }
    
    public String Level5Answers(int a){
        if (a == 0){
            finalAns = "leo";
        } else if (a == 1){
            finalAns = "2";
        } else if (a == 2){
            finalAns = "john lateran";
        } else if (a == 3){
            finalAns = "ukraine";
        } else if (a == 4){
            finalAns = "protos";
        } 
        return finalAns;
    }
    public double Level5AnswerCheck (String x, int a){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        
        
        Level5Answers(a);

        if (finalAns == null ? x.toLowerCase() == null : finalAns.equals(x.toLowerCase())){
                    earnings = earnings + 1000000;
                    Reset50();
                    ResetCall();
                    tickets++;
                    JOptionPane.showMessageDialog(null,"The answer is correct!\nCONGRATULATIONS! YOU HAVE WON ₱"+(decimalFormat.format(earnings)));
                    MainMenu();
        } else {
            if (earnings <= 0){
                earnings = 0;
                JOptionPane.showMessageDialog(null, "You lost!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Reset50();
                ResetCall();
                MainMenu();
            } else {
                earnings = earnings/2;
                if (earnings <= 0){
                    earnings = 0;
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The answer is incorrect!\nYour earnings are halved!\nYou only have: ₱"+(decimalFormat.format(earnings)),
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        
        return earnings;
        
    }
    
    public void popUpCheck(int x, double earnings){
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        if (earnings > 0){
        String[] options1 = {"Yes","No"};
            int answer = JOptionPane.showOptionDialog(null, "Congratulations for completing Round "+x+"\nCONTINUE?\nNOTE: Choosing to exit now will give you your winnings for the current round.",
                "Continue?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);
            if (answer == 0){
                tickets++;
            } else {
                JOptionPane.showMessageDialog(null,"Thank you for playing! You now have: ₱"+(decimalFormat.format(earnings)));
                tickets++;
                Reset50();
                ResetCall();
                MainMenu();
            }
        } else {
            JOptionPane.showMessageDialog(null, "You lost!",
                          "Error", JOptionPane.ERROR_MESSAGE);   
        }
    }
    
    public int Reset50(){
        bonus50 = 1;
     return bonus50;
    }
    
    public int ResetCall(){
        bonusCall = 1;
    return bonusCall;
    }
}


