package RegisterThread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateDetails extends Thread{
    Socket socket = null;
    DataInputStream dis;
    DataOutputStream dos;
   
    public UpdateDetails(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            
            System.out.println("Getting user details !!");
            int sess_id = dis.readInt();
            
            System.out.println("Fetching user details..");
            
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            HashMap<String,String> map = (HashMap)ois.readObject();
            String name = map.get("name");
            String email = map.get("email");
            String year = map.get("year");
            String div = map.get("div");
            String gr_no = map.get("gr_no");
            System.out.println("Updating user : "+name);
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            
            ResultSet res = smt.executeQuery("Select * FROM session where sess_id = '"+sess_id+"';");
            res.next();
            String user_id = res.getString("user_id");
            
            String query = "UPDATE user_info set name='"+name+"',email = '"+email+"',year='"+year+"',division='"+div+
                    "' WHERE user_id='"+user_id+"';";
            smt.executeUpdate(query);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
            
    }
}
