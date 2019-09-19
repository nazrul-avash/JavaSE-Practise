/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anomalia;

import java.util.ArrayList;

/**
 *
 * @author Nos
 */
public class Cyborg extends Android{
    int bathe(){
    return 0;
    }
    public int countElement(ArrayList<String> array){
        return array.size();
        
    }
   public void eleminatehuman(ArrayList<String> array){
       int index = 0;
       int toDelete = 0;
       for (String array1 : array) {
           index++;
           if(array1.contains("human")){
               toDelete = index;
               break;
           }
       }
       array.remove(toDelete);
        
    }
}
