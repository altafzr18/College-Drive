package Login_Register;

import Connection.ConnectToServer;
import FinalGUI.Update_details;
import static Login_Register.Register.gr_no;
import static Login_Register.Register.roll_no;
import static Login_Register.Register.user_id;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDetails extends Thread{

    Socket socket = null;
    HashMap<String,String> map;
    public GetDetails(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
          try {
              
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeInt(10);
            
            //Identify yourself to the server
            dos.writeInt(Database.UserDetails.sess_id);
            
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            map = (HashMap)ois.readObject();
            
              Update_details.update_name.setText(map.get("name"));
              Update_details.update_roll.setText(map.get("roll_no"));
              Update_details.update_gr.setText(map.get("gr_no"));
              Update_details.update_email.setText(map.get("email"));
              List<String> year_list = new ArrayList<>();
              year_list.add("FE");
              year_list.add("SE");
              year_list.add("TE");
              year_list.add("BE");
              
              List<String> class_list = new ArrayList<>();
              class_list.add("A");
              class_list.add("B");
              class_list.add("C");
              class_list.add("D");
              class_list.add("E");
              class_list.add("F");
              class_list.add("G");
              class_list.add("H");
              class_list.add("I");
              class_list.add("J");
              
            Update_details.update_class.setSelectedItem(class_list.indexOf(map.get("div")));
            Update_details.update_year.setSelectedIndex(year_list.indexOf(map.get("year")));

      } catch (Exception ex) {
            
            System.out.println(ex);
        }
    }
}
