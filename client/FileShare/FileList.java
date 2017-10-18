
package FileShare;

import FinalGUI.Homepage;
import java.awt.Font;
import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class FileList extends Thread{
    
    Socket socket;
    public FileList(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        List<String> list = new ArrayList<>();
        DataInputStream dis;
        ObjectInputStream ois;
        DataOutputStream dos;
        try {
            //Connection.ConnectToServer.connect_to_server();
            System.out.println("File list request");
            dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("Heyy");
            dos.writeInt(8);//8 is the action id for file list request
            System.out.println("Hello");
            dos.writeInt(Database.UserDetails.sess_id);
            
            ois = new ObjectInputStream(socket.getInputStream());
            list = (List)ois.readObject();
            System.out.println("File List accepted");
            
            Object[] row = new Object[3];
            DefaultTableModel model = (DefaultTableModel) Homepage.file_table.getModel();
            model.setRowCount(0);
           // Homepage.file_table.setFont(new Font("Serif", Font.BOLD, 20));
           Homepage.file_table.setRowMargin(2);
           for(int i=0;i<list.size();i++)
            {
                row[0] = list.get(i);
                model.addRow(row);
            }
            
            dos.close();
            ois.close();
            
        } catch (Exception ex) {
            System.err.println(ex);
            Logger.getLogger(FileList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
/*    public static List<String> fileList()
    {
        return list;
    }
  */  
}
