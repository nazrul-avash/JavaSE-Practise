/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author nazrul
 */
public class ServerSide {
    public String getAdvice(){
        int i = (int)Math.random()*adviceList.length;
        return adviceList[i];
    }
    String [] adviceList = {"No hunks-punks","Dont get dowry"};
    void go(){
        try {
            ServerSocket sc = new ServerSocket(9090);
            while(true){
                Socket clientSocket = sc.accept();
                PrintWriter pt = new PrintWriter(clientSocket.getOutputStream());
                String advice  = getAdvice();
                pt.println(advice);
                pt.close();
                System.out.println(advice);
            
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    public static void main(String[] args) {
        ServerSide sd = new ServerSide();
        sd.go();
    }
}
