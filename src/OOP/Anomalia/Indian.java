/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Anomalia;

/**
 *
 * @author Nos
 */
public class Indian extends Asian {
    int country = 5;
    @Override
    public String getSkinColor(){
        return "black in india";
    }
    @Override
    public int countPopulation(){
        
        return 5;
    }
    @Override
    public String detectReligion(){
        return "Hindu in India";
    }

    @Override
    public int averageSleepTime() {
       return 5;
    }
    int averageSleepTime(int n){
        return 5;
    }
    public String foodHabit(){
        return "spicy in india";
    }
    public int violenceLevel(){
        return 5;
    }
}
