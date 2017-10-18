package Login_Register;

import Connection.ConnectToServer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;                                                                                        

public class Register {
    
    public static String user_id;
    public static String gr_no;
    public static String roll_no;
    
    
    public static boolean register(HashMap map)
    {
        HashMap<String,String> details_map = map;
        
        try {
            System.out.println("Trying to register");
            DataOutputStream dos = new DataOutputStream(ConnectToServer.socket.getOutputStream());
            dos.writeInt(2);
            
            ObjectOutputStream mapOutputStream = new ObjectOutputStream(ConnectToServer.socket.getOutputStream());
            mapOutputStream.writeObject(details_map);
            
            DataInputStream dis = new DataInputStream(ConnectToServer.socket.getInputStream());
            ObjectInputStream ois = new ObjectInputStream(ConnectToServer.socket.getInputStream());
            HashMap<String,String> temp = (HashMap)ois.readObject();
            
            
            
            if(temp.get("result").toString().equals("failure"))
            {
                user_id = temp.get("user_id");
                gr_no = temp.get("gr_no");
                roll_no = temp.get("roll_no");
                return false;
            }
            else
            {
                return true;
            }
//            boolean check  = dis.readBoolean();
      } catch (Exception ex) {
            
            System.out.println(ex);
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
