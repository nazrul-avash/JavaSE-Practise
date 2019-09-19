/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anomalia;

/**
 *
 * @author Nos
 */
public class Android implements Humanable{
    int hand = 2;
    String sex(){
        return "male";
    }
    @Override
    public String sex(String type){
        return type;
    }
    @Override
    public String eat(){
        return "interface implemented by android Class";
    }
    @Override
   public int countChromosom(){
       return 99;
   }
    @Override
   public int countChromosom(int x){
       return 99;
   }
    @Override
   public int countLifeSpan(){
   
       return 99;
   }
    @Override
   public int detectContinent(){
       return 99;
   }
}
