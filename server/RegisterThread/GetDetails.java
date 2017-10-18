package RegisterThread;

import Logout.Logout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDetails extends Thread{
    
    Socket socket = null;
    DataInputStream dis = null;
    DataOutputStream dos = null;
    
    public GetDetails(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
         try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Getting user details !!");
            int sess_id = dis.readInt();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            
            ResultSet res = smt.executeQuery("Select * FROM session where sess_id = '"+sess_id+"';");
            res.next();
            String user_id = res.getString("user_id");
            
             System.out.println("Details of "+user_id);
            res = smt.executeQuery("SELECT * FROM user_info where user_id='"+user_id+"';");
            res.next();
            HashMap<String,String> map = new HashMap<>();
            map.put("user_id", res.getString("user_id"));
            map.put("name",res.getString("name"));
            map.put("roll_no",res.getString("roll_no"));
            map.put("gr_no",res.getString("gr_no"));
            map.put("email",res.getString("email"));
            map.put("year",res.getString("year"));
            map.put("division",res.getString("division"));
            
            
            oos.writeObject(map);
            
        } 
        catch (Exception ex) {
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
