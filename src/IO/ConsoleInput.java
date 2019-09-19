/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author nazrul
 */
public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader ins = new InputStreamReader(System.in);
        ins.read();
        
    }
    
}
