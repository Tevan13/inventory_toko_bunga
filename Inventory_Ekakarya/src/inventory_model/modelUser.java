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
 * @author LENOVO
 */
public class modelUser {
    private String idUser;
    private String Uname;
    private String Upass;
    private String hakAkses;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getUpass() {
        return Upass;
    }

    public void setUpass(String Upass) {
        this.Upass = Upass;
    }

    public String getHakAkses() {
        return hakAkses;
    }

    public void setHakAkses(String hakAkses) {
        this.hakAkses = hakAkses;
    }

    
    
    
    public void SimpanUser() {
        String sql = "INSERT INTO `user`(`idUser`, `username`, `password`, `hak_akses`)"
        + "VALUES (NULL,'"+getUname()+"' , '"+getUpass()+"' , '"+getHakAkses()+"')";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
    }
    
    public void EditUser (){        
        String sql = "UPDATE user SET username = '"+getUname()+"' " 
                + ", password = '"+getUpass()+"' " 
                + ", hak_akses = '"+getHakAkses()+"' " 
                + " WHERE idUser = '"+getIdUser()+"' "; 
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diUpdate ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diUpdate ke dalam Database \n" + ex);
        }
    }
    
    
    
    public void HapusUser (){
        String sql = "DELETE FROM user WHERE idUser = '"+getIdUser()+"' ";
        
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
        
    

    

