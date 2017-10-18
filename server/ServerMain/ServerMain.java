package ServerMain;

import FileShare.DeleteFile;
import FileShare.FileList;
import FileShare.RecieveFile;
import FileShare.SendFile;
import java.util.*;
import java.net.*;
import java.io.*;
import LoginThread.*;
import RegisterThread.*;
import Logout.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerMain {
    
    
	final int PORT = 1234;
        ServerSocket serversocket = null;
	Socket socket = null;
        int ac_id;
        public void connect_to_client()
	{
            try
            {
		serversocket = new ServerSocket(PORT);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            while(true)
            {
                try
                {
                    socket = serversocket.accept();
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    this.ac_id = dis.readInt();
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
                System.out.println("\nNew Connection from : "+socket.getRemoteSocketAddress());
             
                switch(this.ac_id)
                {
                    case 1:
                        System.out.println("Login Request");
                        new Login(socket).start();
                        break;
                    case 2:
                        System.out.println("Register Request");
                        new Register(socket).start();
                        break;
                    case 4:
                        System.out.println("Upload Request");
                        new RecieveFile(socket).start();
                        break;
                    case 5:
                        System.out.println("Download Request");
                        new SendFile(socket).start();
                        break;
                        
                    case 6:
                        System.out.println("Update Request");
                        new UpdateDetails(socket).start();
                        break;
                            
                    case 7:
                        System.out.println("Logout Request");
                        new Logout(socket).start();
                        break;
                    case 8:
                        System.out.println("File List Request");
                        new FileList(socket).start();
                        break;
                    case 9:
                        System.out.println("Delete File Request");
                        new DeleteFile(socket).start();
                        break;
                    case 10:
                        System.out.println("User Details Requset");
                        new GetDetails(socket).start();
                        break;
                    default:
                        System.out.println("Action Not Defined");
                        break;
                }
            }

	}
        
	public static void main(String args[])
	{
               ServerMain s = new ServerMain();
               s.connect_to_client();
        
	}
}
