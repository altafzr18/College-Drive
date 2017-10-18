
package FileShare;

import java.io.DataInputStream;
import java.io.File;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteFile extends Thread{
    
    Socket socket = null;
    int session;
    public DeleteFile(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            session=dis.readInt();
            
            String FILE_TO_DELETE = dis.readUTF();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM session WHERE sess_id='"+session+"';");
            rs.next();
            String user_id=rs.getString("user_id");
            
            
            File file = new File(user_id+"/"+FILE_TO_DELETE);
            file.delete();
            socket.close();
            
        } catch (Exception ex) {
            System.out.println(ex);        }
    }
    
}
