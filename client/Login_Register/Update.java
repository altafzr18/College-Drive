
package Login_Register;

import Connection.ConnectToServer;
import static Login_Register.Register.gr_no;
import static Login_Register.Register.roll_no;
import static Login_Register.Register.user_id;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Update extends Thread{
    
    Socket socket = null;
    HashMap<String,String> map;
    
    public Update(Socket socket,HashMap map)
    {
        this.socket = socket;
        this.map = map;
    }
    
    @Override
    public void run()
    {
        try {
            System.out.println("Trying to update User Details");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //Tell the server to perform update operation
            dos.writeInt(6);
            
            //Identify yourself to the server
            dos.writeInt(Database.UserDetails.sess_id);
            
            ObjectOutputStream mapOutputStream = new ObjectOutputStream(socket.getOutputStream());
            mapOutputStream.writeObject(map);
            
            JOptionPane.showMessageDialog(null, "Details successfully Updated");

      } catch (Exception ex) {
            
            System.out.println(ex);
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
