/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_controller;

import inventory_model.modelUser;
import inventory_view.viewUser;
/**
 *
 * @author LENOVO
 */
public class controllerUser {
    private modelUser mU;
    private viewUser vU;
    
    public controllerUser(viewUser vU) {
        this.vU= vU;
    }
    
    public void clear(){
        vU.getiduser().setText("");
        vU.getuname().setText("");
        vU.getupass().setText("");
        vU.gethakakses().setText("");
    }
    
    public void control (){
        vU.getSimpan().setEnabled(true);
        vU.getUbah().setEnabled(false);
        vU.getHapus().setEnabled(false);
        vU.getBatal().setEnabled(true);
    }
    
    public void controldua (){
        vU.getSimpan().setEnabled(false);
        vU.getUbah().setEnabled(true);
        vU.getHapus().setEnabled(true);
        vU.getBatal().setEnabled(true);
    }
    
    public void simpan(){
        mU = new modelUser();
        mU.setUname(vU.getuname().getText());
        mU.setUpass(vU.getupass().getText());
        mU.setHakAkses(vU.gethakakses().getText());
        
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNama()+"\n Nomor HP :"+mP.getNohp()+"\n Jenis Kelamin :"+mP.getJeniskelamin()+"\n Umur :"+mP.getUmur()+"\n Alamat :"+mP.getAlamat());
        mU.SimpanUser();
        clear();
    }
    
    public void update(){
        mU = new modelUser();
        mU.setUname(vU.getuname().getText());
        mU.setUpass(vU.getupass().getText());
        mU.setHakAkses(vU.gethakakses().getText());
        mU.setIdUser(vU.getiduser().getText());
        mU.EditUser();
        clear();
        control();
    }
    
     public void delete(){
        mU = new modelUser();
        mU.setIdUser(vU.getiduser().getText());
        
        mU.HapusUser();
        
        clear();
        control();
    }
    
    
}
