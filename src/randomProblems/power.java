/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class power {
    public static int power(int base,int pow){
    if(pow<1)
        return 1;
    else
        return base*power(base, pow-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int base=in.nextInt(),power=in.nextInt();
        System.out.println(power(base, power));
        
    }
    
}
