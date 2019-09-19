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
public class dotCom {
   private ArrayList <String> locationCells;
   private String name;
   public void setLocations(ArrayList<String> locs){
   
   locationCells=locs;
   }
   public void setName(String n){
   name=n;
   }
   public String checkUserGuess(String userInput){
   String result="miss";
   int index=locationCells.indexOf(userInput);
   if(index>=0){
   locationCells.remove(index);
   
 
       if(locationCells.isEmpty()){
       result="kill";
           System.out.println("You have sunk,"+ name);
       }
       else{
           result = "Hit";
       }
   
   
   
}
   return result;
}
}