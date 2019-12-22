/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noor
 */
public class AdminProfileView extends javax.swing.JFrame {
    
    
    String username;
    String firstname;
    String lastname;
    String usertype;
    String cardholder_t;
    int userid;

    /**
     * Creates new form AdminProfileView
     */
    public AdminProfileView(int u_id_temp) {
        initComponents();
        userid = u_id_temp;
        
        try { 
           
           String url="jdbc:sqlserver://localhost:1433;databaseName=easypower;user=shitul;password=tnb";
           
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection con=DriverManager.getConnection(url);
           String sql= "SELECT * FROM users WHERE u_id="+userid; 
            PreparedStatement pst=con.prepareStatement(sql);
            //pst.executeUpdate();
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
            firstname = rs.getString("f_name");
            lastname = rs.getString("l_name");
            usertype = rs.getString("u_type");
            username = rs.getString("u_name");
            cardholder_t = rs.getString("cardholder");
            
           
            
            String name_temp = firstname+" "+lastname;
            name_lebel.setText(name_temp);
            u_type_lebel.setText(usertype);
            name_of_user.setText(name_temp);
            User_name_of_user.setText(username);
            user_type_of_user.setText(usertype);
        
            f_name.setText(firstname);
            l_name.setText(lastname);
            u_name.setText(username);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private AdminProfileView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name_lebel = new javax.swing.JLabel();
        u_type_lebel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        send_bill = new javax.swing.JButton();
        send_notification1 = new javax.swing.JButton();
        send_notification2 = new javax.swing.JButton();
        send_notification = new javax.swing.JButton();
        send_notification3 = new javax.swing.JButton();
        send_notification4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name_of_user = new javax.swing.JLabel();
        User_name_of_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user_type_of_user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f_name = new javax.swing.JLabel();
        l_name = new javax.swing.JLabel();
        u_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 175, 204));

        name_lebel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name_lebel.setForeground(new java.awt.Color(255, 255, 255));
        name_lebel.setText("f_name");

        u_type_lebel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        u_type_lebel.setForeground(new java.awt.Color(255, 255, 255));
        u_type_lebel.setText("u_type");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("LOGOUT");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        send_bill.setBackground(new java.awt.Color(67, 162, 196));
        send_bill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_bill.setForeground(new java.awt.Color(255, 255, 255));
        send_bill.setText("Send Bill");
        send_bill.setAlignmentY(0.0F);
        send_bill.setBorder(null);
        send_bill.setBorderPainted(false);
        send_bill.setContentAreaFilled(false);
        send_bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_bill.setFocusable(false);
        send_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_billActionPerformed(evt);
            }
        });

        send_notification1.setBackground(new java.awt.Color(67, 162, 196));
        send_notification1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_notification1.setForeground(new java.awt.Color(255, 255, 255));
        send_notification1.setText("Edit Profile");
        send_notification1.setAlignmentY(0.0F);
        send_notification1.setBorder(null);
        send_notification1.setBorderPainted(false);
        send_notification1.setContentAreaFilled(false);
        send_notification1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_notification1.setFocusable(false);
        send_notification1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_notification1ActionPerformed(evt);
            }
        });

        send_notification2.setBackground(new java.awt.Color(67, 162, 196));
        send_notification2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_notification2.setForeground(new java.awt.Color(255, 255, 255));
        send_notification2.setText("View Profile");
        send_notification2.setAlignmentY(0.0F);
        send_notification2.setBorder(null);
        send_notification2.setBorderPainted(false);
        send_notification2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_notification2.setFocusable(false);
        send_notification2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_notification2ActionPerformed(evt);
            }
        });

        send_notification.setBackground(new java.awt.Color(67, 162, 196));
        send_notification.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_notification.setForeground(new java.awt.Color(255, 255, 255));
        send_notification.setText("Send Notification");
        send_notification.setAlignmentY(0.0F);
        send_notification.setBorder(null);
        send_notification.setBorderPainted(false);
        send_notification.setContentAreaFilled(false);
        send_notification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_notification.setFocusable(false);
        send_notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_notificationActionPerformed(evt);
            }
        });

        send_notification3.setBackground(new java.awt.Color(67, 162, 196));
        send_notification3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_notification3.setForeground(new java.awt.Color(255, 255, 255));
        send_notification3.setText("Salary");
        send_notification3.setAlignmentY(0.0F);
        send_notification3.setBorder(null);
        send_notification3.setBorderPainted(false);
        send_notification3.setContentAreaFilled(false);
        send_notification3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_notification3.setFocusable(false);
        send_notification3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_notification3ActionPerformed(evt);
            }
        });

        send_notification4.setBackground(new java.awt.Color(67, 162, 196));
        send_notification4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_notification4.setForeground(new java.awt.Color(255, 255, 255));
        send_notification4.setText("Help");
        send_notification4.setAlignmentY(0.0F);
        send_notification4.setBorder(null);
        send_notification4.setBorderPainted(false);
        send_notification4.setContentAreaFilled(false);
        send_notification4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_notification4.setFocusable(false);
        send_notification4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_notification4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(name_lebel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(u_type_lebel)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(send_notification4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(send_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send_notification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send_notification1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send_notification2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send_notification3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(name_lebel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(u_type_lebel)
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(send_notification4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(send_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(send_notification1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(send_notification2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(send_notification, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(send_notification3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Card");

        name_of_user.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        name_of_user.setText("Name");

        User_name_of_user.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        User_name_of_user.setText("u_name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("@");

        user_type_of_user.setText("user_type");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("First Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Last Name :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("User Name :");

        f_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_name.setText("jLabel3");

        l_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_name.setText("jLabel3");

        u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        u_name.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_of_user)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(User_name_of_user))
                            .addComponent(user_type_of_user))
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u_name))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_name))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(27, 27, 27)
                            .addComponent(f_name))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(name_of_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(User_name_of_user))
                .addGap(4, 4, 4)
                .addComponent(user_type_of_user)
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(f_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(u_name))
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void send_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_billActionPerformed
        // TODO add your handling code here:
        new AdminHome(userid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_send_billActionPerformed

    private void send_notification1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_notification1ActionPerformed
        // TODO add your handling code here:
        new AdminProfile(userid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_send_notification1ActionPerformed

    private void send_notification2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_notification2ActionPerformed
        // TODO add your handling code here:
        new AdminProfileView(userid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_send_notification2ActionPerformed

    private void send_notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_notificationActionPerformed
        // TODO add your handling code here:
        new SendNotification(userid).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_send_notificationActionPerformed

    private void send_notification3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_notification3ActionPerformed
        // TODO add your handling code here:
        new Salary(userid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_send_notification3ActionPerformed

    private void send_notification4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_notification4ActionPerformed
        // TODO add your handling code here:
        new AdminHelp(userid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_send_notification4ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel User_name_of_user;
    private javax.swing.JLabel f_name;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel name_lebel;
    private javax.swing.JLabel name_of_user;
    private javax.swing.JButton send_bill;
    private javax.swing.JButton send_notification;
    private javax.swing.JButton send_notification1;
    private javax.swing.JButton send_notification2;
    private javax.swing.JButton send_notification3;
    private javax.swing.JButton send_notification4;
    private javax.swing.JLabel u_name;
    private javax.swing.JLabel u_type_lebel;
    private javax.swing.JLabel user_type_of_user;
    // End of variables declaration//GEN-END:variables
}
