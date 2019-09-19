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
public class countingOccurencesOfaWord {
public static void main(String srw[]){
int count=0;
    String text="asdkfjwaeiooiew one hellone";
String regex="\\bone\\b";
Pattern pat=Pattern.compile(regex);
Matcher match=pat.matcher(text);
while(match.find()){
    count++;

}
    System.out.println(count);
}    
}
