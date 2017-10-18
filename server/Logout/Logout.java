package Logout;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logout extends Thread{
    
    Socket socket = null;
    
    DataInputStream dis = null;
    DataOutputStream dos = null;
    
    public Logout(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("Logout in process !!");
            int sess_id = dis.readInt();
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            
            smt.executeUpdate("DELETE FROM session where sess_id = '"+sess_id+"';");
            System.out.println("Logged Out... ");
        } catch (Exception ex) {
            System.err.println(ex);
           
            Logger.getLogger(Logout.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                socket.close();
                dis.close();
                dos.close();
            } catch (IOException ex) {
                Logger.getLogger(Logout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
