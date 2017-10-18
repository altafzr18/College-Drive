
package FileShare;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SendFile extends Thread{
 
    String FILE_TO_SEND = "change.py";
    InputStream in = null;
    DataInputStream dis = null;
    DataOutputStream dos = null;
    Socket socket = null;
    int session;
    String user_id;
    String loc;
    String path;
   public SendFile(Socket socket)
   {
        this.socket = socket;
   }
   
   public void run()
   {
        try {
            in = socket.getInputStream();
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            
            session=dis.readInt();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM session WHERE sess_id='"+session+"';");
            rs.next();
            user_id=rs.getString("user_id");
            
            FILE_TO_SEND = dis.readUTF();
            
            path=user_id+"/"+FILE_TO_SEND;
            
            File file = new File(path);
            byte[] bytearray = new byte[(int)file.length()];
            
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println("Sending file to client....");
            bis.read(bytearray,0,bytearray.length);
            dos.write(bytearray,0,bytearray.length);
            dos.flush();
            System.out.println("File successfully sent...");
            
            //Close the connection and all I/O streams
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally
        {
            try {
                socket.close();
                in.close();
                dos.close();
                dis.close();
            } catch (IOException ex) {
                System.out.println(ex);
                Logger.getLogger(SendFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
   }
    
}
