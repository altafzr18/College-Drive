package Main;

import FinalGUI.login;
import java.awt.Frame;
import java.awt.Toolkit;


public class First_login 
{
   public static void main(String[] args) {
       try
       {
            Runnable runnable = () -> 
              {
                  login ss=new login();
                  ss.setVisible(true);
                  ss.setUndecorated(true);       //removes window border
                  ss.setResizable(false);  
              };
            
             runnable.run();
       }
       catch(Exception e)
       {
           
       }
    }   
}
