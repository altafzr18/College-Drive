
package FileShare;

import java.io.DataInputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileList extends Thread{
    Socket socket = null;
    String user_id;
    String path;
    int session;
    String loc;
    List<String> list;
    public FileList(Socket socket)
    {
        this.socket = socket;
        list = new ArrayList<>();
    }
    
    @Override
    public void run()
    {
        try {
            System.out.println("FileList request ...");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            session=dis.readInt();
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drive?characterEncoding=UTF-8&useSSL=false","root","aj123");
            Statement smt = conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM session WHERE sess_id='"+session+"';");
            rs.next();
            user_id=rs.getString("user_id");
            
            File folder = new File(user_id);
            File[] listOfFiles = folder.listFiles();
            
            for(int i=0;i<listOfFiles.length;i++)
            {
                if(listOfFiles[i].isFile())
                {
                    list.add(listOfFiles[i].getName());
                }
            }
            
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(list);
            System.out.println("File list sent!");
               oos.close();
            dis.close();
            socket.close();
        } catch (Exception ex) {
            Logger.getLogger(FileList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
