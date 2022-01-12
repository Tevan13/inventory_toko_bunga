/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_view;

import inventory_controller.controllerPemesanan;
import invetory_db.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ertit
 */
public class viewPemesanan extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewPemesanan2
     */
    private int MaxStok = 0;
    private DefaultTableModel model;
    private controllerPemesanan cPP;
    public viewPemesanan() {
        initComponents();
        
        model = new DefaultTableModel();
        pemesanan_TB1.setModel(model);
        
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Kategori");
        model.addColumn("Harga Satuan");
        model.addColumn("Jumlah Beli");
        model.addColumn("Total Harga");
        
        AmbilNamaProduk();
        loadData();
        cPP = new controllerPemesanan(this);
    }

    public int getMaxStok() {
        return MaxStok;
    }

    public void setMaxStok(int MaxStok) {
        this.MaxStok = MaxStok;
    }
    

    public JTextField getBayar_TF5() {
        return bayar_TF5;
    }

    public void setBayar_TF5(JTextField bayar_TF5) {
        this.bayar_TF5 = bayar_TF5;
    }

    public JTextField getHargaSatuan_TF3() {
        return kategori_TF4;
    }

    public void setHargaSatuan_TF3(JTextField hargaSatuan_TF3) {
        this.kategori_TF4 = hargaSatuan_TF3;
    }

    public JTextField getIdPemesanan_TF1() {
        return idProduk_TF1;
    }

    public void setIdPemesanan_TF1(JTextField idPemesanan_TF1) {
        this.idProduk_TF1 = idPemesanan_TF1;
    }

    public JTextField getJumlahBeli_TF4() {
        return hargaSatuan_TF5;
    }

    public void setJumlahBeli_TF4(JTextField jumlahBeli_TF4) {
        this.hargaSatuan_TF5 = jumlahBeli_TF4;
    }

    public JTextField getKategori_TF2() {
        return namaPelanggan_TF3;
    }

    public void setKategori_TF2(JTextField kategori_TF2) {
        this.namaPelanggan_TF3 = kategori_TF2;
    }

    public JTextField getKembalian_TF6() {
        return kembalian_TF6;
    }

    public void setKembalian_TF6(JTextField kembalian_TF6) {
        this.kembalian_TF6 = kembalian_TF6;
    }

    public JComboBox getNamaProduk_CB1() {
        return namaProduk_CB1;
    }

    public void setNamaProduk_CB1(JComboBox namaProduk_CB1) {
        this.namaProduk_CB1 = namaProduk_CB1;
    }

    public JTextField getNamaPelanggan_TF7() {
        return namaPelanggan_TF3;
    }

    public void setNamaPelanggan_TF7(JTextField namaPelanggan_TF7) {
        this.namaPelanggan_TF3 = namaPelanggan_TF7;
    }

    public JLabel getTotalHarga_LB1() {
        return totalHarga_LB1;
    }

    public void setTotalHarga_LB1(JLabel totalHarga_LB1) {
        this.totalHarga_LB1 = totalHarga_LB1;
    }
    
    
    public void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stat = conn.createStatement();

            String sql = "SELECT * FROM dtl_pemesanan";
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Object[] hasil = new Object[7];
                hasil[0] = res.getString("idPemesanan");
                hasil[1] = res.getString("namaProduk");
                hasil[2] = res.getString("namaPelanggan");
                hasil[3] = res.getString("kategori");
                hasil[4] = res.getString("hargaProduk");
                hasil[5] = res.getString("jumlahBeli");
                hasil[6] = res.getString("totalHarga");
               
                model.addRow(hasil);
            }
            res.close();
            stat.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
   }
    public void AmbilNamaProduk(){
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stat = conn.createStatement();
            
            String sql = "SELECT distinct namaProduk FROM produk";
            ResultSet res = stat.executeQuery(sql);
            
            while (res.next()){
                Object[] hasil = new Object [1];
                hasil[0] = res.getString("namaProduk");
                
                namaProduk_CB1.addItem(hasil[0]);
            }
        } catch (Exception e) {
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idProduk_TF1 = new javax.swing.JTextField();
        namaPelanggan_TF3 = new javax.swing.JTextField();
        kategori_TF4 = new javax.swing.JTextField();
        hargaSatuan_TF5 = new javax.swing.JTextField();
        tambah_BT2 = new javax.swing.JButton();
        namaProduk_CB1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jumlahBeli_TF6 = new javax.swing.JTextField();
        totalHarga_TF8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        totalHarga_LB1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bayar_TF5 = new javax.swing.JTextField();
        kembalian_TF6 = new javax.swing.JTextField();
        input_BT5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pemesanan_TB1 = new javax.swing.JTable();
        kembali_BT5 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pemesanan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("ID Produk");

        jLabel2.setText("Nama Produk");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Kategori");

        jLabel5.setText("Harga Satuan");

        idProduk_TF1.setEnabled(false);

        namaPelanggan_TF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPelanggan_TF3ActionPerformed(evt);
            }
        });

        kategori_TF4.setEnabled(false);

        hargaSatuan_TF5.setEnabled(false);

        tambah_BT2.setText("Tambah");
        tambah_BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_BT2ActionPerformed(evt);
            }
        });

        namaProduk_CB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Produk" }));
        namaProduk_CB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                namaProduk_CB1ItemStateChanged(evt);
            }
        });

        jLabel10.setText("Jumlah Beli");

        jumlahBeli_TF6.setText("0");
        jumlahBeli_TF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahBeli_TF6ActionPerformed(evt);
            }
        });
        jumlahBeli_TF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahBeli_TF6KeyReleased(evt);
            }
        });

        totalHarga_TF8.setEnabled(false);
        totalHarga_TF8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalHarga_TF8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaProduk_CB1, 0, 166, Short.MAX_VALUE)
                            .addComponent(namaPelanggan_TF3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(kategori_TF4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaSatuan_TF5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalHarga_TF8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahBeli_TF6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(tambah_BT2)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1))
                    .addGap(120, 120, 120)
                    .addComponent(idProduk_TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(130, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tambah_BT2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaProduk_CB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaPelanggan_TF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addComponent(kategori_TF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(hargaSatuan_TF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahBeli_TF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(totalHarga_TF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(idProduk_TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(144, 144, 144)
                    .addComponent(jLabel4)
                    .addGap(47, 47, 47)
                    .addComponent(jLabel5)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        totalHarga_LB1.setText("Rp. 0");

        jLabel7.setText("Bayar");

        jLabel8.setText("Kembalian");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL HARGA");

        bayar_TF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bayar_TF5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bayar_TF5KeyTyped(evt);
            }
        });

        kembalian_TF6.setEditable(false);

        input_BT5.setText("INPUT");
        input_BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_BT5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalHarga_LB1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kembalian_TF6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayar_TF5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(input_BT5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(totalHarga_LB1)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bayar_TF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(kembalian_TF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(input_BT5)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pemesanan_TB1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(pemesanan_TB1);

        kembali_BT5.setText("Kembali");
        kembali_BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_BT5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali_BT5)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali_BT5)
                        .addGap(116, 116, 116))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahBeli_TF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahBeli_TF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahBeli_TF6ActionPerformed

    private void namaProduk_CB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_namaProduk_CB1ItemStateChanged
        // TODO add your handling code here:
        if(namaProduk_CB1.getSelectedItem().equals("Pilih Produk")){
            idProduk_TF1.setText("");
            kategori_TF4.setText("");
            hargaSatuan_TF5.setText("");
            setMaxStok(0);
        }else{
            try {
                Connection conn = koneksi.getKoneksi();
                Statement stat = conn.createStatement();
                
                String sql = "SELECT * FROM produk WHERE namaProduk ='"+namaProduk_CB1.getSelectedItem()+"'";
                ResultSet res = stat.executeQuery(sql);
                
                while (res.next()){
                Object[] hasil = new Object [6];
                hasil[0] = res.getString("idProduk");
                hasil[1] = res.getString("namaProduk");
                hasil[2] = res.getString("stok");
                hasil[3] = res.getString("hargaProduk");
                hasil[4] = res.getString("kategori");
                hasil[5] = res.getString("tanggal_masuk");
                
                idProduk_TF1.setText((String) hasil[0]);
                kategori_TF4.setText((String) hasil[4]);
                hargaSatuan_TF5.setText((String) hasil[3]);
                setMaxStok((int) hasil[2]);
            }
            } catch (Exception e) {
            }
        }
        ;
            
    }//GEN-LAST:event_namaProduk_CB1ItemStateChanged

    private void totalHarga_TF8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalHarga_TF8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHarga_TF8KeyReleased

    private void jumlahBeli_TF6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahBeli_TF6KeyReleased
        // TODO add your handling code here:
        if(jumlahBeli_TF6.getText().equals("")){
            totalHarga_TF8.setText("0");
        }else{
              int hargaSatuan = Integer.parseInt(hargaSatuan_TF5.getText());
              int jumlahBeli = Integer.parseInt(jumlahBeli_TF6.getText());
              totalHarga_TF8.setText((hargaSatuan * jumlahBeli)+"");
        }
    }//GEN-LAST:event_jumlahBeli_TF6KeyReleased

    private void tambah_BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_BT2ActionPerformed
        // TODO add your handling code here:
        int JumlahBeli1 = Integer.parseInt(jumlahBeli_TF6.getText());
        if(JumlahBeli1 > MaxStok){
            JOptionPane.showConfirmDialog(rootPane, "Stok Kurang!");
            
        }else{
            String idProduk = idProduk_TF1.getText();
            String namaProduk = (String) namaProduk_CB1.getSelectedItem();
            String namaPelanggan = namaPelanggan_TF3.getText();
            String kategori = kategori_TF4.getText();
            String hargaSatuan = hargaSatuan_TF5.getText();
            String JumlahBeli = jumlahBeli_TF6.getText();
            String totalHarga = totalHarga_TF8.getText();
        
        
        Object[] hasil = new Object[7];
                hasil[0] = idProduk;
                hasil[1] = namaProduk;
                hasil[2] = namaPelanggan;
                hasil[3] = kategori;
                hasil[4] = hargaSatuan;
                hasil[5] = JumlahBeli;
                hasil[6] = totalHarga;
                
                model.addRow(hasil);
                
                int sum = 0;
                for(int i = 0; i < model.getRowCount(); i++){
                    sum = sum + Integer.parseInt((String) model.getValueAt(i, 6));
                }
                totalHarga_LB1.setText("Rp."+sum+"");
            
        }
        
    }//GEN-LAST:event_tambah_BT2ActionPerformed

    private void bayar_TF5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayar_TF5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_bayar_TF5KeyTyped

    private void bayar_TF5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayar_TF5KeyReleased
        // TODO add your handling code here:
        int TotalHarga = 0;
        int TotalBayar = 0;
        TotalHarga = Integer.parseInt((String)totalHarga_LB1.getText().replace("Rp.", ""));
        if(!bayar_TF5.getText().isEmpty()){
        TotalBayar = Integer.parseInt((String)bayar_TF5.getText());
        }
        
        int Kembalian = TotalBayar - TotalHarga;
        if(Kembalian < 1){
            kembalian_TF6.setText(0+""); 
        }else{
         kembalian_TF6.setText(Kembalian+"");   
        }
    }//GEN-LAST:event_bayar_TF5KeyReleased

    private void input_BT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_BT5ActionPerformed
        // TODO add your handling code here:
       String sql = "INSERT INTO pemesanan (`idPemesanan`, `namaProduk`, `namaPelanggan`, `kategori`, `hargaProduk`, `jumlahBeli`, `totalHarga`, `bayar`, `kembalian`) " 
                     +"VALUES (NULL, '"+namaProduk_CB1.getSelectedItem()+"', '"+namaPelanggan_TF3.getText()+"', '"+kategori_TF4.getText()+"', '"+hargaSatuan_TF5.getText()+"', '"+jumlahBeli_TF6.getText()+"', '"+totalHarga_LB1.getText().replace("Rp.", "")+"', "
                   + "'"+bayar_TF5.getText()+"', '"+kembalian_TF6.getText()+"')";
////                  "INSERT INTO `pemesanan` (`idPemesanan`, `namaProduk`, `kategori`, `hargaProduk`, `jumlahBeli`, `totalHarga`, `bayar`, `kembalian`, `date_create`, `namaPelanggan`)
////                  VALUES (NULL, 'Anggrek', 'Bunga', '2000000', '2', '4000000', '5000000', '1000000', current_timestamp(), 'Sakon');
//        try {
//            int jumlahrow = pemesanan_TB1.getRowCount();
//            Object[][]hasil;
//            hasil = new Object[7][7];
//        
//            for(int x=0; x < jumlahrow; x++){
//                hasil[x][0] = pemesanan_TB1.getValueAt(x, 0).toString();
//                hasil[x][1] = pemesanan_TB1.getValueAt(x, 1).toString();
//                hasil[x][2] = pemesanan_TB1.getValueAt(x, 2).toString();
//                hasil[x][3] = pemesanan_TB1.getValueAt(x, 3).toString();
//                hasil[x][4] = pemesanan_TB1.getValueAt(x, 4).toString();
//                hasil[x][5] = pemesanan_TB1.getValueAt(x, 5).toString();
//                hasil[x][6] = pemesanan_TB1.getValueAt(x, 6).toString();
//                
//                
//               
//                    Connection conn = koneksi.getKoneksi();
//                    Statement stat = conn.createStatement();
//                
//                    String sql2 = "SELECT stok FROM produk WHERE idProduk='"+hasil[x][1]+"' ";
//                    ResultSet res = stat.executeQuery(sql2);
//                    int stok1 = 0;
//                    int stok = 0;
//                    while (res.next()){
//                    Object[]hasil2;  
//                    hasil2 = new Object [1];
//                    hasil2[0] = res.getString("stok");
//                    stok = Integer.parseInt(String.valueOf(hasil2[0])) ;
//                    }
//                    stok1 = stok - Integer.parseInt(String.valueOf(hasil[x][2].toString()));
//                 
//                
//            
//                
//            
//                String sql3 = "INSERT INTO `dtl_pemesanan` (`idPemesanan`, `idProduk`, `namaPelanggan`, `kategori`, `namaProduk`, `hargaProduk`, `jumlahBeli`, `totalHarga`)"
//                + "VALUES ('"+hasil[x][0]+"','"+hasil[x][1]+"','"+hasil[x][2]+"','"+hasil[x][3]+"','"+hasil[x][4]+"','"+hasil[x][5]+"','"+hasil[x][6]+"')" ; 
//        
//                String sql4 = "UPDATE produk SET stok = '"+stok1+"' WHERE idProduk = '"+hasil[x][1]+"' ";        
//                try {
//                    PreparedStatement eksekusi1 = koneksi.getKoneksi().prepareStatement(sql);
//                    eksekusi1.execute();
//                    
//                    PreparedStatement eksekusi2 = koneksi.getKoneksi().prepareStatement(sql3);
//                    eksekusi2.execute();
//            
//                    PreparedStatement eksekusi3 = koneksi.getKoneksi().prepareStatement(sql4);
//                    eksekusi3.execute();
//            
//                     JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
//            
//                } catch (SQLException ex) {
//            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
//                    JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Data gagal \n" +e +sql);
//        }
       
        try {
            Statement stat = koneksi.getKoneksi().createStatement();
            long lastInsertID = stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = stat.getGeneratedKeys();
            if(res.next()){
                sql = "INSERT INTO `dtl_pemesanan` (`idPemesanan`, `idProduk`, `hargaProduk`, `jumlahBeli`, `totalHarga`)VALUES";
                for(int i = 0; i < model.getRowCount(); i++){
                    String postfix = i == 0 ? "" : ",";
                    String idproduk = (String) model.getValueAt(i, 0);
                    String namapelanggan = (String) model.getValueAt(i, 2);
                    String kategori = (String) model.getValueAt(i, 3);
                    String harga = (String) model.getValueAt(i, 4);
                    String jumlah = (String) model.getValueAt(i, 5);
                    String total = (String) model.getValueAt(i, 6);
                    String val = "("+res.getLong(1)+","+idproduk+","+harga+","+jumlah+","+total+")";
                    sql += postfix + val;
                }
                sql += ";";
                System.out.println("Last Inserted ID = "+ res.getLong(1));
                PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
                eksekusi.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil di input!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data gagal di ijnput! \n" + ex + "\n" + sql);
        }
       
//        INSERT INTO `dtl_pemesanan` (`idPemesanan`, `idProduk`, `namaPelanggan`, `kategori`, `namaProduk`, `hargaProduk`, `jumlahBeli`, `totalHarga`) 
//        VALUES ('6', '1', 'Sakon', 'Bunga', 'Anggrek', '2000000', '2', '4000000');
        
    }//GEN-LAST:event_input_BT5ActionPerformed

    private void namaPelanggan_TF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPelanggan_TF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPelanggan_TF3ActionPerformed

    private void kembali_BT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_BT5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kembali_BT5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar_TF5;
    private javax.swing.JTextField hargaSatuan_TF5;
    private javax.swing.JTextField idProduk_TF1;
    private javax.swing.JButton input_BT5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahBeli_TF6;
    private javax.swing.JTextField kategori_TF4;
    private javax.swing.JButton kembali_BT5;
    private javax.swing.JTextField kembalian_TF6;
    private javax.swing.JTextField namaPelanggan_TF3;
    private javax.swing.JComboBox namaProduk_CB1;
    private javax.swing.JTable pemesanan_TB1;
    private javax.swing.JButton tambah_BT2;
    private javax.swing.JLabel totalHarga_LB1;
    private javax.swing.JTextField totalHarga_TF8;
    // End of variables declaration//GEN-END:variables
}