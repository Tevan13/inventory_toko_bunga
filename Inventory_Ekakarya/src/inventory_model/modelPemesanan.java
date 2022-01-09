/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_model;

import invetory_db.koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ertit
 */
public class modelPemesanan {
    private String idPemesanan;
    private String namaProduk;
    private String kategori;
    private String hargaSatuan;
    private String jumlahBeli;
    private String namaPelanggan;
    private String totalHarga;
    private String bayar;
    private String kembalian;
    private String idDetailPemesanan;

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(String jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getBayar() {
        return bayar;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }

    public String getIdDetailPemesanan() {
        return idDetailPemesanan;
    }

    public void setIdDetailPemesanan(String idDetailPemesanan) {
        this.idDetailPemesanan = idDetailPemesanan;
    }
    
    
    public void simpantransaksi(){
        String sql = "INSERT INTO pemesanan (idPemesanan,namaPelanggan,jumlahBeli,bayar,kembalian,totalHarga) "
                    + " VALUES ('"+getIdPemesanan()+"' , '"+getNamaPelanggan()+"' , '"+getBayar()+"' , '"+getKembalian()+"' , '"+getTotalHarga()+"' ) " ; 
    
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Pemesanan Berhasil DiSimpan");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
        
    }
}
