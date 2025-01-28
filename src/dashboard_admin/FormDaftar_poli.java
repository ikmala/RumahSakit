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


 
public class FormDaftar_poli extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormDaftar_poli() {
        initComponents();
        setTableModel();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_mainPetugas = new javax.swing.JPanel();
        pn_viewPoli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_canceld = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataPetugas = new javax.swing.JTable();
        pn_addPoli = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_idRuang = new javax.swing.JTextField();
        txt_poli = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        pn_mainPetugas.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Daftar Poli");

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

        javax.swing.GroupLayout pn_viewPoliLayout = new javax.swing.GroupLayout(pn_viewPoli);
        pn_viewPoli.setLayout(pn_viewPoliLayout);
        pn_viewPoliLayout.setHorizontalGroup(
            pn_viewPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewPoliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewPoliLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(30, 30, 30)
                        .addComponent(bt_delete)
                        .addGap(30, 30, 30)
                        .addComponent(bt_canceld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 735, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_viewPoliLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pn_viewPoliLayout.setVerticalGroup(
            pn_viewPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewPoliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_viewPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_delete)
                    .addComponent(bt_canceld)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_mainPetugas.add(pn_viewPoli, "card4");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Poli");

        txt_idRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idRuangActionPerformed(evt);
            }
        });

        txt_poli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_poliActionPerformed(evt);
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
        logo.setText("Tambah Poli");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Id Ruang");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Poli");

        javax.swing.GroupLayout pn_addPoliLayout = new javax.swing.GroupLayout(pn_addPoli);
        pn_addPoli.setLayout(pn_addPoliLayout);
        pn_addPoliLayout.setHorizontalGroup(
            pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addPoliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(logo)
                    .addGroup(pn_addPoliLayout.createSequentialGroup()
                        .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(60, 60, 60)
                        .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_addPoliLayout.createSequentialGroup()
                                .addComponent(bt_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(bt_cancel))
                            .addComponent(txt_idRuang)
                            .addComponent(txt_poli))))
                .addContainerGap(1037, Short.MAX_VALUE))
        );
        pn_addPoliLayout.setVerticalGroup(
            pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addPoliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(31, 31, 31)
                .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addPoliLayout.createSequentialGroup()
                        .addComponent(txt_idRuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_poli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(pn_addPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_save)
                    .addComponent(bt_cancel))
                .addContainerGap(617, Short.MAX_VALUE))
        );

        pn_mainPetugas.add(pn_addPoli, "card2");

        add(pn_mainPetugas, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        pn_mainPetugas.removeAll();
        pn_mainPetugas.add(pn_addPoli);
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

    private void txt_idRuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idRuangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idRuangActionPerformed

    private void txt_poliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_poliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_poliActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_canceld;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pn_addPoli;
    private javax.swing.JPanel pn_mainPetugas;
    private javax.swing.JPanel pn_viewPoli;
    private javax.swing.JTable tbDataPetugas;
    private javax.swing.JTextField txt_idRuang;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_poli;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbDataPetugas.getModel());
        bt_delete.setVisible(false);
        bt_canceld.setVisible(false);
    }
    private void showPanel(){
        pn_mainPetugas.removeAll();
        pn_mainPetugas.add(new FormDaftar_poli());
        pn_mainPetugas.repaint();
        pn_mainPetugas.revalidate();
    }
    private void resetForm() {
        txt_idRuang.setText("");
        txt_poli.setText("");


    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbDataPetugas.getModel();
        model.addColumn("ID Ruang");
        model.addColumn("Poli");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM db_ruang";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdRuang = rs.getString("idRuang");
                    String Poli = rs.getString("poli");
                    
                    Object[] rowData = {IdRuang,Poli};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_poli.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void insertData() {
        String IdRuang = txt_idRuang.getText();
        String Poli = txt_poli.getText();
        

        if(IdRuang.isEmpty() ||Poli.isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "INSERT INTO db_ruang(idRuang, poli) "
                    + "VALUES ('"+IdRuang+"','"+Poli+"')";
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
        pn_viewPoli.setVisible(false);
        pn_addPoli.setVisible(true);
        int row = tbDataPetugas.getSelectedRow();
        logo.setText("Edit Data Poli");
        bt_save.setText("UPDATE");
        txt_idRuang.setEnabled(false);
        txt_idRuang.setText(tbDataPetugas.getValueAt(row, 0).toString());
        txt_poli.setText(tbDataPetugas.getValueAt(row, 1).toString());
    }
    private void updateData() {
        String IdRuang = txt_idRuang.getText();
        String Poli = txt_poli.getText();

        if(IdRuang.isEmpty() ||Poli.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE db_ruang SET idRuang=?,poli=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, Poli);
                st.setString(2, IdRuang);

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
            String IdRuang = tbDataPetugas.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE FROM db_ruang WHERE idRuang=?";
                try(PreparedStatement st = con.prepareStatement(sql)){
                    st.setString(1, IdRuang);
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
            String sql = "SELECT * FROM db_ruang WHERE poli LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");

                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdRuang = rs.getString("idRuang");
                    String Poli = rs.getString("poli");


                    
                    Object[] rowData = {IdRuang,Poli};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormDaftar_poli.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
