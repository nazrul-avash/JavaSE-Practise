/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class bdNameFormat {
public static void main(String afgs[]){
String s="a.m.m pfosy";
String regex="^[a-zA-Z]+ ?((\\.|-| )[a-zA-Z]+)*?$";
Pattern pat=Pattern.compile(regex);
Matcher match=pat.matcher(s);
if(match.matches()){
    System.out.println("hallelujah");

}
else{
    System.out.println("aint no bdeshi");
}
}    
}
