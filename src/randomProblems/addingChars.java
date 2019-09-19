/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline;

/**
 *
 * @author nazrul
 */
public class addingChars {
    public static void main(String[] args) {
        String str="2352a8";
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>47&& str.charAt(i)<58){
        sum =sum+ str.charAt(i)-48;}
        }
        System.out.println(sum);
    }
    
}
