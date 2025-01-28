package dashboard_admin;

import connection.Connect_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.ZoneId;

public class FormDaftar_dokter extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormDaftar_dokter() {
        initComponents();
        setTableModel();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        timePicker2 = new com.raven.swing.TimePicker();
        timePicker1 = new com.raven.swing.TimePicker();
        pn_mainDokter = new javax.swing.JPanel();
        pn_viewDokter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_canceld = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        pn_addDokter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_str = new javax.swing.JTextField();
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
        txt_spesialis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bt_laki = new javax.swing.JRadioButton();
        bt_perempuan = new javax.swing.JRadioButton();
        txt_waktuMulai = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_waktuSelesai = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tglLahir = new com.toedter.calendar.JDateChooser();
        tampiljammulai = new javax.swing.JButton();
        tampiljamselesai = new javax.swing.JButton();

        timePicker2.setDisplayText(txt_waktuSelesai);

        timePicker1.setDisplayText(txt_waktuMulai);

        setLayout(new java.awt.CardLayout());

        pn_mainDokter.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Daftar Dokter");

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

        javax.swing.GroupLayout pn_viewDokterLayout = new javax.swing.GroupLayout(pn_viewDokter);
        pn_viewDokter.setLayout(pn_viewDokterLayout);
        pn_viewDokterLayout.setHorizontalGroup(
            pn_viewDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewDokterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewDokterLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(30, 30, 30)
                        .addComponent(bt_delete)
                        .addGap(30, 30, 30)
                        .addComponent(bt_canceld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_viewDokterLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pn_viewDokterLayout.setVerticalGroup(
            pn_viewDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewDokterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_viewDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_delete)
                    .addComponent(bt_canceld)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_mainDokter.add(pn_viewDokter, "card4");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Dokter");

        txt_str.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_strActionPerformed(evt);
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
        logo.setText("Tambah Dokter");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane2.setViewportView(txt_alamat);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("STR Dokter");

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
        jLabel12.setText("Spesialis");

        buttonGroup2.add(bt_laki);
        bt_laki.setText("Laki Laki");
        bt_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lakiActionPerformed(evt);
            }
        });

        buttonGroup2.add(bt_perempuan);
        bt_perempuan.setText("Perempuan");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel16.setText("Waktu Mulai Kerja");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel17.setText("Waktu Selesai Kerja");

        txt_tglLahir.setDateFormatString("yyyy-MM-dd");

        tampiljammulai.setText("Tampil Jam");
        tampiljammulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampiljammulaiActionPerformed(evt);
            }
        });

        tampiljamselesai.setText("Tampil Jam");
        tampiljamselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampiljamselesaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_addDokterLayout = new javax.swing.GroupLayout(pn_addDokter);
        pn_addDokter.setLayout(pn_addDokterLayout);
        pn_addDokterLayout.setHorizontalGroup(
            pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addDokterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addDokterLayout.createSequentialGroup()
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(logo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_addDokterLayout.createSequentialGroup()
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_addDokterLayout.createSequentialGroup()
                                    .addComponent(bt_save)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_cancel))
                                .addComponent(jScrollPane2)
                                .addComponent(txt_str)
                                .addComponent(txt_nama)
                                .addComponent(txt_hp)
                                .addComponent(txt_email)
                                .addComponent(txt_spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pn_addDokterLayout.createSequentialGroup()
                                    .addComponent(bt_laki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_perempuan)))
                            .addComponent(txt_tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(24, 24, 24)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_waktuMulai)
                            .addComponent(txt_waktuSelesai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampiljammulai, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tampiljamselesai, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(55, 55, 55))))
        );
        pn_addDokterLayout.setVerticalGroup(
            pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addDokterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(30, 30, 30)
                .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addDokterLayout.createSequentialGroup()
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(tampiljammulai))
                        .addGap(23, 23, 23)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(tampiljamselesai)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_addDokterLayout.createSequentialGroup()
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addDokterLayout.createSequentialGroup()
                                .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel5))
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_addDokterLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(51, 51, 51))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bt_laki)
                            .addComponent(bt_perempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(83, 83, 83)
                        .addGroup(pn_addDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_save)
                            .addComponent(bt_cancel))
                        .addGap(355, 355, 355))))
        );

        pn_mainDokter.add(pn_addDokter, "card2");

        add(pn_mainDokter, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        pn_mainDokter.removeAll();
        pn_mainDokter.add(pn_addDokter);
        pn_mainDokter.repaint();
        pn_mainDokter.revalidate();
        if(bt_add.getText().equals("EDIT")){

            try {
                dataTable();
            } catch (ParseException ex) {
                Logger.getLogger(FormDaftar_dokter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        deleteData();
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_canceldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_canceldActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_bt_canceldActionPerformed

    private void txt_pencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pencarianKeyTyped
        searchData();
    }//GEN-LAST:event_txt_pencarianKeyTyped

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if(bt_add.getText().equals("ADD")){
            bt_add.setText("EDIT");
            bt_delete.setVisible(true);
            bt_canceld.setVisible(true);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void txt_strActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strActionPerformed

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

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_lakiActionPerformed

    private void tampiljammulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampiljammulaiActionPerformed
        timePicker1.showPopup(this, 750, 200);
    }//GEN-LAST:event_tampiljammulaiActionPerformed

    private void tampiljamselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampiljamselesaiActionPerformed
        timePicker2.showPopup(this, 750, 200);
    }//GEN-LAST:event_tampiljamselesaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_canceld;
    private javax.swing.JButton bt_delete;
    private javax.swing.JRadioButton bt_laki;
    private javax.swing.JRadioButton bt_perempuan;
    private javax.swing.JButton bt_save;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pn_addDokter;
    private javax.swing.JPanel pn_mainDokter;
    private javax.swing.JPanel pn_viewDokter;
    private javax.swing.JButton tampiljammulai;
    private javax.swing.JButton tampiljamselesai;
    private javax.swing.JTable tbData;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_spesialis;
    private javax.swing.JTextField txt_str;
    private com.toedter.calendar.JDateChooser txt_tglLahir;
    private javax.swing.JTextField txt_waktuMulai;
    private javax.swing.JTextField txt_waktuSelesai;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbData.getModel());
        bt_delete.setVisible(false);
        bt_canceld.setVisible(false);
    }
    private void showPanel(){
        pn_mainDokter.removeAll();
        pn_mainDokter.add(new FormDaftar_dokter());
        pn_mainDokter.repaint();
        pn_mainDokter.revalidate();
    }
    private void resetForm() {
        txt_str.setText("");
        txt_nama.setText("");
        txt_email.setText("");
        txt_alamat.setText("");
        buttonGroup2.clearSelection();
        txt_tglLahir.setCalendar(null);
        txt_hp.setText("");
        txt_spesialis.setText("");
        txt_waktuMulai.setText("");
        txt_waktuSelesai.setText("");

    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbData.getModel();
        model.addColumn("STR");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelmain");
        model.addColumn("Tgl Lahir");
        model.addColumn("No Telphon");
        model.addColumn("Spesialis");
        model.addColumn("Waktu Mulai");
        model.addColumn("Waktu Selesai");

    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT db_dokter.str , db_dokter.name, db_dokter.email, db_dokter.alamat,db_dokter.jk, db_dokter.tgl_lahir, "
                    + "db_dokter.telphon, db_dokter.spesialis, db_jadwal.waktuMulai, db_jadwal.waktuSelesai "
                    + "FROM db_dokter LEFT JOIN db_jadwal ON db_dokter.str = db_jadwal.idJadwal";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String STR = rs.getString("str");
                    String Nama = rs.getString("name");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String TglLahir = rs.getString("tgl_lahir");
                    String Telphon = rs.getString("telphon");
                    String Spesialis = rs.getString("spesialis");
                    String WaktuMulai = rs.getString("waktuMulai");
                    String WaktuSelesai = rs.getString("waktuSelesai");

                    
                    Object[] rowData = {STR,Nama,Email,Alamat,JK,TglLahir,Telphon,Spesialis,WaktuMulai,WaktuSelesai};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_dokter.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void insertData() {
        String STR = txt_str.getText();
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
        String TglLahir = dateFormat.format(txt_tglLahir.getDate());
        String Telphon = txt_hp.getText();
        String Spesialis = txt_spesialis.getText();
        String WaktuMulai = txt_waktuMulai.getText();
        String WaktuSelesai = txt_waktuSelesai.getText();

        if(STR.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||TglLahir.isEmpty() ||Telphon.isEmpty() ||Spesialis.isEmpty() ||WaktuMulai.isEmpty() ||WaktuSelesai.isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "INSERT INTO db_dokter(str, name, email, alamat, jk, tgl_lahir, telphon, spesialis) "
                    + "VALUES ('"+STR+"','"+Nama+"','"+Email+"','"+Alamat+"','"+JK+"','"+TglLahir+"','"+Telphon+"','"+Spesialis+"')";
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
            System.out.println("Error Insertdb_doketr!" + e.getMessage());
        }
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        try{
            String sql = "INSERT INTO db_jadwal(idJadwal, bulan, tahun, waktuMulai, waktuSelesai) "
                    + "VALUES ('"+STR+"','"+month+"','"+year+"','"+WaktuMulai+"','"+WaktuSelesai+"')";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
//                    JOptionPane.showMessageDialog(this, "Success");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }catch (Exception e){
            System.out.println("Error Insertdb_jadwal!" + e.getMessage());
        }
    }
    
    private void dataTable() throws ParseException {
        pn_viewDokter.setVisible(false);
        pn_addDokter.setVisible(true);
        int row = tbData.getSelectedRow();
        logo.setText("Edit Data Dokter");
        bt_save.setText("UPDATE");
        txt_str.setEnabled(false);
        
        txt_str.setText(tbData.getValueAt(row, 0).toString());
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
        txt_tglLahir.setDate(date);
        txt_hp.setText(tbData.getValueAt(row, 6).toString());
        txt_spesialis.setText(tbData.getValueAt(row, 7).toString());
        txt_waktuMulai.setText(tbData.getValueAt(row, 8).toString());
        txt_waktuSelesai.setText(tbData.getValueAt(row, 9).toString());

    }
    private void updateData() {
        String STR = txt_str.getText();
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
        String TglLahir = dateFormat.format(txt_tglLahir.getDate());
        String Telphon = txt_hp.getText();
        String Spesialis = txt_spesialis.getText();
        String WaktuMulai = txt_waktuMulai.getText();
        String WaktuSelesai = txt_waktuSelesai.getText();

        if(STR.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||TglLahir.isEmpty() ||Telphon.isEmpty() ||Spesialis.isEmpty() ||WaktuMulai.isEmpty() ||WaktuSelesai.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE db_dokter SET name=?,email=?,alamat=?,jk=?,tgl_lahir=?,"
                    + "telphon=?,spesialis=? WHERE str=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, Nama);
                st.setString(2, Email);
                st.setString(3, Alamat);
                st.setString(4, JK);
                st.setString(5, TglLahir);
                st.setString(6, Telphon);
                st.setString(7, Spesialis);
                st.setString(8, STR);

                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Success");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }catch (Exception e){
            System.out.println("Error updateDataDokter!" + e.getMessage());
        }
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        try{
            String sql = "UPDATE db_jadwal SET bulan='"+month+"',tahun='"+year+"',waktuMulai=?,waktuSelesai=? "
                    + "WHERE idJadwal=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, WaktuMulai);
                st.setString(2, WaktuSelesai);
                st.setString(3, STR);

                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }catch (Exception e){
            System.out.println("Error updateDataJadwal!" + e.getMessage());
        }
    }

    private void deleteData() {
        int selectedRow = tbData.getSelectedRow();
        int confrim = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confrim == JOptionPane.YES_OPTION){
            String STR = tbData.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE FROM db_dokter WHERE str=?";
                try(PreparedStatement st = con.prepareStatement(sql)){
                    st.setString(1, STR);
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Success Deleted");
                    }
                else{
                    JOptionPane.showMessageDialog(this, "Error Deleted");
                }
                }
            }catch (Exception e){
            System.out.println("Error deleteDataDokter!" + e.getMessage());
            }
            try{
                String sql = "DELETE FROM db_jadwal WHERE idJadwal=?";
                try(PreparedStatement st = con.prepareStatement(sql)){
                    st.setString(1, STR);
                int rowUpdated = st.executeUpdate();
                }
            }catch (Exception e){
            System.out.println("Error deleteDataJadwal!" + e.getMessage());
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
            String sql = "SELECT * FROM db_dokter WHERE str LIKE ? OR name LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                st.setString(2, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String STR = rs.getString("str");
                    String Nama = rs.getString("name");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String TglLahir = rs.getString("tgl_lahir");
                    String Telphon = rs.getString("telphon");
                    String Spesialis = rs.getString("spesialis");

                    Object[] rowData = {STR,Nama,Email,Alamat,JK,TglLahir,Telphon,Spesialis};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_dokter.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
