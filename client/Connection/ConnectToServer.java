package Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToServer {
    
    public static Socket socket = null;
    public static int PORT = 1234;
    public static String SERVER_IP = ""; //SERVER IP GOES HERE
    
    public static void connect_to_server()
    {
        try {
            System.out.println("Establishing connection to : "+SERVER_IP);
            socket = new Socket(SERVER_IP,PORT);

            System.out.println("Just connected to " + socket.getRemoteSocketAddress());
            System.out.println("Connection to Server Established !!");
        } catch (IOException ex) {
            System.out.println(ex);
            //Logger.getLogger(ConnectToServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
