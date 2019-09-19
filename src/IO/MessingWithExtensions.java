/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author nazrul
 */
public class MessingWithExtensions {
    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\titanic.mp4");
//        System.out.println(fl.createNewFile());
        System.out.println(fl.renameTo(new File("E:\\titanic.mp4")));
        System.out.print(System.getenv());
        System.getenv();
    }
}
