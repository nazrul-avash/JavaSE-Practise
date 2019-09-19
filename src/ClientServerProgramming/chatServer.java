package ClientServerProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class chatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4444);
        Socket sock = socket.accept();
        BufferedReader bReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintStream pStream = new PrintStream(sock.getOutputStream());
        BufferedReader stdIn= new BufferedReader(new InputStreamReader(System.in));
        String text;
        while (true){
            text = bReader.readLine();
            if(text.equalsIgnoreCase("END")){
                pStream.println("BYE");
                break;
            }
            System.out.print("client says: "+text+"\n");
            System.out.print("Server Says: ");
            text = stdIn.readLine();
            pStream.println(text);
        }
        socket.close();
        sock.close();
        bReader.close();
        stdIn.close();
        pStream.close();
    }
}
