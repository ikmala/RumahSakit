package dashboard_admin;

import connection.Connect_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormDaftar_pasien extends javax.swing.JPanel {
    Connection con=Connect_sql.getConnection();
//    private final Connection conn;
    public FormDaftar_pasien() {
        initComponents();
//        con = Connect_sql.getConnection();
        setTableModel();
        loadData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_canceld = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        pn_add = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_hp = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_bpjs = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gol_darah = new javax.swing.JTextField();
        txt_agama = new javax.swing.JTextField();
        txt_pekerjaan = new javax.swing.JTextField();
        txt_pendidikan = new javax.swing.JTextField();
        txt_berat = new javax.swing.JTextField();
        txt_tinggi = new javax.swing.JTextField();
        bt_laki = new javax.swing.JRadioButton();
        bt_perempuan = new javax.swing.JRadioButton();
        tgl_lahir1 = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.CardLayout());

        pn_main.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Daftar Pasien");

        bt_add.setText("ADD");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_delete.setText("DELETE");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        bt_canceld.setText("CANCELD");
        bt_canceld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_canceldActionPerformed(evt);
            }
        });

        txt_pencarian.setText("Search.....");
        txt_pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pencarianKeyTyped(evt);
            }
        });

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(30, 30, 30)
                        .addComponent(bt_delete)
                        .addGap(30, 30, 30)
                        .addComponent(bt_canceld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 735, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_delete)
                    .addComponent(bt_canceld)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_main.add(pn_view, "card4");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Pasien");

        txt_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nikActionPerformed(evt);
            }
        });

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        bt_save.setText("SAVE");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        logo.setText("Tambah Pasien");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane2.setViewportView(txt_alamat);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("NIK");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Tanggal Lahir");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Nomer Telphon");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel12.setText("No. BPJS");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel13.setText("Golongan Darah");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel14.setText("Agama");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel15.setText("Pekerjaan");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel16.setText("Pendidikan");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel17.setText("Berat Badan");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel18.setText("Tinggi Badan");

        txt_tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tinggiActionPerformed(evt);
            }
        });

        buttonGroup2.add(bt_laki);
        bt_laki.setText("Laki Laki");
        bt_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lakiActionPerformed(evt);
            }
        });

        buttonGroup2.add(bt_perempuan);
        bt_perempuan.setText("Perempuan");

        tgl_lahir1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(logo)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_addLayout.createSequentialGroup()
                                    .addComponent(bt_save)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_cancel))
                                .addComponent(jScrollPane2)
                                .addComponent(txt_nik)
                                .addComponent(txt_nama)
                                .addComponent(txt_hp)
                                .addComponent(txt_email)
                                .addComponent(txt_bpjs, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pn_addLayout.createSequentialGroup()
                                    .addComponent(bt_laki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_perempuan)))
                            .addComponent(tgl_lahir1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(29, 29, 29)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_berat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_agama, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gol_darah, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(747, Short.MAX_VALUE))
        );
        pn_addLayout.setVerticalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(31, 31, 31)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(gol_darah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(txt_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txt_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addLayout.createSequentialGroup()
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel17)
                                .addComponent(txt_berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tgl_lahir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18)
                            .addComponent(txt_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_laki)
                            .addComponent(bt_perempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_bpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_save)
                            .addComponent(bt_cancel))))
                .addGap(375, 375, 375))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        pn_main.removeAll();
        pn_main.add(pn_add);
        pn_main.repaint();
        pn_main.revalidate();
        if(bt_add.getText().equals("EDIT")){
            
            try {
                dataTable();
            } catch (ParseException ex) {
                Logger.getLogger(FormDaftar_pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_bt_addActionPerformed

    private void txt_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nikActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        if(bt_save.getText().equals("SAVE")){
            insertData();
        }else if(bt_save.getText().equals("UPDATE")){
            updateData();
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void txt_tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tinggiActionPerformed

    private void bt_lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_lakiActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if(bt_add.getText().equals("ADD")){
            bt_add.setText("EDIT");
            bt_delete.setVisible(true);
            bt_canceld.setVisible(true);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void bt_canceldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_canceldActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_bt_canceldActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        deleteData();
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void txt_pencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pencarianKeyTyped
        searchData();
    }//GEN-LAST:event_txt_pencarianKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_canceld;
    private javax.swing.JButton bt_delete;
    private javax.swing.JRadioButton bt_laki;
    private javax.swing.JRadioButton bt_perempuan;
    private javax.swing.JButton bt_save;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField gol_darah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private javax.swing.JTable tbData;
    private com.toedter.calendar.JDateChooser tgl_lahir1;
    private javax.swing.JTextField txt_agama;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_berat;
    private javax.swing.JTextField txt_bpjs;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_pekerjaan;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_pendidikan;
    private javax.swing.JTextField txt_tinggi;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbData.getModel());
        bt_delete.setVisible(false);
        bt_canceld.setVisible(false);
    }
    private void showPanel(){
        pn_main.removeAll();
        pn_main.add(new FormDaftar_pasien());
        pn_main.repaint();
        pn_main.revalidate();
    }
    private void resetForm() {
        txt_nik.setText("");
        txt_nama.setText("");
        txt_email.setText("");
        txt_alamat.setText("");
        buttonGroup2.clearSelection();
        tgl_lahir1.setCalendar(null);
        txt_hp.setText("");
        txt_bpjs.setText("");
        gol_darah.setText("");
        txt_agama.setText("");
        txt_pekerjaan.setText("");
        txt_pendidikan.setText("");
        txt_tinggi.setText("");
        txt_berat.setText("");
    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbData.getModel();
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelmain");
        model.addColumn("Tgl Lahir");
        model.addColumn("No Telphon");
        model.addColumn("No BPJS");
        model.addColumn("Golongan Darah");
        model.addColumn("Agama");
        model.addColumn("Pekerjaan");
        model.addColumn("Pendidikan");
        model.addColumn("Tinggi Badan");
        model.addColumn("Berat Badan");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM db_pasien";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String NIK = rs.getString("nik");
                    String Nama = rs.getString("nama");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String TglLahir = rs.getString("tgl_lahir");
                    String Telphon = rs.getString("telphon");
                    String BPJS = rs.getString("bpjs");
                    String GolDarah = rs.getString("gol_darah");
                    String Agama = rs.getString("agama");
                    String Pekerjaan = rs.getString("pekerjaan");
                    String Pendidikan = rs.getString("pendidikan");
                    String Tinggi = rs.getString("tinggi");
                    String Berat = rs.getString("berat");
                    
                    Object[] rowData = {NIK,Nama,Email,Alamat,JK,TglLahir,Telphon,BPJS,GolDarah,Agama,Pekerjaan,Pendidikan,Tinggi,Berat};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_pasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void insertData() {
        String NIK = txt_nik.getText();
        String Nama = txt_nama.getText();
        String Email = txt_email.getText();
        String Alamat = txt_alamat.getText();
        String JK;
        if(bt_laki.isSelected()){
            JK = bt_laki.getText();
        } else if (bt_perempuan.isSelected()) {
            JK = bt_perempuan.getText();
        } else {
            JK ="";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String TglLahir = dateFormat.format(tgl_lahir1.getDate());
        String Telphon = txt_hp.getText();
        String BPJS = txt_bpjs.getText();
        String GolDarah = gol_darah.getText();
        String Agama = txt_agama.getText();
        String Pekerjaan = txt_pekerjaan.getText();
        String Pendidikan = txt_pendidikan.getText();
        String Tinggi = txt_tinggi.getText();
        String Berat = txt_berat.getText();
        if(NIK.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||TglLahir.isEmpty() ||Telphon.isEmpty() ||GolDarah.isEmpty() ||Agama.isEmpty() ||Pekerjaan.isEmpty() ||Pendidikan.isEmpty() ||Tinggi.isEmpty() ||Berat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "INSERT INTO db_pasien(nik, nama, email, alamat, jk, tgl_lahir, telphon, bpjs, gol_darah, agama, pekerjaan, pendidikan, tinggi, berat) "
                    + "VALUES ('"+NIK+"','"+Nama+"','"+Email+"','"+Alamat+"','"+JK+"','"+TglLahir+"','"+Telphon+"','"+BPJS+"','"+GolDarah+"','"+Agama+"','"+Pekerjaan+"','"+Pendidikan+"','"+Tinggi+"','"+Berat+"')";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Success");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }catch (Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }
    private void dataTable() throws ParseException {
        pn_view.setVisible(false);
        pn_add.setVisible(true);
        int row = tbData.getSelectedRow();
        logo.setText("Edit Data Pasien");
        bt_save.setText("UPDATE");
        txt_nik.setEnabled(false);
        
        txt_nik.setText(tbData.getValueAt(row, 0).toString());
        txt_nama.setText(tbData.getValueAt(row, 1).toString());
        txt_email.setText(tbData.getValueAt(row, 2).toString());
        txt_alamat.setText(tbData.getValueAt(row, 3).toString());
        String JK = tbData.getValueAt(row, 4).toString();
        if(JK.equals("Laki Laki")){
            bt_laki.setSelected(true);
        }else if(JK.equals("Perempuan")){
            bt_perempuan.setSelected(true);
        }
        String tgl = tbData.getValueAt(row, 5).toString();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
        tgl_lahir1.setDate(date);
        txt_hp.setText(tbData.getValueAt(row, 6).toString());
        txt_bpjs.setText(tbData.getValueAt(row, 7).toString());
        gol_darah.setText(tbData.getValueAt(row, 8).toString());
        txt_agama.setText(tbData.getValueAt(row, 9).toString());
        txt_pekerjaan.setText(tbData.getValueAt(row, 10).toString());
        txt_pendidikan.setText(tbData.getValueAt(row, 11).toString());
        txt_tinggi.setText(tbData.getValueAt(row, 12).toString());
        txt_berat.setText(tbData.getValueAt(row, 13).toString());
    }
    private void updateData() {
        String NIK = txt_nik.getText();
        String Nama = txt_nama.getText();
        String Email = txt_email.getText();
        String Alamat = txt_alamat.getText();
        String JK;
        if(bt_laki.isSelected()){
            JK = bt_laki.getText();
        } else if (bt_perempuan.isSelected()) {
            JK = bt_perempuan.getText();
        } else {
            JK ="";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String TglLahir = dateFormat.format(tgl_lahir1.getDate());
        String Telphon = txt_hp.getText();
        String BPJS = txt_bpjs.getText();
        String GolDarah = gol_darah.getText();
        String Agama = txt_agama.getText();
        String Pekerjaan = txt_pekerjaan.getText();
        String Pendidikan = txt_pendidikan.getText();
        String Tinggi = txt_tinggi.getText();
        String Berat = txt_berat.getText();
        if(NIK.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||TglLahir.isEmpty() ||Telphon.isEmpty()  ||GolDarah.isEmpty() ||Agama.isEmpty() ||Pekerjaan.isEmpty() ||Pendidikan.isEmpty() ||Tinggi.isEmpty() ||Berat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE db_pasien SET nama=?,email=?,alamat=?,jk=?,tgl_lahir=?,telphon=?,bpjs=?,gol_darah=?,agama=?,"
                    + "pekerjaan=?,pendidikan=?,tinggi=?,berat=? WHERE nik=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, Nama);
                st.setString(2, Email);
                st.setString(3, Alamat);
                st.setString(4, JK);
                st.setString(5, TglLahir);
                st.setString(6, Telphon);
                st.setString(7, BPJS);
                st.setString(8, GolDarah);
                st.setString(9, Agama);
                st.setString(10, Pekerjaan);
                st.setString(11, Pendidikan);
                st.setString(12, Tinggi);
                st.setString(13, Berat);
                st.setString(14, NIK);
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Success");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }catch (Exception e){
            System.out.println("Error updateData!" + e.getMessage());
        }
    }

    private void deleteData() {
        int selectedRow = tbData.getSelectedRow();
        int confrim = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confrim == JOptionPane.YES_OPTION){
            String NIK = tbData.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE FROM db_pasien WHERE nik=?";
                try(PreparedStatement st = con.prepareStatement(sql)){
                    st.setString(1, NIK);
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Success Deleted");
                    }
                else{
                    JOptionPane.showMessageDialog(this, "Error Deleted");
                }
                }
            }catch (Exception e){
            System.out.println("Error deleteData!" + e.getMessage());
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String KtaKunci = txt_pencarian.getText();
        DefaultTableModel model = (DefaultTableModel) tbData.getModel();
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM db_pasien WHERE nik LIKE ? OR nama LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                st.setString(2, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String NIK = rs.getString("nik");
                    String Nama = rs.getString("nama");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String TglLahir = rs.getString("tgl_lahir");
                    String Telphon = rs.getString("telphon");
                    String BPJS = rs.getString("bpjs");
                    String GolDarah = rs.getString("gol_darah");
                    String Agama = rs.getString("agama");
                    String Pekerjaan = rs.getString("pekerjaan");
                    String Pendidikan = rs.getString("pendidikan");
                    String Tinggi = rs.getString("tinggi");
                    String Berat = rs.getString("berat");
                    
                    Object[] rowData = {NIK,Nama,Email,Alamat,JK,TglLahir,Telphon,BPJS,GolDarah,Agama,Pekerjaan,Pendidikan,Tinggi,Berat};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_pasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
