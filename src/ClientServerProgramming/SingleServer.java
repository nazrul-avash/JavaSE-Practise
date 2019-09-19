package ClientServerProgramming;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SingleServer {
    public void  go (){
        try {
            ServerSocket socket = new ServerSocket(4444);
            while (true){
                System.out.println("hi");
                Socket sock = socket.accept();
                if (sock.isConnected()){
                    System.out.println("connected");
                    System.out.println(sock.getLocalAddress());
                    System.out.println(sock.getLocalPort());
                }
                BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
                Scanner scan = new Scanner(System.in);
                String output = scan.nextLine();

                bWriter.write(output);
                bWriter.close();
            }

        }
        catch (IOException ex){

        }

    }

    public static void main(String[] args) {
        SingleServer server = new SingleServer();
        server.go();
    }
}
