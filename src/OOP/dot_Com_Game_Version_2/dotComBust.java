/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.dot_Com_Game_Version_2;

import java.util.ArrayList;

/**
 *
 * @author nazrul
 */
public class dotComBust {
    gameHelper help = new gameHelper();
    private ArrayList<dotCom> dotComList = new ArrayList<dotCom>();
    int numberOfGuess = 0;
    public void setUpGame(){
        dotCom one  = new dotCom();
        one.setName("pets.com");
        dotCom two  = new dotCom();
        two.setName("bang.com");
        dotCom three  = new dotCom();
        three.setName("go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        System.out.println("Your goal is to sink all the dot coms.");
        System.out.println("pets.com,bang.com,go2.com");
        System.out.println("Try to sink'em all in the lowest possible guesses\n type 'end' if you want to quit. ");
        for (dotCom dotComSet : dotComList) {
            ArrayList<String> newLocations = help.placeDotCom(3);
            dotComSet.setLocations(newLocations);
        }
    
    }
    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userguess = help.getUserInput("enter a guess");
            if(userguess.equals("end")){
                
                break;
            }
            else{
            checkuserguess(userguess);
         
            
        
        
            }
            
        }
        finish();
    }
    private void checkuserguess(String userguess){
        numberOfGuess++;
        String result = "miss";
        for (dotCom dotComListTest : dotComList) {
            result = dotComListTest.checkUserGuess(userguess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComList.remove(dotComListTest);
                break;
            }
        }
        System.out.println(result);
    }
     private void finish(){
         if(!dotComList.isEmpty()){
             System.out.println("Game Over! Yeah, i know, this game is shit");
         }
         else{
        System.out.println("all the dots are dead now. There's no point even trying!");
        if(numberOfGuess <= 18){
            System.out.println("it took you "+numberOfGuess+" guesss");
        }
        else{
            System.out.println("sorry!Play again, kid!");        
        }
         }
    }
    public static void main(String[] args) {
        dotComBust bust = new dotComBust();
        bust.setUpGame();
        bust.startPlaying();
    }
}
