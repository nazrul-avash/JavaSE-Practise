/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.simpleDotComGame;

/**
 *
 * @author nazrul
 */
public class simpleDotComTest {
    public static void main(String[] args) {
        int numberOfGuess=0;
        int cellNumbers=(int)Math.random()*5;
        boolean isAlive=true;
        simpleDotCom simple=new simpleDotCom();
        gameHelper game=new gameHelper();
        int[] locations={cellNumbers,cellNumbers+1,cellNumbers+2};
        simple.setLocations(locations);
        while(isAlive==true){
            String userGuess=game.getUserInput("Enter a number:");
            String result=simple.checkUrself(userGuess);
            System.out.println(result);
            ++numberOfGuess;
                if(result.equals("kill")){
                    isAlive=false;
                    System.out.println("you took"+ numberOfGuess+" turn to complete");
                }
        }
    }
    
}
