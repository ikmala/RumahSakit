package tabel_jadwal;

import connection.Connect_sql;
import dashboard_admin.Main_admin;
import tabel_jadwal.ClassJadwal;
import custom_componen.Message;
import custom_swing.EventAction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FormJadwalDokter extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormJadwalDokter() {
        initComponents();
        setTableModel();
        loadData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        pn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_viewMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Jadwal Dokter");

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
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_viewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pn_view, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pencarianKeyTyped
        searchData();
    }//GEN-LAST:event_txt_pencarianKeyTyped

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked

    }//GEN-LAST:event_tbDataMouseClicked

    private void pn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_viewMouseClicked
        loadData();
    }//GEN-LAST:event_pn_viewMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_view;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txt_pencarian;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbData.getModel());
    }
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbData.getModel();
        model.addColumn("STR");
        model.addColumn("Nama Dokter");
        model.addColumn("Spesialis");
        model.addColumn("Waktu Mulai Kerja");
        model.addColumn("Waktu Selesai Kerja");
    }
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT db_dokter.str , db_dokter.name, db_dokter.spesialis, db_jadwal.waktuMulai, db_jadwal.waktuSelesai "
                    + "FROM db_dokter LEFT JOIN db_jadwal ON db_dokter.str = db_jadwal.idJadwal";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String STR = rs.getString("str");
                    String Nama = rs.getString("name");
                    String Spesialis = rs.getString("spesialis");
                    String WaktuMulai = rs.getString("waktuMulai");
                    String WaktuSelesai = rs.getString("waktuSelesai");

                    
                    Object[] rowData = {STR,Nama,Spesialis,WaktuMulai,WaktuSelesai};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormJadwalDokter.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void searchData() {
        String KtaKunci = txt_pencarian.getText();
        DefaultTableModel model = (DefaultTableModel) tbData.getModel();
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM db_dokter WHERE str LIKE ? OR name LIKE ? OR spesialis LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                st.setString(2, "%" + KtaKunci + "%");
                st.setString(3, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String STR = rs.getString("str");
                    String Nama = rs.getString("name");
                    String Spesialis = rs.getString("spesialis");
                    
                    Object[] rowData = {STR,Nama,Spesialis};
                    model.addRow(rowData);              
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormJadwalDokter.class.getName()).log(Level.SEVERE, null, e);
        }
//        try{
//            String sql = "SELECT * FROM db_jadwal WHERE waktuMulai LIKE ? OR waktuSelesai LIKE ? ";
//            try (PreparedStatement st = con.prepareStatement(sql)) {
//                st.setString(1, "%" + KtaKunci + "%");
//                st.setString(2, "%" + KtaKunci + "%");
//                ResultSet rs = st.executeQuery();
//                while(rs.next()){
//                    String WaktuMulai = rs.getString("waktuMulai");
//                    String WaktuSelesai = rs.getString("waktuSelesai");
//                    
//                    Object[] rowData = {WaktuMulai, WaktuSelesai};
//                    model.addRow(rowData);              
//                }
//            }
//        } catch (SQLException e){
//            Logger.getLogger(FormJadwalDokter.class.getName()).log(Level.SEVERE, null, e);
//        }
    }
}
