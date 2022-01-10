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
public class modelProduk {
    private String idProduk;
    private String namaProduk;
    private String kategori;
    private String hargaSatuan;
    private String stok;

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
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

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    public void SimpanProduk (){
        String sql = "INSERT INTO `produk`(`idProduk`, `namaProduk`, `stok`, `hargaProduk`, `kategori`, `tanggal_masuk`)" 
                + "VALUES (NULL,'"+getNamaProduk()+"' , '"+getStok()+"' , '"+getHargaSatuan()+"' , '"+getKategori()+"' , current_timestamp())";
   
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
    }
    public void EditProduk (){        
        String sql = "UPDATE produk SET namaProduk = '"+getNamaProduk()+"' " 
                + ", kategori = '"+getKategori()+"' " 
                + ", hargaProduk = '"+getHargaSatuan()+"' " 
                + ", stok = '"+getStok()+"' " 
                + " WHERE idProduk = '"+getIdProduk()+"' "; 
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diUpdate ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diUpdate ke dalam Database \n" + ex);
        }
    }
    
    public void HapusProduk (){
        String sql = "DELETE FROM produk WHERE idProduk = '"+getIdProduk()+"' ";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus dari Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus dari Database \n" + ex);
        }
    }
    
}
