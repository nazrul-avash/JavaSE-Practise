/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author nazrul
 */
public class OneToTwo {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream in = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\one.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\two.txt");
            int i ;
            while((i = in.read())!= -1){
                out.write(i);
            }
        }
        catch(Exception e){
        
        }
    }
    
}
