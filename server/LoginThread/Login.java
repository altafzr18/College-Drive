
package LoginThread;
import java.net.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Login extends Thread{
    
    public Socket socket = null;
    HashMap<String,String> hashmap= null;
    String user_id = null;
    String password = null;
    public Login(Socket socket)
    {
        this.socket = socket;
        System.out.println("Thread Created");
    }
    
    @Override
    public void run()
    {
        ObjectInputStream ois = null;
        DataOutputStream dos = null;
        System.out.println("Login Thread Started");
        try
        {
            ois = new ObjectInputStream(this.socket.getInputStream());
            dos = new DataOutputStream(this.socket.getOutputStream());
            
            this.hashmap = (HashMap)ois.readObject();
            this.user_id = hashmap.get("user_id");
            this.password = hashmap.get("password");
            
            System.out.println("Logging in : "+this.user_id);
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM user_creds WHERE user_id='"+this.user_id
                    +"' AND "+ "password='"+this.password+"';");            
            
            if(rs.next())
            {
                smt.executeUpdate("INSERT INTO session values(0,'"+this.user_id+"');");
                rs = smt.executeQuery("SELECT * FROM session WHERE user_id='"+this.user_id+"';");
                rs.next();
//                System.out.println(rs.getInt("sess_id"));

                dos.writeBoolean(true);
                dos.writeInt(rs.getInt("sess_id"));
                System.out.println(this.user_id+" logged in !!");
            }
            else
            {
                dos.writeBoolean(false);
                System.err.println("Login unsuccessful !!");
            }
            
            
            conn.close();
            this.socket.close();
            return;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
