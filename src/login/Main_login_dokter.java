/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import connection.Connect_sql;
import static dashboard_dokter.Header_dokter.admin_dokter;
import dashboard_dokter.Main_dokter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Main_login_dokter extends javax.swing.JFrame {

    Connection con=Connect_sql.getConnection();
    ResultSet rs = null;
    PreparedStatement ps = null;
    public Main_login_dokter() {
        initComponents();
        txt_strdokterlogin.setText("");
        password.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        bt_signup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bt_exit = new javax.swing.JLabel();
        ilustrasi = new javax.swing.JLabel();
        pnCustom1 = new custom_swing.PnCustom();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("STR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, -1));

        bt_login.setText("LOGIN");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("I don't have an account");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));

        bt_signup.setBackground(new java.awt.Color(0, 224, 255));
        bt_signup.setText("Sign Up");
        bt_signup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bt_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signupActionPerformed(evt);
            }
        });
        getContentPane().add(bt_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        txt_strdokterlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_strdokterloginActionPerformed(evt);
            }
        });
        getContentPane().add(txt_strdokterlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("forgot password?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_icon/exit.png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        getContentPane().add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        ilustrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_icon/bg-ilustrasidokter.png"))); // NOI18N
        ilustrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ilustrasiMouseClicked(evt);
            }
        });
        getContentPane().add(ilustrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 300));

        pnCustom1.setBackground(new java.awt.Color(0, 224, 255));
        pnCustom1.setRoundBottomRight(100);
        pnCustom1.setRoundTopRight(100);

        javax.swing.GroupLayout pnCustom1Layout = new javax.swing.GroupLayout(pnCustom1);
        pnCustom1.setLayout(pnCustom1Layout);
        pnCustom1Layout.setHorizontalGroup(
            pnCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnCustom1Layout.setVerticalGroup(
            pnCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(pnCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ilustrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ilustrasiMouseClicked
        new Main_signin_dokter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ilustrasiMouseClicked

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed

        String sql = "SELECT * FROM db_dokter WHERE str='"+txt_strdokterlogin.getText()+"' and password='"+password.getText()+"'";
        try {
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                admin_dokter.setText(rs.getString(2));
                new Main_dokter().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void bt_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signupActionPerformed
        new Main_signin_dokter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_signupActionPerformed

    private void txt_strdokterloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strdokterloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strdokterloginActionPerformed

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_bt_exitMouseClicked

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
            java.util.logging.Logger.getLogger(Main_login_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_login_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_login_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_login_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_login_dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_exit;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_signup;
    private javax.swing.JLabel ilustrasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password;
    private custom_swing.PnCustom pnCustom1;
    public static final javax.swing.JTextField txt_strdokterlogin = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
