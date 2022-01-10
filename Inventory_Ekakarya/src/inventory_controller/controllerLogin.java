/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_controller;

import inventory_ekakarya.app_utama;
import inventory_model.modelLogin;
import inventory_view.viewLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author ertit
 */
public class controllerLogin {
    private modelLogin mL;
    public viewLogin vL;
    private static controllerLogin single_instance = null;
    
    public controllerLogin(viewLogin vL) {
        this.mL = new modelLogin();
//        ViewLogin VL = 
        this.vL =vL;
       
    }
    public static controllerLogin getInstance(viewLogin vL) {
        if (single_instance == null) {
            single_instance = new controllerLogin(vL);
        }

        return single_instance;
    }

    public void Login() {
        modelLogin nML=mL.login(vL.getUsername().getText(), vL.getPassword().getText());
        if (nML== null) {
            JOptionPane.showMessageDialog(null, "data login tidak ditemukan");
        } else {
            vL.setVisible(false);
            this.mL=nML;
            app_utama utama = new app_utama();
            utama.setVisible(true);
//            JOptionPane.showMessageDialog(null, mL.getHak_akses());
        }
    }

    public void clear() {
        vL.getUsername().setText("");
        vL.getPassword().setText("");
    }
    
    public void daftar(){
        mL = new modelLogin();
        mL.setUsername(vL.getUsername().getText());
        mL.setPassword(vL.getPassword().getText());

        
        mL.SimpanDataUser();
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNamaPelangganModel()+"\n Nomor Hp :"+mP.getNomorHpModel()+"\n Jenis Kelamin : "+mP.getJenisKelaminModel()+"\n Umur : "+mP.getUmur()+"\n Alamat : "+mP.getAlamat());
        clear();
    }

    public modelLogin getmL() {
        return mL;
    }

    public viewLogin getvL() {
        return vL;
    }
    
}
