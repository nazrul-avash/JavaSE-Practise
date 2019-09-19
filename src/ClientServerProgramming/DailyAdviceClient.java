package ClientServerProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
   void go(){
       try{
           Socket socket = new Socket("127.0.0.1", 4444);
           InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
           BufferedReader reader = new BufferedReader(streamReader);
           String advice = reader.readLine();
           System.out.println("Today's advice: "+ advice);
           reader.close();
       }catch(IOException ex){
           System.out.println(ex);
       }
   }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}