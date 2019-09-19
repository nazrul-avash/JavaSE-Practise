package ClientServerProgramming;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args)  throws IOException{
        Socket socket = new Socket("127.0.0.1",4444);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        PrintStream pStream = new PrintStream(socket.getOutputStream());
        String text;
        while (true){
            System.out.print("client: ");
            text = stdIn.readLine();
            pStream.println(text);
            text = bReader.readLine();
            System.out.print("Server: "+text+"\n");
            if (text.equalsIgnoreCase("BYE")){
                break;
            }
        }
        socket.close();
        bReader.close();
        stdIn.close();
        pStream.close();
    }
}
