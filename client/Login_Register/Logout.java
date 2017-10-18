package Login_Register;
import Connection.ConnectToServer;
import Database.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Logout {
    
    public static void logout()
    {
        try {
            System.out.println("Loggin out ");
            DataOutputStream dos = new DataOutputStream(ConnectToServer.socket.getOutputStream());
            dos.writeInt(7);
            
            dos.writeInt(UserDetails.sess_id);
            
            } catch (Exception ex) {
                System.err.println(ex);
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
