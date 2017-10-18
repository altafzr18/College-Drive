    package Login_Register;

import Connection.ConnectToServer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPage {
    
    public static int flag = 0;
    
    public static boolean login(String user_id,String password)
    {
        HashMap<String,String> login_map = new HashMap<>();
        login_map.put("user_id", user_id);
        login_map.put("password", password);
        
        try {
            DataOutputStream dos = new DataOutputStream(ConnectToServer.socket.getOutputStream());
            dos.writeInt(1);
            
            ObjectOutputStream mapOutputStream = new ObjectOutputStream(ConnectToServer.socket.getOutputStream());
            mapOutputStream.writeObject(login_map);
            
            DataInputStream dis = new DataInputStream(ConnectToServer.socket.getInputStream());
            boolean check  = dis.readBoolean();
            if(check == true)
            {
                Database.UserDetails.sess_id = dis.readInt();
                Database.UserDetails.user_id = user_id;
            }   
            return check;
        } catch (IOException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
}
