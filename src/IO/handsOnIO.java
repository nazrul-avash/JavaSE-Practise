/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;
import java.io.*;
/**
 *
 * @author nazrul
 */
public class handsOnIO {
    public static void main(String[] args) {
        float a=4.56f;
        try{
        InputStream input=new FileInputStream("F:\\Books/a.jpg");
            System.out.println("file Opened ... Ta Daaaa");
            
        
        }
        catch(Exception e){
            System.out.println(e);
        }

        }
    
}
