/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author Lenovo
 */
public class triplets {
    public static void main(String args[]){
    
    int x=4,y=4,z=4;
    int a=0,b=1,c=2;
    for(a=0;a<=x;a++){
    for(b=1;b<=y;b++){
    for(c=2;c<=z;c++){
    if(a<b && b<c){
    System.out.println(a+""+b+""+c);
    }
    
    }
    }
    
    }
    }
    
}
