/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author nazrul
 */
public class DealingWithCharacters {

    public static void main(String[] args) throws IOException {
//        System.out.println(Character.SIZE);
        String s ="কিভসাদফসদফ?";
        System.out.println(s);
//        System.out.println(System.getProperty("file.encoding"));
//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
//        String str = buff.readLine();
//        System.out.println((int)str.charAt(0));
        Scanner in = new Scanner(System.in, "UTF-8");
        String ss = in.nextLine();
//        String sr = new String(ss.getBytes("utf-8"), "ISO-8859-1");
        System.out.println(ss);
        File fl = new File("src\\files\\a.txt");
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fl,true)));
            out.write(ss);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        String line ="asf";
//        System.out.println(System.getProperty("file.encoding"));

    }

}
