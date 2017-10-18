package FinalGUI;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import FinalGUI.FileChooser1;
import Login_Register.GetDetails;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.util.List;
//import javax.swing.Homepage.file_table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();

          setUndecorated(true);
            setVisible(true);
           setResizable(false); 
           progress_bar_up.setVisible(false);
           progress_bar_dwn.setVisible(false);
           
                 //updateTable(); 
    }
    
  /*  public void updateTable()
    {
        
        List<String> list = FileShare.FileList.fileList();

    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextUpload = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        file_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDownload = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jUpload = new javax.swing.JButton();
        jUpload1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jEXIT = new javax.swing.JLabel();
        jjlogin1 = new javax.swing.JButton();
        progress_bar_up = new javax.swing.JProgressBar();
        progress_bar_dwn = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOMEPAGE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Drive", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 54), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(2450, 1590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextUpload.setEditable(false);
        jTextUpload.setBackground(new java.awt.Color(255, 255, 255));
        jTextUpload.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextUpload.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILE PATH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 12))); // NOI18N
        jTextUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUploadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 610, -1));

        file_table.setBackground(new java.awt.Color(204, 255, 255));
        file_table.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        file_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "            FILE NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        file_table.setToolTipText("");
        file_table.setColumnSelectionAllowed(true);
        file_table.setDragEnabled(true);
        file_table.setGridColor(new java.awt.Color(0, 0, 0));
        file_table.setRowHeight(20);
        jScrollPane1.setViewportView(file_table);
        file_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 510, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/20 Google Material Design HD Wallpapers.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 750));

        jDownload.setBackground(new java.awt.Color(204, 204, 204));
        jDownload.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jDownload.setText("DOWNLOAD");
        jDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDownloadActionPerformed(evt);
            }
        });
        jPanel1.add(jDownload, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, 60));

        jDelete.setBackground(new java.awt.Color(204, 204, 204));
        jDelete.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jDelete.setText("DELETE");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 240, 60));

        jUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jUpdate.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jUpdate.setText("UPDATE");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, 60));

        jUpload.setBackground(new java.awt.Color(204, 204, 204));
        jUpload.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jUpload.setText("Attach New");
        jUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUploadActionPerformed(evt);
            }
        });
        jPanel1.add(jUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 250, 47));

        jUpload1.setBackground(new java.awt.Color(204, 204, 204));
        jUpload1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jUpload1.setText("UPLOAD");
        jUpload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpload1ActionPerformed(evt);
            }
        });
        jPanel1.add(jUpload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 240, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/icons8-Download-70.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 70, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/icons8-Upload-70.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 80, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/icons8-Update Filled-70.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 70, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalGUI/icons8-Delete-70.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 80, 80));

        jEXIT.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jEXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEXIT.setText("X");
        jEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEXITMouseClicked(evt);
            }
        });
        jPanel1.add(jEXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 40, -1));

        jjlogin1.setBackground(new java.awt.Color(217, 15, 15));
        jjlogin1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jjlogin1.setForeground(new java.awt.Color(255, 255, 255));
        jjlogin1.setText("LOG-OUT");
        jjlogin1.setActionCommand("RESET2");
        jjlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjlogin1jjloginActionPerformed(evt);
            }
        });
        jPanel1.add(jjlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 180, 40));

        progress_bar_up.setOpaque(true);
        jPanel1.add(progress_bar_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 170, 20));

        progress_bar_dwn.setOpaque(true);
        jPanel1.add(progress_bar_dwn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1372, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUploadActionPerformed

       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       String filename=f.getAbsolutePath();
        jTextUpload.setText(filename);
        
    }//GEN-LAST:event_jUploadActionPerformed

    private void jTextUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUploadActionPerformed
        String id=jTextUpload.getText();
    }//GEN-LAST:event_jTextUploadActionPerformed

    private void jDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDownloadActionPerformed
       
        try
        {
            if (Homepage.file_table.getCellSelectionEnabled()) 
           {
                //Homepage.file_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                int rowIndex =file_table.getSelectedRow();
                int column = 0;
                //int row = table.getSelectedRow();
                String value = file_table.getModel().getValueAt(rowIndex, column).toString();

                //Code to download file
                Connection.ConnectToServer.connect_to_server();
                JOptionPane.showMessageDialog(this, "File will be downloaded in the background...");
                new FileShare.Download(Connection.ConnectToServer.socket, value).start();
            }
            else
           {
                JOptionPane.showMessageDialog(this,"   Please select a file from the table to download     ".toUpperCase());           
           }
        }
        catch(Exception e)
       {
           if(file_table.getRowCount() == 0)
           {
               JOptionPane.showMessageDialog(this, "No files for download");
           }
           else
                JOptionPane.showMessageDialog(this,"   Please select a file from the table to download     ".toUpperCase());           
        }    
    }//GEN-LAST:event_jDownloadActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed

        Update_details sp=new Update_details();
        Connection.ConnectToServer.connect_to_server();
        new GetDetails(Connection.ConnectToServer.socket).start();
        sp.setVisible(true);
        sp.setResizable(false);

    }//GEN-LAST:event_jUpdateActionPerformed

/*
    public ArrayList<User> userslist();
    {
        
        Connection connection   =getConnection
    }*/
    private void jUpload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpload1ActionPerformed
        
        String FILE_TO_SEND = jTextUpload.getText();
        if(FILE_TO_SEND.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please select a file to upload..");
        }
        else
        {
            Connection.ConnectToServer.connect_to_server();
            jTextUpload.setText("");
            new FileShare.Upload(Connection.ConnectToServer.socket, FILE_TO_SEND).start();
        }

    }//GEN-LAST:event_jUpload1ActionPerformed

    private void jEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jEXITMouseClicked

    private void jjlogin1jjloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjlogin1jjloginActionPerformed

        Connection.ConnectToServer.connect_to_server();
        Login_Register.Logout.logout();
        login aa=new login();
        aa.setVisible(true);
        aa.setResizable(false);
        dispose();
        JOptionPane.showMessageDialog(this,"SUCCESSFULLY LOGGED OUT");
    }//GEN-LAST:event_jjlogin1jjloginActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
    
        try
        {
            if (Homepage.file_table.getCellSelectionEnabled()) 
            {
                //Homepage.file_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                int rowIndex =file_table.getSelectedRow();
                int column = 0;
                //int row = table.getSelectedRow();
                String value = file_table.getModel().getValueAt(rowIndex, column).toString();

                //Code to download file
                Connection.ConnectToServer.connect_to_server();
                new FileShare.Delete(Connection.ConnectToServer.socket, value).start();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"   Please select a file to delete form table     ".toUpperCase());           
            }
        }
        catch(Exception e)
        {
            if(file_table.getRowCount() == 0)
                JOptionPane.showMessageDialog(this, "No files to delete");
            else
                JOptionPane.showMessageDialog(this,"   Please select a file to delete form table     ".toUpperCase());           
        }
    }//GEN-LAST:event_jDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Homepage st=new Homepage();
             
            
               
            }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable file_table;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jDownload;
    private javax.swing.JLabel jEXIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextUpload;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jUpload;
    private javax.swing.JButton jUpload1;
    private javax.swing.JButton jjlogin1;
    public static javax.swing.JProgressBar progress_bar_dwn;
    public static javax.swing.JProgressBar progress_bar_up;
    // End of variables declaration//GEN-END:variables
}
