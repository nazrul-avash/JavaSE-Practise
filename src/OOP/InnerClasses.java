/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class InnerClasses {
      private String str ="bangla";
      StringBuilder sb = new StringBuilder(str);
      public String revWithBangla(String str){
          return sb.reverse()+str;
      }
      class Middle{
          private int n = 5;
       
         
          public int sum(int a, int b){
              return a+b;
          }
      }
      
      public void mainn(String[] args) {
        
            Middle mid = new Middle();
          InnerClasses in = new InnerClasses();
          System.out.println(in.revWithBangla(null));
          
          System.out.println(mid.sum(10, 15));
    }
      public static void main(String[] args) {
          InnerClasses in = new InnerClasses();
          Middle m = new InnerClasses().new Middle();
          m.sum(5, 5);
          
          String s[] =new String[5];
          try {
              in.mainn(s);
          } catch (Exception e) {
              System.out.println(e);
          }
          finally{
              
          }
    }
    
}
