package FileShare;

import CompressFile.Compress;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.*;
import FinalGUI.Homepage;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.net.Socket;
import javax.swing.JOptionPane;
public class Upload extends Thread{
    
    String FILE_TO_SEND = null;
    Socket socket  = null;
    
    public Upload(Socket socket,String file)
    {
        this.socket = socket;
        this.FILE_TO_SEND = file;
    }
    
    @Override
    public void run()
    {
        try {
//            Compress.compressFile("G://ra.jpg");

            //Establish connection to server
          //  Connection.ConnectToServer.connect_to_server();
            System.out.println("Uploading File...");
            //Send action id to server #### To send file : 4
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeInt(4);
            dos.writeInt(Database.UserDetails.sess_id);
            
            File myfile = new File(FILE_TO_SEND);
            dos.writeUTF(myfile.getName());
            
            byte[] bytearray = new byte[(int)myfile.length()];
            
            FileInputStream fis = new FileInputStream(myfile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.read(bytearray,0,bytearray.length);
            
            Homepage.progress_bar_up.setVisible(true);
            Homepage.progress_bar_up.setIndeterminate(true);
            //OutputStream os = socket.getOutputStream();
            dos.write(bytearray,0,bytearray.length);
            dos.flush();
            
            Homepage.progress_bar_up.setVisible(false);
            System.out.println("File successfully uploaded...");
            socket.close();
            
            JOptionPane.showMessageDialog(null,"   FILE UPLOADED ON SERVER   ");
            Connection.ConnectToServer.connect_to_server();
            new FileShare.FileList(Connection.ConnectToServer.socket).start();
            
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid File path");
        }
        catch (IOException ex) {
            System.out.println(ex);
            
        }
    }


}
