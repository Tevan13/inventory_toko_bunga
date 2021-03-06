/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_view;

import invetory_db.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ertit
 */
public class viewLaporanJual extends javax.swing.JFrame {
    private DefaultTableModel model;
    

    /**
     * Creates new form viewLaporanJual
     */
    public viewLaporanJual() {
        initComponents();
        model = new DefaultTableModel();
        laporan_TB1.setModel(model);
        model.addColumn("Id Pemesanan");
        model.addColumn("Nama Produk");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Kategori");
        model.addColumn("Harga Produk");
        model.addColumn("Jumlah Beli");
        model.addColumn("Total Harga");
        model.addColumn("Bayar");
        model.addColumn("Kembalian");
        model.addColumn("Tanggal");
        
//        model = new DefaultTableModel();
//        laporan_TB1.setModel(model);
//        model.addColumn("idPemesanan");
//        model.addColumn("namaProduk");
//        model.addColumn("kategori");
//        model.addColumn("hargaProduk");
//        model.addColumn("jumlahBeli");
//        model.addColumn("totalHarga");
//        model.addColumn("bayar");
//        model.addColumn("kembalian");
//        model.addColumn("date_create");
//        
//        
//    }
//    private void tampilDataLaporan(){
//        
//        model.getDataVector().removeAllElements();
//        model.fireTableDataChanged();
//        
//        String sql = "SELECT * FROM pemesanan where date_create between ? and ?";
//        
//        try {        
//            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
//            ResultSet res = stat.executeQuery(sql);
//            
//            while(res.next()){
//                //mengambil hasil query variabel sql
//                Object[] hasil = new Object[10];
//                hasil[0] = res.getString("idPemesanan");
//                hasil[1] = res.getString("namaProduk");
//                hasil[2] = res.getString("namaPelanggan");
//                hasil[3] = res.getString("kategori");
//                hasil[4] = res.getString("hargaProduk");
//                hasil[5] = res.getString("jumlahBeli");
//                hasil[6] = res.getString("totalHarga");
//                hasil[7] = res.getString("bayar");
//                hasil[8] = res.getString("kembalian");
//                hasil[9] = res.getString("date_create");
//                
//            }  
//            } catch(Exception e){
//                Logger.getLogger(viewLaporanJual.class.getName()).log(Level.SEVERE, null, e);
//            }
//                    
//                    }
//    private void DateCreate(){
//        String fromdate = ((JTextField)fromDate_DC1.getDateEditor().getUiComponent()).getText();
//        String todate = ((JTextField)toDate_DC2.getDateEditor().getUiComponent()).getText();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show_BT1 = new javax.swing.JButton();
        fromDate_DC1 = new com.toedter.calendar.JDateChooser();
        toDate_DC2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        laporan_TB1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laporan Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Date", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 18))); // NOI18N

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        show_BT1.setText("Show");
        show_BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_BT1ActionPerformed(evt);
            }
        });

        fromDate_DC1.setDateFormatString("yyyy-MM-dd");

        toDate_DC2.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromDate_DC1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toDate_DC2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(show_BT1)
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(fromDate_DC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDate_DC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(show_BT1)
                .addContainerGap())
        );

        laporan_TB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(laporan_TB1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_BT1ActionPerformed
        // TODO add your handling code here:
        Date date1 = fromDate_DC1.getDate();
        Date date2 = toDate_DC2.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String sql = "SELECT * FROM `pemesanan` WHERE `date_create` BETWEEN '" + sdf.format(date1) + "' AND '" + sdf.format(date2) + "'";
//        SELECT * FROM `pemesanan` WHERE `date_create` BETWEEN '2022-01-11 08:39:34.000000' AND '2022-01-12 08:39:34.000000'
        
        System.out.print(sql);
        try {

            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Object[] hasil = new Object[10];
                hasil[0] = res.getString("idPemesanan");
                hasil[1] = res.getString("namaProduk");
                hasil[2] = res.getString("namaPelanggan");
                hasil[3] = res.getString("kategori");
                hasil[4] = res.getString("hargaProduk");
                hasil[5] = res.getString("jumlahBeli");
                hasil[6] = res.getString("totalHarga");
                hasil[7] = res.getString("bayar");
                hasil[8] = res.getString("kembalian");
                hasil[9] = res.getString("date_create");

                model.addRow(hasil);
            }
            JOptionPane.showMessageDialog(null, "Suskes menampilkan data ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak dapat menampilkan data " + ex);
//            Logger.getLogger(ViewPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
//        java.util.Date dt1,dt2;     
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        dt1=fromDate_DC1.getDate();
//        dt2=toDate_DC2.getDate();
//        String strdtver1=(String) sdf.format(fromDate_DC1.getDate());
//        String strdtver2=(String) sdf.format(toDate_DC2.getDate());
//        
//            try (
//                    Connection conn = koneksi.getKoneksi();
//                    Statement stat = conn.createStatement();
//                    PreparedStatement statement =
//                    conn.prepareStatement("insert into pemesanan values  idPemesanan, namaProduk, namaPelanggan, kategori, hargaProduk, jumlahBeli, totalHarga, bayar, kembalian, date_create")) {
//
//                    statement.setString(1, n);
//                    statement.setDate(2, dt1);
//                    statement.setDate(3, dt2);
//                    statement.setString(4, i);
//
//                    statement.executeUpdate();
//                }catch(Exception e) {
//                JOptionPane.showMessageDialog(this,e.getMessage());
//  }

        
//        try {
//            Connection conn = koneksi.getKoneksi();
//            Statement stat = conn.createStatement();
//
//            String sql = "SELECT * FROM pemesanan where date_create between ? and ?";
//            ResultSet res = stat.executeQuery(sql);
//
//            while (res.next()) {
//                Object[] hasil = new Object[10];
//                hasil[0] = res.getString("idPemesanan");
//                hasil[1] = res.getString("namaProduk");
//                hasil[2] = res.getString("namaPelanggan");
//                hasil[3] = res.getString("kategori");
//                hasil[4] = res.getString("hargaProduk");
//                hasil[5] = res.getString("jumlahBeli");
//                hasil[6] = res.getString("totalHarga");
//                hasil[7] = res.getString("bayar");
//                hasil[8] = res.getString("kembalian");
//                hasil[9] = res.getString("date_create");
//                
//                
//                
//                res.close();
//                stat.close();
//            }
//            } catch (Exception e){
//            }
//        }
//        String fromdate = ((JTextField)fromDate_DC1.getDateEditor().getUiComponent()).getText();
//        String todate = ((JTextField)toDate_DC2.getDateEditor().getUiComponent()).getText();
//        Connection con = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        try {
//            
//          con = koneksi.getKoneksi();
//          String sql = "select * from pemesanan where date_create between ? and ?";
//          
//        pst = con.prepareStatement(sql);
//        pst.setString(1, fromdate);
//        pst.setString(2, todate);
//        rs = pst.executeQuery();
//        laporan_TB1.setModel(DbUtils.resultSetToTableModel(rs));
//           } catch (Exception e) {
//               e.printStackTrace();
//           }
               
        
        
    }//GEN-LAST:event_show_BT1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewLaporanJual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLaporanJual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLaporanJual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLaporanJual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLaporanJual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDate_DC1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable laporan_TB1;
    private javax.swing.JButton show_BT1;
    private com.toedter.calendar.JDateChooser toDate_DC2;
    // End of variables declaration//GEN-END:variables
}
