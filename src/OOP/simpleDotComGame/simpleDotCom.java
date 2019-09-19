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
public class simpleDotCom {
private int[] locationCells;
private int numOfHits;
public void setLocations(int[] locs){
locationCells=locs;
}
public String checkUrself(String stringGuess){
 String result="miss";
int number=Integer.parseInt(stringGuess);
for(int cell: locationCells){
if(number==cell){
result="hit";
++numOfHits;
break;
}
}
if(numOfHits==locationCells.length){
result="kill";
}
return result;
}
}
