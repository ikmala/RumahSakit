package dashboard_admin;

import connection.Connect_sql;
import dashboard_pasien.FormPemesanan_pasien;
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


public class FormDaftar_tiket extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormDaftar_tiket() {
        initComponents();
        setTableModel();
        loadData();
        ComboBox();
        setIdTiket();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_mainTiket = new javax.swing.JPanel();
        pn_viewTiket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_canceld = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataTiket = new javax.swing.JTable();
        pn_addTiket = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_idTiket = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nik_pasien = new javax.swing.JComboBox<>();
        poli = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        str_dokter = new javax.swing.JComboBox<>();
        idPetugas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        waktu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_tgl = new com.toedter.calendar.JDateChooser();
        timePicker1 = new com.raven.swing.TimePicker();

        setLayout(new java.awt.CardLayout());

        pn_mainTiket.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Daftar Tiket");

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

        tbDataTiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDataTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataTiketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDataTiket);

        javax.swing.GroupLayout pn_viewTiketLayout = new javax.swing.GroupLayout(pn_viewTiket);
        pn_viewTiket.setLayout(pn_viewTiketLayout);
        pn_viewTiketLayout.setHorizontalGroup(
            pn_viewTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewTiketLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(30, 30, 30)
                        .addComponent(bt_delete)
                        .addGap(30, 30, 30)
                        .addComponent(bt_canceld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_viewTiketLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pn_viewTiketLayout.setVerticalGroup(
            pn_viewTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_viewTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_delete)
                    .addComponent(bt_canceld)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_mainTiket.add(pn_viewTiket, "card4");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Tiket");

        txt_idTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idTiketActionPerformed(evt);
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
        logo.setText("Tambah Tiket");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Id Tiket");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Nik Pasien");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("STR Dokter");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Tanggal Periksa");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Poli");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Id Petugas");

        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Waktu");

        txt_tgl.setDateFormatString("yyyy-MM-dd");

        timePicker1.setDisplayText(waktu);

        javax.swing.GroupLayout pn_addTiketLayout = new javax.swing.GroupLayout(pn_addTiket);
        pn_addTiket.setLayout(pn_addTiketLayout);
        pn_addTiketLayout.setHorizontalGroup(
            pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(logo))
                        .addContainerGap(937, Short.MAX_VALUE))
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_addTiketLayout.createSequentialGroup()
                                .addComponent(bt_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(bt_cancel))
                            .addComponent(txt_idTiket)
                            .addComponent(nik_pasien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(poli, 0, 234, Short.MAX_VALUE)
                            .addComponent(str_dokter, 0, 234, Short.MAX_VALUE)
                            .addComponent(txt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(49, 49, 49)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(waktu)
                                .addComponent(idPetugas, 0, 234, Short.MAX_VALUE))
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pn_addTiketLayout.setVerticalGroup(
            pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(31, 31, 31)
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nik_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel5))
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(str_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_save)
                            .addComponent(bt_cancel)))
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pn_mainTiket.add(pn_addTiket, "card2");

        add(pn_mainTiket, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        pn_mainTiket.removeAll();
        pn_mainTiket.add(pn_addTiket);
        pn_mainTiket.repaint();
        pn_mainTiket.revalidate();
        txt_idTiket.setEnabled(false);
        if(bt_add.getText().equals("EDIT")){
            try {
                dataTable();
            } catch (ParseException ex) {
                Logger.getLogger(FormDaftar_tiket.class.getName()).log(Level.SEVERE, null, ex);
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

    private void tbDataTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataTiketMouseClicked
        if(bt_add.getText().equals("ADD")){
            bt_add.setText("EDIT");
            bt_delete.setVisible(true);
            bt_canceld.setVisible(true);
        }
    }//GEN-LAST:event_tbDataTiketMouseClicked

    private void txt_idTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idTiketActionPerformed

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

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_canceld;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_save;
    private javax.swing.JComboBox<String> idPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> nik_pasien;
    private javax.swing.JPanel pn_addTiket;
    private javax.swing.JPanel pn_mainTiket;
    private javax.swing.JPanel pn_viewTiket;
    private javax.swing.JComboBox<String> poli;
    private javax.swing.JComboBox<String> str_dokter;
    private javax.swing.JTable tbDataTiket;
    private com.raven.swing.TimePicker timePicker1;
    private javax.swing.JTextField txt_idTiket;
    private javax.swing.JTextField txt_pencarian;
    private com.toedter.calendar.JDateChooser txt_tgl;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbDataTiket.getModel());
        bt_delete.setVisible(false);
        bt_canceld.setVisible(false);
    }
    private void showPanel(){
        pn_mainTiket.removeAll();
        pn_mainTiket.add(new FormDaftar_tiket());
        pn_mainTiket.repaint();
        pn_mainTiket.revalidate();
    }
    private void resetForm() {
        txt_idTiket.setText("");
        nik_pasien.removeAllItems();
        poli.removeAllItems();
        str_dokter.removeAllItems();
        txt_tgl.setCalendar(null);

    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbDataTiket.getModel();
        model.addColumn("ID Pemeriksaan");
        model.addColumn("NIK Pasien");
        model.addColumn("STR Dokter");
        model.addColumn("ID POLI");
        model.addColumn("Tanggal Periksa");
        model.addColumn("Waktu Periksa");
        model.addColumn("Status");
        model.addColumn("Diagnosa");
        model.addColumn("Rujukan");
        model.addColumn("Resep");
        model.addColumn("Petugas");
    }

    private void ComboBox(){
        try{
            String sql = "SELECT * FROM db_pasien";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    nik_pasien.addItem(rs.getString("nik"));
                }
            }
        } catch (SQLException e){
            System.out.println("Error pasienData!" + e.getMessage());
        }
        try{
            String sq = "SELECT * FROM db_dokter";
            try (PreparedStatement st = con.prepareStatement(sq)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    str_dokter.addItem(rs.getString("str"));
                }
            }
        } catch (SQLException e){
            System.out.println("Error pasienData!" + e.getMessage());
        }
        try{
            String sqle = "SELECT * FROM db_ruang";
            try (PreparedStatement st = con.prepareStatement(sqle)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    poli.addItem(rs.getString("idRuang"));
                }
            }
        } catch (SQLException e){
            System.out.println("Error pasienData!" + e.getMessage());
        }
        try{
            String sqle = "SELECT * FROM db_petugas";
            try (PreparedStatement st = con.prepareStatement(sqle)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    idPetugas.addItem(rs.getString("idPetugas"));
                }
            }
        } catch (SQLException e){
            System.out.println("Error pasienData!" + e.getMessage());
        }
    }
    
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT idPemeriksaan, tanggal, waktu, status, rujukan, diagnosa, resep, str, idPetugas, nik, idRuang FROM pemeriksaan WHERE idPemeriksaan";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPeriksa = rs.getString("idPemeriksaan");
                    String NikPasien = rs.getString("nik");
                    String Petugas = rs.getString("idPetugas");
                    String StrDokter = rs.getString("str");
                    String Poli = rs.getString("idRuang");
                    String TglPeriksa = rs.getString("tanggal");
                    String Waktu = rs.getString("waktu");
                    String Status = rs.getString("status");
                    String Diagnosa = rs.getString("diagnosa");
                    String Rujukan = rs.getString("rujukan");
                    String Resep = rs.getString("resep");
                    

                    
                    Object[] rowData = {IdPeriksa,NikPasien,StrDokter,Poli,TglPeriksa,Waktu,Status,Diagnosa,Rujukan,Resep,Petugas};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_tiket.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setIdTiket(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMM");
        String currentDate = dateFormat.format(now);
        String sql = "SELECT MAX(SUBSTRING(idPemeriksaan, 5)) AS maxId FROM pemeriksaan WHERE idPemeriksaan LIKE ?";
        try(PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, "%" + currentDate + "%");
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                int maxId = rs.getInt("maxId");
                int newId = maxId + 1;
                String formattedId = String.format("%03d", newId);
                txt_idTiket.setText(currentDate + formattedId);
            } else {
                txt_idTiket.setText(currentDate + "001"); 
            }
        } catch(Exception e) {
            java.util.logging.Logger.getLogger(FormPemesanan_pasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void insertData() {
        String IdPeriksa = txt_idTiket.getText();
        String NikPasien = nik_pasien.getSelectedItem().toString();
        String STRdokter = str_dokter.getSelectedItem().toString();
        String Poli = poli.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String TglPeriksa = dateFormat.format(txt_tgl.getDate());
        String Waktu = waktu.getText();
        String Petugas = idPetugas.getSelectedItem().toString();
        
        if(IdPeriksa.isEmpty() ||NikPasien.isEmpty() ||STRdokter.isEmpty() ||Poli.isEmpty() ||TglPeriksa.isEmpty() ||Waktu.isEmpty() ||Petugas.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "INSERT INTO pemeriksaan(idPemeriksaan, nik, str,  idRuang, tanggal,waktu,idPetugas) "
                    + "VALUES ('"+IdPeriksa+"','"+NikPasien+"','"+STRdokter+"','"+Poli+"','"+TglPeriksa+"','"+Waktu+"','"+Petugas+"')";
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
            System.out.println("Error insertData!" + e.getMessage());
        }
    }
    private void dataTable() throws ParseException {
        pn_viewTiket.setVisible(false);
        pn_addTiket.setVisible(true);
        int row = tbDataTiket.getSelectedRow();
        logo.setText("Edit Data Tiket");
        bt_save.setText("UPDATE");
        txt_idTiket.setEnabled(false);
        txt_idTiket.setText(tbDataTiket.getValueAt(row, 0).toString());
        String tgl = tbDataTiket.getValueAt(row, 4).toString();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
        txt_tgl.setDate(date);
        waktu.setText(tbDataTiket.getValueAt(row, 5).toString());
        nik_pasien.setActionCommand(tbDataTiket.getValueAt(row, 1).toString());
        str_dokter.setActionCommand(tbDataTiket.getValueAt(row, 2).toString());
        poli.setActionCommand(tbDataTiket.getValueAt(row, 3).toString());
        idPetugas.setActionCommand(tbDataTiket.getValueAt(row, 6).toString());
    }
    private void updateData() {
        String IdPeriksa = txt_idTiket.getText();
        String NikPasien = nik_pasien.getSelectedItem().toString();
        String STRdokter = str_dokter.getSelectedItem().toString();
        String Poli = poli.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String TglPeriksa = dateFormat.format(txt_tgl.getDate());
        String Waktu = waktu.getText();
        String Petugas = idPetugas.getSelectedItem().toString();

        if(IdPeriksa.isEmpty() ||NikPasien.isEmpty() ||STRdokter.isEmpty() ||Poli.isEmpty() ||TglPeriksa.isEmpty() ||Waktu.isEmpty() ||Petugas.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE pemeriksaan SET nik='"+NikPasien+"', str='"+STRdokter+"',  idRuang='"+Poli+"', tanggal='"+TglPeriksa+"',"
                    + "waktu='"+Waktu+"',idPetugas='"+Petugas+"' WHERE idPemeriksaan='"+IdPeriksa+"'";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                int rowUpdated = st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success");
                    resetForm();
                    loadData();
                    showPanel();
            }
        }catch (Exception e){
            System.out.println("Error updateData!" + e.getMessage());
        }
    }

    private void deleteData() {
        int selectedRow = tbDataTiket.getSelectedRow();
        int confrim = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confrim == JOptionPane.YES_OPTION){
            String NIK = tbDataTiket.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE FROM pemeriksaan WHERE idPemeriksaan=?";
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
        DefaultTableModel model = (DefaultTableModel) tbDataTiket.getModel();
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM pemeriksaan WHERE idPemeriksaan LIKE ? OR nik LIKE ? OR str LIKE ? OR idRuang LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                st.setString(2, "%" + KtaKunci + "%");
                st.setString(3, "%" + KtaKunci + "%");
                st.setString(4, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPeriksa = rs.getString("idPemeriksaan");
                    String NikPasien = rs.getString("nik");
                    String StrDokter = rs.getString("str");
                    String Poli = rs.getString("idRuang");
                    String TglPeriksa = rs.getString("tanggal");

                    
                    Object[] rowData = {IdPeriksa,NikPasien,StrDokter,Poli,TglPeriksa};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_tiket.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
