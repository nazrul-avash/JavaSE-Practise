package ClientServerProgramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList={"go crazy","don't sleep","drink water","get ready","sleep now"};
    public void go(){

        try{
            ServerSocket socket = new ServerSocket(4444);
            while (true){
                Socket sock = socket.accept();
                PrintWriter print = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                print.println(advice);
                print.close();
                System.out.println(advice);
            }
        }
        catch(IOException ex){

        }
    }
    public String getAdvice(){
        int number = (int)(Math.random()*adviceList.length);
        return adviceList[number];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

}
