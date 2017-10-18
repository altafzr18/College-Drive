package FinalGUI;
//import first_login.Signup;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import FinalGUI.Register;
import FinalGUI.Homepage;
import java.awt.Color;

import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
public class login extends javax.swing.JFrame {

 
    public login() {
        initComponents();
       
 setUndecorated(true);
setVisible(true);
  
           setResizable(false); 
    }

    /**
      This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jEXIT = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FILE SHARING SYSTEMS");
        setBackground(new java.awt.Color(255, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setMinimumSize(getMaximumSize());
        jPanel5.setPreferredSize(new java.awt.Dimension(1650, 1080));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setText("Sign In ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 60));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("USER NAME");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 390, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 390, 30));

        jUsername.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jUsername.setForeground(new java.awt.Color(36, 47, 65));
        jUsername.setBorder(null);
        jUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jUsername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jUsername.setSelectionColor(new java.awt.Color(255, 255, 255));
        jUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameActionPerformed(evt);
            }
        });
        jUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUsernameKeyPressed(evt);
            }
        });
        jPanel5.add(jUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 40));

        jPassword.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPassword.setForeground(new java.awt.Color(36, 47, 65));
        jPassword.setBorder(null);
        jPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel5.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 390, 40));

        jLogin.setBackground(new java.awt.Color(0, 51, 153));
        jLogin.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLogin.setText("SIGN IN");
        jLogin.setBorderPainted(false);
        jLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLoginMouseClicked(evt);
            }
        });
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jPanel5.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 350, 50));

        jReset.setBackground(new java.awt.Color(97, 212, 195));
        jReset.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jReset.setForeground(new java.awt.Color(36, 47, 65));
        jReset.setText("RESET");
        jReset.setBorderPainted(false);
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jPanel5.add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 460, 150, 50));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("PASSWORD");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 40));

        jButton1.setText("jButton1");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, -1, -1));

        jButton2.setText("jButton1");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 670, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 460, 530));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VIIT - DRIVE");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Where your personal Data is Safe & Secure");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 510, 40));

        jRegister.setBackground(new java.awt.Color(0, 51, 153));
        jRegister.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jRegister.setForeground(new java.awt.Color(255, 255, 255));
        jRegister.setText("SIGN UP");
        jRegister.setBorderPainted(false);
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(jRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 230, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Sudershan");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 700, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Chinmay");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ajinkya");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("ALTAF");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 2480, -1));

        jEXIT.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jEXIT.setForeground(new java.awt.Color(255, 102, 0));
        jEXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEXIT.setText("X");
        jEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEXITMouseClicked(evt);
            }
        });
        jPanel3.add(jEXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 40, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/20 Google Material Design HD Wallpapers.jpg"))); // NOI18N
        jLabel11.setText("aaa");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1170, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1372, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jPassword.setText(null);   //RESET
        jUsername.setText(null);
    }//GEN-LAST:event_jResetActionPerformed
    
    boolean validate(String user_id,String pass)
    {
        if(user_id.isEmpty() || pass.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Field is empty");
            return false;
        }
        if(user_id.length() < 5)
        {
            JOptionPane.showMessageDialog(this, "User ID should contain atleast 5 characters");
            return false;
        }
        if(pass.length() < 6)
        {
            JOptionPane.showMessageDialog(this, "Password should contain atleast 6 characters");
            return false;
        }
        return true;
    }
    
    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
    
        String password=jPassword.getText();
        String username=jUsername.getText();
        if(validate(username, password))
        {
            Connection.ConnectToServer.connect_to_server();
             try {
                 DataInputStream dis = new DataInputStream(Connection.ConnectToServer.socket.getInputStream());
                 boolean check = Login_Register.LoginPage.login(username, password);
                 if(check)
                 {
                     //Connection.ConnectToServer.socket.close();
                     FinalGUI.Homepage hh=new FinalGUI.Homepage();
     //                hh.updateTable();
                     hh.setVisible(true);
                     hh.setResizable(false);
                     dispose();
                     Connection.ConnectToServer.connect_to_server();
                     new FileShare.FileList(Connection.ConnectToServer.socket).start();
                     //hh.updateTable();
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Username does not Exist !","Login Error",JOptionPane.ERROR_MESSAGE);
                     jPassword.setText(null);
                     jUsername.setText(null);
                 }

             } catch (IOException ex) {
                 Logger.getLogger(FinalGUI.login.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
   
    }//GEN-LAST:event_jLoginActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        Register st=new Register();
             
              
             st.setVisible(true);
               st.setResizable(false);
      //  login ll=new login();
       // ll.pack();
        dispose();
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
       
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameActionPerformed
        String id=jUsername.getText();
    }//GEN-LAST:event_jUsernameActionPerformed

    private void jUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameKeyPressed

    private void jLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseClicked
          
    }//GEN-LAST:event_jLoginMouseClicked

    private void jEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jEXITMouseClicked


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login st=new login();
             
             st.setVisible(true);
               st.setResizable(false);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jEXIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jRegister;
    private javax.swing.JButton jReset;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}
