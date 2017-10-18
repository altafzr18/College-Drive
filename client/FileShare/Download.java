package FileShare;

import Connection.ConnectToServer;
import Database.UserDetails;
import FinalGUI.Homepage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Download extends Thread{
    
    String FILE_TO_DWNLD = null;
    Socket socket = null;
    public Download(Socket socket,String file)
    {
        this.socket = socket;
        this.FILE_TO_DWNLD = file;
    }
    
    
    @Override
    public void run()
    {
        int bytesRead = 0;
        InputStream in = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        
        try {
            //Initialize the i/o streams
            in = socket.getInputStream();
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            
            //Tell the server whcih action is needed to be performed
            dos.writeInt(5);
            
            //Identify yourself to the server
            dos.writeInt(Database.UserDetails.sess_id);
            
            //Send the name of the file to the server to download
            dos.writeUTF(FILE_TO_DWNLD);
            
            System.out.println("Downloading File....");
            //File file = new File(FILE_TO_DWNLD);
            OutputStream os = new FileOutputStream("Drive_Downloads_"+UserDetails.user_id+"//"+FILE_TO_DWNLD);
            byte[] buffer = new byte[1024];
            Homepage.progress_bar_dwn.setVisible(true);
            Homepage.progress_bar_dwn.setIndeterminate(true);
            while((bytesRead = dis.read(buffer)) != -1)
            {
                os.write(buffer,0,bytesRead);
            }
            Homepage.progress_bar_dwn.setVisible(false);
            System.out.println("File Successfully downloaded...");
            int dialogResult = JOptionPane.showConfirmDialog (null, "File Successfully Downloaded... \nYes to view file");
            if(dialogResult == JOptionPane.YES_OPTION){
              // View file code
              Runtime.getRuntime().exec("explorer.exe /select,"+System.getProperty("user.dir")+"\\Drive_Downloads_"+Database.UserDetails.user_id+"\\"+FILE_TO_DWNLD);
            }
            
            os.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ConnectToServer.socket.close();
                in.close();
                dis.close();
                dos.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void recieve()
    {
 
        
        
    }
    
}
