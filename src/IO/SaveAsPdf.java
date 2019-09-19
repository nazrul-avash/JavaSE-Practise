/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;

/**
 *
 * @author nazrul
 */
public class SaveAsPdf {
    char c;
    public static void main(String[] args) {
        
//        System.out.println(new SaveAsPdf().c);
        System.out.println("\u1fff");
        File fl = new File("C:\\Users\\Lenovo\\Desktop\\one.txt");
        fl.renameTo(new File("C:\\Users\\Lenovo\\Desktop\\on.pdf"));
    }
    
}
