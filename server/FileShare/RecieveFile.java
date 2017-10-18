/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileShare;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ajinkya
 */
public class RecieveFile extends Thread{
    Socket socket = null;
    int bytesRead;
    int current = 0;
    String user_id;
    String path;
    int session;
    String loc;
    String FILE_TO_READ;
    
    public RecieveFile(Socket socket)
    {
        this.socket = socket;
    }
    
    public void run()
    {
        try{
           
               DataInputStream dis = new DataInputStream(socket.getInputStream());
               session=dis.readInt();
                Class.forName("com.mysql.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
                Statement smt = conn.createStatement();
                ResultSet rs=smt.executeQuery("SELECT * FROM session WHERE sess_id='"+session+"';");
                rs.next();
                user_id=rs.getString("user_id");
                System.out.println("Uploading file for user : "+user_id);
                loc=user_id;

                FILE_TO_READ = dis.readUTF();

                path=loc+"/"+FILE_TO_READ;
               // Writing the file to disk
               // Instantiating a new output stream object
               File f = new File(path);
               FILE_TO_READ = f.getName();
               
               OutputStream output = new FileOutputStream(path);

               byte[] buffer = new byte[1024];
               while ((bytesRead = dis.read(buffer)) != -1) {
                   output.write(buffer, 0, bytesRead);
               }
               System.out.println("File recieved successfully");
               
               
               // Closing the FileOutputStream handle
               output.close();

        }
        catch(Exception ex)
        {
               System.out.println(ex);
        }
    }

}
    
