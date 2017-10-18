
package RegisterThread;
import java.net.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register extends Thread{
    
    public Socket socket = null;
    HashMap<String,String>hashmap= null;
    String user_id = null;
    String password = null;
    String name=null;
    String email=null;
    String roll_no=null;
    String dive=null;
    String gr_no=null;
    String year=null;
    String loc="";
    public Register(Socket socket)
    {
        this.socket = socket;
        System.out.println("Thread Created");
    }
    
    @Override
    public void run()
    {
        ObjectInputStream ois = null;
        DataOutputStream dos = null;
        System.out.println("Registration Thread Started");
        try
        {
           ois = new ObjectInputStream(this.socket.getInputStream());
           dos = new DataOutputStream(this.socket.getOutputStream());
            
           this.hashmap = (HashMap)ois.readObject();
           
           this.user_id = hashmap.get("user_id");
           this.name = hashmap.get("name");
           this.password = hashmap.get("password");
           this.email = hashmap.get("email");
           this.gr_no = hashmap.get("gr_no");
           this.dive = hashmap.get("div");
           this.roll_no = hashmap.get("roll_no");
           this.year = hashmap.get("year");
            
            
            System.out.println("Registering user : "+this.name+"...");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/drive","root","aj123");
            Statement smt=(Statement) conn.createStatement();
            validation v = new validation();
            boolean check=v.valid(this.user_id,this.gr_no,this.roll_no);
            if(check!=true)
            {
                HashMap<String,String> validity=new HashMap<>();
                validity.put("result","success");
                
                ObjectOutputStream map = new ObjectOutputStream(this.socket.getOutputStream());
                map.writeObject(validity);
                
                smt.executeUpdate("insert into user_info values('"+this.user_id+"','"+this.gr_no+"','"+this.roll_no+"','"+this.name+"','"+this.email+"','"+this.year+"','"+this.dive+"');");
                smt.executeUpdate("insert into user_creds values('"+this.user_id+"','"+this.password+"');");
                System.out.println("Registration Action Performed !!\n");
                String path=loc+this.user_id;
                
                //Creating folder for user
                new File(path).mkdir();

                System.out.println("Folder Created");
                System.out.println("Registration successfull !!");
                conn.close();
                this.socket.close();

                return;
            }
            else
            {
                System.err.println("Registeration unsuccessfull !!");
                return;
            }
            
        }  catch (Exception ex) {
            ex.printStackTrace();
// Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                this.socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }            
    
}    
    

class validation
{
    Register r;
    public boolean valid(String user_id,String gr_no,String roll_no)
    {
        try {
            System.out.println("Validating user....");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/drive","root","aj123");
            Statement smt=(Statement) conn.createStatement();
            ResultSet rs=smt.executeQuery("select * from user_info where user_id='"+user_id+"'OR gr_no='"+gr_no+"'OR roll_no='"+roll_no+"';");
            if(rs.next())
            {
                HashMap<String,String> validity=new HashMap<>();
                validity.put("result","failure");
                validity.put("user_id",user_id);
                validity.put("gr_no",gr_no);
                validity.put("roll_no",roll_no);
                ObjectOutputStream map=null;
                map = new ObjectOutputStream(r.socket.getOutputStream());
                map.writeObject(validity);
                System.err.println("User already registered");
            }
            else
            {
                System.out.println("User validated.");
               return(false);
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
            
}