/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_controller;

import inventory_model.modelProduk;
import inventory_view.viewProduk;

/**
 *
 * @author ertit
 */
public class controllerProduk {
    private modelProduk mP;
    private viewProduk vP;
    
    public controllerProduk(viewProduk vP) {
        this.vP= vP;
    }
    
    public void clear(){
        vP.getIdProduk().setText("");
        vP.getNamaProduk().setText("");
        vP.getKategori().setText("");
        vP.getHarga().setText("");
        vP.getStok().setText("");
    }
    
    public void kontrol (){
        vP.getSimpan().setEnabled(true);
        vP.getUbah().setEnabled(false);
        vP.getHapus().setEnabled(false);
        vP.getBatal().setEnabled(true);
    }
    
    public void kontroldua (){
        vP.getSimpan().setEnabled(false);
        vP.getUbah().setEnabled(true);
        vP.getHapus().setEnabled(true);
        vP.getBatal().setEnabled(true);
    }
    
    public void simpan(){
        mP = new modelProduk();
        mP.setNamaProduk(vP.getNamaProduk().getText());
        mP.setKategori(vP.getKategori().getText());
        mP.setHargaSatuan(vP.getHarga().getText());
        mP.setStok(vP.getStok().getText());
        
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNama()+"\n Nomor HP :"+mP.getNohp()+"\n Jenis Kelamin :"+mP.getJeniskelamin()+"\n Umur :"+mP.getUmur()+"\n Alamat :"+mP.getAlamat());
        mP.SimpanProduk();
        clear();
    }
    
    public void update(){
        mP = new modelProduk();
        mP.setNamaProduk(vP.getNamaProduk().getText());
        mP.setKategori(vP.getKategori().getText());
        mP.setHargaSatuan(vP.getHarga().getText());
        mP.setStok(vP.getStok().getText());
        mP.setIdProduk(vP.getIdProduk().getText());
        mP.EditProduk();
        clear();
        kontrol();
    }
    
    public void delete(){
        mP = new modelProduk();
        mP.setIdProduk(vP.getIdProduk().getText());
        
        mP.HapusProduk();
        
        clear();
        kontrol();
    }
    
}
