/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_model;

import com.mysql.jdbc.Statement;
import invetory_db.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ertit
 */
public class modelLogin {
    private String idUser;
    private String username;
    private String password;
    private String hak_akses;
    
    public modelLogin(String idUser, String username, String password, String hak_akses) {
    this.idUser = idUser;
    this.username = username;
    this.password = password;
    this.hak_akses = hak_akses;
    }
     public modelLogin() {

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHak_akses() {
        return hak_akses;
    }

    public void setHak_akses(String hak_akses) {
        this.hak_akses = hak_akses;
    }
     public modelLogin login(String username, String password) {
        String sql = ("select * from user where username='" + username + "' and password='" + password + "'");

        try {
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {

                return new modelLogin(res.getString("idUser"),
                        res.getString("username"), "",
                        res.getString("hak_akses"));
            }

        } catch (SQLException ex) {
            // Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
        return null;
    }
     public void SimpanDataUser() {
        String sql = ("INSERT INTO user (username, password, hak_akses)"
                + "VALUES ('" + getUsername() + "' , '" + getPassword() + "' , '" + getHak_akses() + "'  ) ");

        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();

            //JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");

        } catch (SQLException ex) {
            // Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
     }
}
