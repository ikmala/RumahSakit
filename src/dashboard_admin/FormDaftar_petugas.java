package dashboard_admin;

import connection.Connect_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormDaftar_petugas extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormDaftar_petugas() {
        initComponents();
        setTableModel();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_grup = new javax.swing.ButtonGroup();
        pn_mainPetugas = new javax.swing.JPanel();
        pn_viewPetugas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_canceld = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataPetugas = new javax.swing.JTable();
        pn_addPetugas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_idPetugas = new javax.swing.JTextField();
        txt_namaPetugas = new javax.swing.JTextField();
        txt_hpPetugas = new javax.swing.JTextField();
        txt_emailPetugas = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamatPetugas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_laki = new javax.swing.JRadioButton();
        bt_perempuan = new javax.swing.JRadioButton();

        setLayout(new java.awt.CardLayout());

        pn_mainPetugas.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Daftar Petugas");

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

        tbDataPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDataPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataPetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDataPetugas);

        javax.swing.GroupLayout pn_viewPetugasLayout = new javax.swing.GroupLayout(pn_viewPetugas);
        pn_viewPetugas.setLayout(pn_viewPetugasLayout);
        pn_viewPetugasLayout.setHorizontalGroup(
            pn_viewPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewPetugasLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(30, 30, 30)
                        .addComponent(bt_delete)
                        .addGap(30, 30, 30)
                        .addComponent(bt_canceld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 735, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_viewPetugasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pn_viewPetugasLayout.setVerticalGroup(
            pn_viewPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_viewPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_delete)
                    .addComponent(bt_canceld)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_mainPetugas.add(pn_viewPetugas, "card4");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Petugas");

        txt_idPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idPetugasActionPerformed(evt);
            }
        });

        txt_namaPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaPetugasActionPerformed(evt);
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
        logo.setText("Tambah Petugas");

        txt_alamatPetugas.setColumns(20);
        txt_alamatPetugas.setRows(5);
        jScrollPane2.setViewportView(txt_alamatPetugas);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Id Petugas");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Nomer Telphon");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Email");

        bt_grup.add(bt_laki);
        bt_laki.setText("Laki Laki");
        bt_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lakiActionPerformed(evt);
            }
        });

        bt_grup.add(bt_perempuan);
        bt_perempuan.setText("Perempuan");

        javax.swing.GroupLayout pn_addPetugasLayout = new javax.swing.GroupLayout(pn_addPetugas);
        pn_addPetugas.setLayout(pn_addPetugasLayout);
        pn_addPetugasLayout.setHorizontalGroup(
            pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(logo)
                    .addGroup(pn_addPetugasLayout.createSequentialGroup()
                        .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_addPetugasLayout.createSequentialGroup()
                                .addComponent(bt_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_cancel))
                            .addComponent(jScrollPane2)
                            .addComponent(txt_idPetugas)
                            .addComponent(txt_namaPetugas)
                            .addComponent(txt_hpPetugas)
                            .addComponent(txt_emailPetugas)
                            .addGroup(pn_addPetugasLayout.createSequentialGroup()
                                .addComponent(bt_laki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_perempuan)))))
                .addContainerGap(1027, Short.MAX_VALUE))
        );
        pn_addPetugasLayout.setVerticalGroup(
            pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(31, 31, 31)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addPetugasLayout.createSequentialGroup()
                        .addComponent(txt_idPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_namaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bt_laki)
                    .addComponent(bt_perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_hpPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emailPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(pn_addPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_save)
                    .addComponent(bt_cancel))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        pn_mainPetugas.add(pn_addPetugas, "card2");

        add(pn_mainPetugas, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        pn_mainPetugas.removeAll();
        pn_mainPetugas.add(pn_addPetugas);
        pn_mainPetugas.repaint();
        pn_mainPetugas.revalidate();
        if(bt_add.getText().equals("EDIT")){

            dataTable();

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

    private void tbDataPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataPetugasMouseClicked
        if(bt_add.getText().equals("ADD")){
            bt_add.setText("EDIT");
            bt_delete.setVisible(true);
            bt_canceld.setVisible(true);
        }
    }//GEN-LAST:event_tbDataPetugasMouseClicked

    private void txt_idPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idPetugasActionPerformed

    private void txt_namaPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaPetugasActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_canceld;
    private javax.swing.JButton bt_delete;
    private javax.swing.ButtonGroup bt_grup;
    private javax.swing.JRadioButton bt_laki;
    private javax.swing.JRadioButton bt_perempuan;
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pn_addPetugas;
    private javax.swing.JPanel pn_mainPetugas;
    private javax.swing.JPanel pn_viewPetugas;
    private javax.swing.JTable tbDataPetugas;
    private javax.swing.JTextArea txt_alamatPetugas;
    private javax.swing.JTextField txt_emailPetugas;
    private javax.swing.JTextField txt_hpPetugas;
    private javax.swing.JTextField txt_idPetugas;
    private javax.swing.JTextField txt_namaPetugas;
    private javax.swing.JTextField txt_pencarian;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbDataPetugas.getModel());
        bt_delete.setVisible(false);
        bt_canceld.setVisible(false);
    }
    private void showPanel(){
        pn_mainPetugas.removeAll();
        pn_mainPetugas.add(new FormDaftar_petugas());
        pn_mainPetugas.repaint();
        pn_mainPetugas.revalidate();
    }
    private void resetForm() {
        txt_idPetugas.setText("");
        txt_namaPetugas.setText("");
        txt_emailPetugas.setText("");
        txt_alamatPetugas.setText("");
        bt_grup.clearSelection();
        txt_hpPetugas.setText("");

    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbDataPetugas.getModel();
        model.addColumn("ID Petugas");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelmain");
        model.addColumn("No Telphon");

    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM db_petugas";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPetugas = rs.getString("idPetugas");
                    String Nama = rs.getString("nama");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String Telphon = rs.getString("telphon");

                    
                    Object[] rowData = {IdPetugas,Nama,Email,Alamat,JK,Telphon};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_petugas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void insertData() {
        String IdPetugas = txt_idPetugas.getText();
        String Nama = txt_namaPetugas.getText();
        String Email = txt_emailPetugas.getText();
        String Alamat = txt_alamatPetugas.getText();
        String JK;
        if(bt_laki.isSelected()){
            JK = bt_laki.getText();
        } else if (bt_perempuan.isSelected()) {
            JK = bt_perempuan.getText();
        } else {
            JK ="";
        }
        String Telphon = txt_hpPetugas.getText();

        if(IdPetugas.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||Telphon.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "INSERT INTO db_petugas(idPetugas, nama, email,  alamat, jk, telphon) "
                    + "VALUES ('"+IdPetugas+"','"+Nama+"','"+Email+"','"+Alamat+"','"+JK+"','"+Telphon+"')";
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
    private void dataTable() {
        pn_viewPetugas.setVisible(false);
        pn_addPetugas.setVisible(true);
        int row = tbDataPetugas.getSelectedRow();
        logo.setText("Edit Data Petugas");
        bt_save.setText("UPDATE");
        txt_idPetugas.setEnabled(false);
        txt_idPetugas.setText(tbDataPetugas.getValueAt(row, 0).toString());
        txt_namaPetugas.setText(tbDataPetugas.getValueAt(row, 1).toString());
        txt_emailPetugas.setText(tbDataPetugas.getValueAt(row, 2).toString());
        txt_alamatPetugas.setText(tbDataPetugas.getValueAt(row, 3).toString());
        String JK = tbDataPetugas.getValueAt(row, 4).toString();
        if(JK.equals("Laki Laki")){
            bt_laki.setSelected(true);
        }else if(JK.equals("Perempuan")){
            bt_perempuan.setSelected(true);
        }
        txt_hpPetugas.setText(tbDataPetugas.getValueAt(row, 5).toString());

    }
    private void updateData() {
        String IdPetugas = txt_idPetugas.getText();
        String Nama = txt_namaPetugas.getText();
        String Email = txt_emailPetugas.getText();
        String Alamat = txt_alamatPetugas.getText();
        String JK;
        if(bt_laki.isSelected()){
            JK = bt_laki.getText();
        } else if (bt_perempuan.isSelected()) {
            JK = bt_perempuan.getText();
        } else {
            JK ="";
        }
        String Telphon = txt_hpPetugas.getText();

        if(IdPetugas.isEmpty() ||Nama.isEmpty() ||Email.isEmpty() ||Alamat.isEmpty() ||JK.isEmpty() ||Telphon.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE db_petugas SET nama=?,email=?,alamat=?,jk=?,telphon=? WHERE idPetugas=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, Nama);
                st.setString(2, Email);
                st.setString(3, Alamat);
                st.setString(4, JK);
                st.setString(5, Telphon);
                st.setString(6, IdPetugas);
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
        int selectedRow = tbDataPetugas.getSelectedRow();
        int confrim = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confrim == JOptionPane.YES_OPTION){
            String NIK = tbDataPetugas.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE FROM db_petugas WHERE idPetugas=?";
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
        DefaultTableModel model = (DefaultTableModel) tbDataPetugas.getModel();
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM db_petugas WHERE idPetugas LIKE ? OR nama LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                st.setString(2, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPetugas = rs.getString("idPetugas");
                    String Nama = rs.getString("nama");
                    String Email = rs.getString("email");
                    String Alamat = rs.getString("alamat");
                    String JK = rs.getString("jk");
                    String Telphon = rs.getString("telphon");

                    
                    Object[] rowData = {IdPetugas,Nama,Email,Alamat,JK,Telphon};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_petugas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
