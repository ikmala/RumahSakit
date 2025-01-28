package dashboard_dokter;

import connection.Connect_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormPemeriksaan extends javax.swing.JPanel {

    Connection con=Connect_sql.getConnection();
    public FormPemeriksaan() {
        initComponents();
        tampildata();
        setTableModel();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn_addTiket = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resep = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        skip = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        nomer_antrian = new javax.swing.JLabel();
        inap = new javax.swing.JRadioButton();
        rawatJalan = new javax.swing.JRadioButton();
        txt_pencarian = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDataAntrian = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 72, 210));
        jLabel2.setText("Daftar Tiket");

        logo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        logo.setText("ANTRIAN");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Diagnosa");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Rujukan");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Resep");

        diagnosa.setColumns(20);
        diagnosa.setRows(5);
        jScrollPane1.setViewportView(diagnosa);

        resep.setColumns(20);
        resep.setRows(5);
        jScrollPane2.setViewportView(resep);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        skip.setText("Skip");
        skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        nomer_antrian.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        buttonGroup1.add(inap);
        inap.setText("Inap");

        buttonGroup1.add(rawatJalan);
        rawatJalan.setText("Rawat Jalan");

        txt_pencarian.setText("Search.....");
        txt_pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pencarianKeyTyped(evt);
            }
        });

        tbDataAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDataAntrian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataAntrianMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDataAntrian);

        javax.swing.GroupLayout pn_addTiketLayout = new javax.swing.GroupLayout(pn_addTiket);
        pn_addTiket.setLayout(pn_addTiketLayout);
        pn_addTiketLayout.setHorizontalGroup(
            pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addTiketLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addTiketLayout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(45, 45, 45)
                                .addComponent(skip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit))
                            .addGroup(pn_addTiketLayout.createSequentialGroup()
                                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                                        .addComponent(logo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomer_antrian))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                                        .addComponent(inap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rawatJalan))
                                    .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(322, 322, 322)
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_addTiketLayout.setVerticalGroup(
            pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addTiketLayout.createSequentialGroup()
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logo)
                            .addComponent(nomer_antrian))
                        .addGap(31, 31, 31)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addTiketLayout.createSequentialGroup()
                                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(rawatJalan))
                                .addGap(26, 26, 26)
                                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(skip)
                                    .addGroup(pn_addTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submit)
                                        .addComponent(back))))
                            .addComponent(inap)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        add(pn_addTiket, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        skipToPreviousId(nomer_antrian.getText());
    }//GEN-LAST:event_backActionPerformed

    private void skipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipActionPerformed
        skipToNextId(nomer_antrian.getText());
    }//GEN-LAST:event_skipActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        UpdateData();
    }//GEN-LAST:event_submitActionPerformed

    private void txt_pencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pencarianKeyTyped
        searchData();
    }//GEN-LAST:event_txt_pencarianKeyTyped

    private void tbDataAntrianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataAntrianMouseClicked
        selectData();
    }//GEN-LAST:event_tbDataAntrianMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea diagnosa;
    private javax.swing.JRadioButton inap;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomer_antrian;
    private javax.swing.JPanel pn_addTiket;
    private javax.swing.JRadioButton rawatJalan;
    private javax.swing.JTextArea resep;
    private javax.swing.JButton skip;
    private javax.swing.JButton submit;
    private javax.swing.JTable tbDataAntrian;
    private javax.swing.JTextField txt_pencarian;
    // End of variables declaration//GEN-END:variables
    private void loadData() {
        getData((DefaultTableModel) tbDataAntrian.getModel());
    }
    private void resetForm() {
        diagnosa.setText("");
        buttonGroup1.clearSelection();
        resep.setText("");
    }
    //insert pemeriksaan
    private void UpdateData(){
        String rujukan;
        if (inap.isSelected()) {
            rujukan = inap.getText();
        } else if (rawatJalan.isSelected()) {
            rujukan = rawatJalan.getText();
        } else {
            rujukan = "";
        }
        String Diagnosa = diagnosa.getText();
        String Resep = resep.getText();
        String IdPeriksa = nomer_antrian.getText();
        if(Diagnosa.isEmpty() ||rujukan.isEmpty() ||Resep.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Isi Semua Kolom", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
            String sql = "UPDATE pemeriksaan SET status='Selesai', rujukan=?, diagnosa=?, resep=? WHERE idPemeriksaan=?";
            try(PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, rujukan);
                st.setString(2, Diagnosa);
                st.setString(3, Resep);
                st.setString(4, IdPeriksa);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success");
                resetForm();
                loadData();
            }
        }catch (Exception e){
            System.out.println("Error updateData! suskes " + e.getMessage());
        }
    }
    
    private void searchData() {
        String KtaKunci = txt_pencarian.getText();
        DefaultTableModel model = (DefaultTableModel) tbDataAntrian.getModel();
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM pemeriksaan WHERE idPemeriksaan LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + KtaKunci + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPeriksa = rs.getString("idPemeriksaan");

                    
                    Object[] rowData = {IdPeriksa};
                    model.addRow(rowData);
                                        
                }
            }
        } catch (SQLException e){
            Logger.getLogger(FormPemeriksaan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void selectData(){
        int row = tbDataAntrian.getSelectedRow();
        nomer_antrian.setText(tbDataAntrian.getValueAt(row, 0).toString());
        diagnosa.setText(tbDataAntrian.getValueAt(row, 2).toString());
        String rujuk = tbDataAntrian.getValueAt(row, 3).toString();
        if(rujuk.equals("Inap")){
            inap.setSelected(true);
        }else if(rujuk.equals("Rawat Jalan")){
            rawatJalan.setSelected(true);
        }
        resep.setText(tbDataAntrian.getValueAt(row, 4).toString());        
    }
    private void tampildata() {    
    String urutan = null;
    try {
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        String sql = "SELECT MAX(idPemeriksaan) AS maxId FROM pemeriksaan WHERE idPemeriksaan LIKE ? AND status = 'Selesai'";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, no + "%");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String maxId = rs.getString("maxId");
                if (maxId != null) {
                    int nomor = Integer.parseInt(maxId.substring(4)) + 1;
                    urutan = no + String.format("%03d", nomor);
                } else {
                    urutan = no + "001";
                }
            } else {
                urutan = no + "001";
            }
        }
        nomer_antrian.setText(urutan);
    } catch (Exception e) {
        System.out.println("Error updateData! " + e.getMessage());
    }
}
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tbDataAntrian.getModel();
        model.addColumn("ID Pemeriksaan");
        model.addColumn("Status");
        model.addColumn("Diagnosa");
        model.addColumn("Rujukan");
        model.addColumn("Resep");
    }
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        try{
            String sql = "SELECT * FROM pemeriksaan WHERE idPemeriksaan";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String IdPeriksa = rs.getString("idPemeriksaan");
                    String Status = rs.getString("status");
                    String Diagnosa = rs.getString("diagnosa");
                    String Rujukan = rs.getString("rujukan");
                    String Resep = rs.getString("resep");

                    Object[] rowData = {IdPeriksa,Status,Diagnosa,Rujukan,Resep};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e){
            System.out.println("Error updateData! " + e.getMessage());
        }
    }
    private void skipToNextId(String currentId) {
        String nextId = null;
        try {
            String sql = "SELECT idPemeriksaan, rujukan, diagnosa, resep FROM pemeriksaan WHERE idPemeriksaan > ? ORDER BY idPemeriksaan ASC LIMIT 1";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, currentId);
                try (ResultSet rs = st.executeQuery()) {
                    if (rs.next()) {
                        nextId = rs.getString("idPemeriksaan");
                        String Diagnosa = rs.getString("diagnosa");
                        diagnosa.setText(Diagnosa);
                        
                        String rujuk = rs.getString("rujukan");
                        if(rujuk == null ){
                            buttonGroup1.clearSelection();
                        }else
                        if(rujuk.equals("Inap")){
                            inap.setSelected(true);
                        }else if(rujuk.equals("Rawat Jalan") ){
                            rawatJalan.setSelected(true);
                        }
                        
                        String Resep = rs.getString("resep");
                        resep.setText(Resep);
                        loadData();
                    }
                }
            }
            if (nextId != null) {
                nomer_antrian.setText(nextId);
            } else {
                System.out.println("No next ID found!");
            }
        } catch (Exception e) {
            System.out.println("Error skipToNextId! " + e.getMessage());
        }
    }
    private void skipToPreviousId(String currentId) {
        String previousId = null;
        try {
            String sql = "SELECT idPemeriksaan, rujukan, diagnosa, resep FROM pemeriksaan WHERE idPemeriksaan < ? ORDER BY idPemeriksaan DESC LIMIT 1";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, currentId);
                try (ResultSet rs = st.executeQuery()) {
                    if (rs.next()) {
                        previousId = rs.getString("idPemeriksaan");
                        String Diagnosa = rs.getString("diagnosa");
                        diagnosa.setText(Diagnosa);
                        
                        String rujuk = rs.getString("rujukan");
                        if(rujuk == null ){
                            buttonGroup1.clearSelection();
                        }else
                        if(rujuk.equals("Inap")){
                            inap.setSelected(true);
                        }else if(rujuk.equals("Rawat Jalan") ){
                            rawatJalan.setSelected(true);
                        }
                        
                        
                        String Resep = rs.getString("resep");
                        resep.setText(Resep);
                    }
                }
            }
            if (previousId != null) {
                nomer_antrian.setText(previousId);
            } else {
                System.out.println("No previous ID found!");
            }
        } catch (Exception e) {
            System.out.println("Error skipToPreviousId! " + e.getMessage());
        }
    }
}
