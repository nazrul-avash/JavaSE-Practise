/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

import java.text.DecimalFormat;

/**
 *
 * @author nazrul
 */
public class decimalFormat {
  
public static void main(String args[]){
int a=500;
double b=1423.45465;

    DecimalFormat df=new DecimalFormat("###.00");
    String str=df.format(b);
   
    System.out.println(Double.parseDouble(str)*10);

}
}
