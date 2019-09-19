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
public class findinWords {
public static void main(String afrs[]){
    int count=0;
    String s="    bang                   bang into road fd  ";
    String regexONe="\\S+";
    String regexTwo="[a-z]+";
    Pattern pat=Pattern.compile(regexONe);
    Pattern pat2=Pattern.compile(regexTwo);
    Matcher match=pat.matcher(s);
    Matcher match2=pat2.matcher(s);
    while(match2.find()){
    count++;
    }
    System.out.println(count);


}    
}
