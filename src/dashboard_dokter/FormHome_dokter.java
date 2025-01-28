/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dashboard_dokter;

import connection.Connect_sql;
import custom_swing.GoogleMaterialDesignIcons;
import custom_swing.IconFontSwing;
import custom_swing.ModelCard;
import dashboard_pasien.FormPemesanan_pasien;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;
import static login.Main_login_dokter.txt_strdokterlogin;

/**
 *
 * @author AIS
 */
public class FormHome_dokter extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormHome_dokter() {
        initComponents();
        setOpaque(false);
        initData();
        setTableModel();
        loadData();
    }
    private void initData() {
        initCardData();
    }
    private void initCardData() {
        Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card1.setData(new ModelCard("New Dokter", 150, 20, icon1));
        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card2.setData(new ModelCard("Petugas", 1050, 60, icon2));
        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.LOCAL_HOSPITAL, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card3.setData(new ModelCard("Kamar", 3000, 80, icon3));
        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.LOCAL_HOSPITAL, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card4.setData(new ModelCard("Poli", 100, 95, icon4));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new custom_componen.Card();
        jLabel1 = new javax.swing.JLabel();
        card2 = new custom_componen.Card();
        card3 = new custom_componen.Card();
        card4 = new custom_componen.Card();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAntrian = new javax.swing.JTable();

        card1.setColorGradient(new java.awt.Color(211, 28, 215));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Home");

        card2.setBackground(new java.awt.Color(10, 30, 214));
        card2.setColorGradient(new java.awt.Color(72, 111, 252));

        card3.setBackground(new java.awt.Color(194, 85, 1));
        card3.setColorGradient(new java.awt.Color(255, 212, 99));

        card4.setBackground(new java.awt.Color(60, 195, 0));
        card4.setColorGradient(new java.awt.Color(208, 255, 90));

        tbAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Antrian", "Nama"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAntrian);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom_componen.Card card1;
    private custom_componen.Card card2;
    private custom_componen.Card card3;
    private custom_componen.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAntrian;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbAntrian.getModel());
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbAntrian.getModel();
        model.addColumn("ID Pemeriksaan");
        model.addColumn("NIK Pasien");
        model.addColumn("Tanggal Periksa");
        model.addColumn("Waktu Periksa");
        model.addColumn("Status");
    }
    
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        String strDokter = txt_strdokterlogin.getText();
        try{
            String sql = "SELECT idPemeriksaan, tanggal, waktu, status, rujukan, diagnosa, resep, str, nik, idRuang FROM pemeriksaan WHERE str='"+strDokter+"'";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPeriksa = rs.getString("idPemeriksaan");
                    String NikPasien = rs.getString("nik");
                    String StrDokter = rs.getString("str");
                    String TglPeriksa = rs.getString("tanggal");
                    String Waktu = rs.getString("waktu");
                    String Status = rs.getString("status");

                    Object[] rowData = {IdPeriksa,NikPasien,StrDokter,TglPeriksa,Waktu,Status};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormPemesanan_pasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
