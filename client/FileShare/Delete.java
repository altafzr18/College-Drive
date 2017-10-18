
package FileShare;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.Exception;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Delete extends Thread{
    
    Socket socket = null;
    String file = null;
    
    public Delete(Socket socket,String file)
    {
        this.socket = socket;
        this.file = file;
    }
    
    @Override
    public void run()
    {
        try {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            //Tell server which operation to perform
            dos.writeInt(9);
            
            //Identify user to the server
            dos.writeInt(Database.UserDetails.sess_id);
            
            //Send filename to be deleted
            dos.writeUTF(file);
            
            //Popup message
            JOptionPane.showMessageDialog(null, "File Successfully deleted");
            socket.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally
        {
            Connection.ConnectToServer.connect_to_server();
            new FileShare.FileList(Connection.ConnectToServer.socket).start();
        }
        
    }
}
