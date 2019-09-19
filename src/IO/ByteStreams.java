/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author nazrul
 */
public class ByteStreams {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out  = null;
        try {
             System.out.println(System.getProperty("user.dir"));
             in = new FileInputStream("src\\files\\hallelujah.txt");
             out = new FileOutputStream("src\\files\\again.txt");
           
        int x ;
        while((x =in.read())!= -1 ){
            out.write(x);
        }
           } catch (Exception e) {
               System.out.println(e);
//               
           }
        finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
    

