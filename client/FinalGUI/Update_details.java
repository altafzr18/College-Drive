/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalGUI;

import Login_Register.Update;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class Update_details extends javax.swing.JFrame {


    public Update_details() {
        initComponents();
        setUndecorated(true);      //removes window border
         setVisible(true);
         setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        update_name = new javax.swing.JTextField();
        update_gr = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        update_roll = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPasswordFieldregister1 = new javax.swing.JPasswordField();
        update_year = new javax.swing.JComboBox<>();
        update_class = new javax.swing.JComboBox<>();
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
        jupdate1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reset2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update-Details", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 50), new java.awt.Color(102, 102, 102))); // NOI18N
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

        update_email.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        update_email.setForeground(new java.awt.Color(0, 102, 255));
        update_email.setBorder(null);
        jPanel3.add(update_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, -1));

        update_name.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        update_name.setForeground(new java.awt.Color(0, 102, 255));
        update_name.setBorder(null);
        update_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                update_nameFocusGained(evt);
            }
        });
        update_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_nameMouseClicked(evt);
            }
        });
        update_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_namejName1ActionPerformed(evt);
            }
        });
        jPanel3.add(update_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 190, -1));

        update_gr.setEditable(false);
        update_gr.setBackground(new java.awt.Color(255, 255, 255));
        update_gr.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        update_gr.setForeground(new java.awt.Color(0, 102, 255));
        update_gr.setBorder(null);
        update_gr.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel3.add(update_gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 190, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setText("YEAR");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel16.setText("CLASS");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel17.setText("ROLL NO.");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        update_roll.setEditable(false);
        update_roll.setBackground(new java.awt.Color(255, 255, 255));
        update_roll.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        update_roll.setForeground(new java.awt.Color(0, 102, 255));
        update_roll.setBorder(null);
        update_roll.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel3.add(update_roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setText("PASSWORD");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        jPasswordFieldregister1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jPasswordFieldregister1.setForeground(new java.awt.Color(0, 102, 255));
        jPasswordFieldregister1.setBorder(null);
        jPanel3.add(jPasswordFieldregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 190, -1));

        update_year.setBackground(new java.awt.Color(102, 102, 102));
        update_year.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        update_year.setForeground(new java.awt.Color(255, 255, 255));
        update_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE", "SE", "TE", "BE" }));
        update_year.setToolTipText("");
        update_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_yearjYearActionPerformed(evt);
            }
        });
        jPanel3.add(update_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 190, -1));

        update_class.setBackground(new java.awt.Color(153, 153, 153));
        update_class.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        update_class.setForeground(new java.awt.Color(255, 255, 255));
        update_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
        update_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_classActionPerformed(evt);
            }
        });
        jPanel3.add(update_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator10.setFocusable(true);
        jSeparator10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator10.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 190, 10));

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
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));

        jPasswordconfirmregister2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jPasswordconfirmregister2.setForeground(new java.awt.Color(0, 102, 255));
        jPasswordconfirmregister2.setBorder(null);
        jPanel3.add(jPasswordconfirmregister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 190, -1));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator18.setFocusable(true);
        jSeparator18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator18.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, 190, 10));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("UPDATE PASSWORD");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 410, 40));

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
        jLabel22.setText("UPDATE PERSONAL DETAILS");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 350, 40));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator20.setFocusable(true);
        jSeparator20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jSeparator20.setInheritsPopupMenu(true);
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 190, 10));

        jupdate1.setBackground(new java.awt.Color(217, 15, 15));
        jupdate1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jupdate1.setForeground(new java.awt.Color(255, 255, 255));
        jupdate1.setText("UPDATE");
        jupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdate1saveActionPerformed(evt);
            }
        });
        jPanel3.add(jupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 210, 40));

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
        jPanel3.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/20 Google Material Design HD Wallpapers.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -550, 120, -1));

        reset2.setBackground(new java.awt.Color(217, 15, 15));
        reset2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        reset2.setForeground(new java.awt.Color(255, 255, 255));
        reset2.setText("Go BACK");
        reset2.setActionCommand("RESET2");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1608, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1401, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jupdate1saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdate1saveActionPerformed
        String name=update_name.getText();
        String email=update_email.getText();
        String GR=update_gr.getText();
        String roll=update_roll.getText();
        String passwordregister=jPasswordFieldregister1.getText();
        String passwordconfirm=jPasswordconfirmregister2.getText();
        String year = (String)update_year.getSelectedItem( );
        String jclass=(String)update_class.getSelectedItem();
       
        if(name.isEmpty() || email.isEmpty() || GR.isEmpty() || roll.isEmpty() || passwordconfirm.isEmpty() || passwordregister.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Field is Empty");
        }
        else if(passwordconfirm.length()<6)
        {
            JOptionPane.showMessageDialog(this, "Password should contain atleast 6 characters");
        }
        else if(!passwordconfirm.equals(passwordregister))
        {
            JOptionPane.showMessageDialog(this, "Passwords do not match");
        }
        else
        {

            HashMap<String,String> map = new HashMap<>();
           // map.put("user_id", user);
            map.put("password",passwordconfirm);
            map.put("name", name);
            map.put("email", email);
            map.put("gr_no", GR);
            map.put("roll_no", roll);
            map.put("div", jclass);
            map.put("year", year);

            Connection.ConnectToServer.connect_to_server();
            new Update(Connection.ConnectToServer.socket,map).start();

            //JOptionPane.showMessageDialog(this,"DATA SUCCESSFULLY UPDATED...");

            dispose();        // TODO add your handling code here:
        }
    }//GEN-LAST:event_jupdate1saveActionPerformed

    private void jSeparator19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator19MouseClicked

    private void update_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_classActionPerformed

    private void update_yearjYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_yearjYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_yearjYearActionPerformed

    private void update_namejName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_namejName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_namejName1ActionPerformed

    private void update_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_nameMouseClicked
  
    }//GEN-LAST:event_update_nameMouseClicked

    private void update_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_nameFocusGained
      
    }//GEN-LAST:event_update_nameFocusGained

    private void reset1resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1resetActionPerformed
        update_email.setText(null);   //RESET
        update_gr.setText(null);

        jPasswordFieldregister1.setText(null);

        update_roll.setText(null);
        update_name.setText(null);
        //RESET
    }//GEN-LAST:event_reset1resetActionPerformed

    private void reset2resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2resetActionPerformed
       dispose();
        //RESET
    }//GEN-LAST:event_reset2resetActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Update_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Update_details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldregister1;
    private javax.swing.JPasswordField jPasswordconfirmregister2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jupdate1;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    public static javax.swing.JComboBox<String> update_class;
    public static javax.swing.JTextField update_email;
    public static javax.swing.JTextField update_gr;
    public static javax.swing.JTextField update_name;
    public static javax.swing.JTextField update_roll;
    public static javax.swing.JComboBox<String> update_year;
    // End of variables declaration//GEN-END:variables
}
