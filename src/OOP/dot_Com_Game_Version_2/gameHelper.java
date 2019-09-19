/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.dot_Com_Game_Version_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author nazrul
 */
public class gameHelper {
//    dotComBust close = new dotComBust();
    private static final String alphabets = "abcdefg";
    private int comCount = 0;
    private int gridLength = 7;
    private int gridSize = 49;
    int []grid = new int [gridSize];
    public String getUserInput(String promt){
       
    
        System.out.println(promt+" ");
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length()==0){
                return null;
            }
//            if(inputLine.equals("end")){
//                close.finish();
//            }
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
        return inputLine.toLowerCase();
    }
    public ArrayList<String> placeDotCom(int comSize){
        
        ArrayList<String> alphaCell = new ArrayList<>();    
        String[] aplphaCoords = new String[comSize];
        String temp = null;
        int [] coords = new int[comSize];
        boolean success = false;
        int location = 0;
        int attempts = 0;
        comCount++;
        int incr = 1;
        if(comCount % 2 == 1){
            incr = gridLength;
        }
        while(!success && attempts++ <200){
            location = (int)(Math.random()*gridSize);
            int x = 0;
            success = true;
            while(success && x < comSize){
                if(grid[location] == 0){
                    coords[x++] = location;
                    location = location +incr;
                    if(location >= gridSize){
                        success = false;
                    }
                    if(x > 0 && location % gridLength == 0){
                        success = false;
                    }
                    
                }
                else{
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int coloumn = 0;
        while(x < comSize){
            grid[coords[x]] = 1;
            row = (int)(coords[x]/gridLength);
            coloumn = coords[x] % gridLength;
            temp = String.valueOf(alphabets.charAt(coloumn));
            alphaCell.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCell;
        
    }
}
