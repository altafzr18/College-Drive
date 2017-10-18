
package FinalGUI;

import Connection.ConnectToServer;
import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
         setUndecorated(true);      //removes window border
         setVisible(true);
         setResizable(false);  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        juserid1 = new javax.swing.JTextField();
        jEmail1 = new javax.swing.JTextField();
        jName2 = new javax.swing.JTextField();
        jGR1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRoll1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPasswordFieldregister1 = new javax.swing.JPasswordField();
        jYear1 = new javax.swing.JComboBox<>();
        jClass1 = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jPasswordconfirmregister2 = new javax.swing.JPasswordField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        save1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        jjlogin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New User-Registration", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 50), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setMinimumSize(new java.awt.Dimension(2450, 1630));
        jPanel3.setPreferredSize(new java.awt.Dimension(2450, 1630));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("NAME");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setText("EMAIL ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setText("G.R Number");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        juserid1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        juserid1.setForeground(new java.awt.Color(0, 102, 255));
        juserid1.setBorder(null);
        juserid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserid1juseridActionPerformed(evt);
            }
        });
        jPanel3.add(juserid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 240, 190, -1));

        jEmail1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jEmail1.setForeground(new java.awt.Color(0, 102, 255));
        jEmail1.setBorder(null);
        jPanel3.add(jEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, -1));

        jName2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jName2.setForeground(new java.awt.Color(0, 102, 255));
        jName2.setBorder(null);
        jName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jName2FocusGained(evt);
            }
        });
        jName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jName2MouseClicked(evt);
            }
        });
        jName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jName2jName1ActionPerformed(evt);
            }
        });
        jPanel3.add(jName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 190, -1));

        jGR1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jGR1.setForeground(new java.awt.Color(0, 102, 255));
        jGR1.setBorder(null);
        jPanel3.add(jGR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 190, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setText("YEAR");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel16.setText("CLASS");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel17.setText("ROLL NO.");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jRoll1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jRoll1.setForeground(new java.awt.Color(0, 102, 255));
        jRoll1.setBorder(null);
        jPanel3.add(jRoll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setText("PASSWORD");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setText("USER I.D");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        jPasswordFieldregister1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jPasswordFieldregister1.setForeground(new java.awt.Color(0, 102, 255));
        jPasswordFieldregister1.setBorder(null);
        jPanel3.add(jPasswordFieldregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, 190, -1));

        jYear1.setBackground(new java.awt.Color(153, 153, 153));
        jYear1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jYear1.setForeground(new java.awt.Color(204, 204, 204));
        jYear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE", "SE", "TE", "BE" }));
        jYear1.setToolTipText("");
        jYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jYear1jYearActionPerformed(evt);
            }
        });
        jPanel3.add(jYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 190, -1));

        jClass1.setBackground(new java.awt.Color(153, 153, 153));
        jClass1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jClass1.setForeground(new java.awt.Color(204, 204, 204));
        jClass1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
        jClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClass1ActionPerformed(evt);
            }
        });
        jPanel3.add(jClass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator9.setFocusable(true);
        jSeparator9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator9.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 190, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator10.setFocusable(true);
        jSeparator10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator10.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 190, 10));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator16.setFocusable(true);
        jSeparator16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator16.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 190, 10));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator17.setFocusable(true);
        jSeparator17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator17.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 190, 10));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel20.setText("RETYPE PASSWORD");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, -1));

        jPasswordconfirmregister2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jPasswordconfirmregister2.setForeground(new java.awt.Color(0, 102, 255));
        jPasswordconfirmregister2.setBorder(null);
        jPanel3.add(jPasswordconfirmregister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 190, -1));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator18.setFocusable(true);
        jSeparator18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator18.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 190, 10));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Create your new user id and password");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 450, 40));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator19.setFocusable(true);
        jSeparator19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator19.setInheritsPopupMenu(true);
        jSeparator19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSeparator19MouseClicked(evt);
            }
        });
        jPanel3.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 190, 10));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("PERSONAL DETAILS");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 280, 40));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator20.setFocusable(true);
        jSeparator20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator20.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 190, 10));

        save1.setBackground(new java.awt.Color(217, 15, 15));
        save1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("REGISTER");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1saveActionPerformed(evt);
            }
        });
        jPanel3.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 180, 40));

        reset1.setBackground(new java.awt.Color(217, 15, 15));
        reset1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("RESET");
        reset1.setActionCommand("RESET2");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 180, 40));

        jjlogin1.setBackground(new java.awt.Color(217, 15, 15));
        jjlogin1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jjlogin1.setForeground(new java.awt.Color(255, 255, 255));
        jjlogin1.setText("GO BACK");
        jjlogin1.setActionCommand("RESET2");
        jjlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjlogin1jjloginActionPerformed(evt);
            }
        });
        jPanel3.add(jjlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/20 Google Material Design HD Wallpapers.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -550, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1400, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void juserid1juseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserid1juseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserid1juseridActionPerformed

    private void jYear1jYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jYear1jYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jYear1jYearActionPerformed

    private void jClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jClass1ActionPerformed

    private void jName2jName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jName2jName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jName2jName1ActionPerformed
    void reset()
    {
        jEmail1.setText(null);   //RESET
        jGR1.setText(null);
        juserid1.setText(null);
        jPasswordFieldregister1.setText(null);
        jRoll1.setText(null);
        jName2.setText(null);
    }
    
    private void save1saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1saveActionPerformed
        String name=jName2.getText();
        String email=jEmail1.getText();
        String GR=jGR1.getText();
        String roll=jRoll1.getText();
        String passwordregister=jPasswordFieldregister1.getText();
        String passwordconfirm=jPasswordconfirmregister2.getText();
        String year = (String)jYear1.getSelectedItem( );
        String jclass=(String)jClass1.getSelectedItem();
        String user=(String)juserid1.getText();
        if(name.isEmpty() || email.isEmpty() || GR.isEmpty() || roll.isEmpty() || passwordconfirm.isEmpty() || passwordregister.isEmpty() || user.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Field is Empty");
        }
        else if(user.contains("!") ||user.contains("@") ||user.contains("#")||user.contains("$")||user.contains("%")||user.contains("^") || user.contains(" "))
        {
            JOptionPane.showMessageDialog(this, "No Special characters allowed in user id except '_' ");
        }
        else if(user.length() < 5 || passwordconfirm.length()<6)
        {
            JOptionPane.showMessageDialog(this, "User id should contain atleast 5 character\nPassword should contain atleast 6 characters");
        }
        else if(!passwordconfirm.equals(passwordregister))
        {
            JOptionPane.showMessageDialog(this, "Passwords do not match");
        }
        else
        {
            HashMap<String,String> map = new HashMap<>();
            map.put("user_id", user);
            map.put("password",passwordconfirm);
            map.put("name", name);
            map.put("email", email);
            map.put("gr_no", GR);
            map.put("roll_no", roll);
            map.put("div", jclass);
            map.put("year", year);

            try {
                    ConnectToServer.connect_to_server();
                    boolean check = Login_Register.Register.register(map);
                    if(!check)
                    {
                         JOptionPane.showMessageDialog(this, "Registration Unsuccesfull.....Details Invalid");
                    }
                    else
                    {
                        reset();
                        new File("Drive_Downloads_"+user).mkdir();
                        JOptionPane.showMessageDialog(this, "Registration Successfull... Folder for Download created....\nLogin to continue");
                        FinalGUI.login am=new FinalGUI.login();
                        am.setVisible(true);
                        dispose();
                    }
                } 
                catch (Exception ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_save1saveActionPerformed

    private void reset1resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1resetActionPerformed
        jEmail1.setText(null);   //RESET
        jGR1.setText(null);
        juserid1.setText(null);
        jPasswordFieldregister1.setText(null);
        juserid1.setText(null);
        jRoll1.setText(null);
        jName2.setText(null);
        //RESET
    }//GEN-LAST:event_reset1resetActionPerformed

    private void jjlogin1jjloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjlogin1jjloginActionPerformed
         login am=new login();
        am.setVisible(true);
        am.setResizable(false);
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jjlogin1jjloginActionPerformed

    private void jSeparator19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator19MouseClicked
         // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator19MouseClicked

    private void jName2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jName2FocusGained
        setBackground(Color.yellow);   
        setForeground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_jName2FocusGained

    private void jName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jName2MouseClicked
         setBackground(Color.yellow);
                 setForeground(Color.yellow);  // TODO add your handling code here:
    }//GEN-LAST:event_jName2MouseClicked

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jClass1;
    private javax.swing.JTextField jEmail1;
    private javax.swing.JTextField jGR1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JTextField jName2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldregister1;
    private javax.swing.JPasswordField jPasswordconfirmregister2;
    private javax.swing.JTextField jRoll1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jYear1;
    private javax.swing.JButton jjlogin1;
    private javax.swing.JTextField juserid1;
    private javax.swing.JButton reset1;
    private javax.swing.JButton save1;
    // End of variables declaration//GEN-END:variables
}
