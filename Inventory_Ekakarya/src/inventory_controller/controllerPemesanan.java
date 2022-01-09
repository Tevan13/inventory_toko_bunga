/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_controller;

import inventory_model.modelPemesanan;
import inventory_view.viewPemesanan;

/**
 *
 * @author ertit
 */
public class controllerPemesanan {
    private modelPemesanan mP;
    private viewPemesanan vP;
    
public controllerPemesanan (viewPemesanan vP){
        this.vP = vP;
    }
    
    public void SimpanTransaksi(){
        mP = new modelPemesanan();
        mP.setNamaProduk((String) vP.getNamaProduk_CB1().getSelectedItem());
        mP.setHargaSatuan(vP.getHargaSatuan_TF3().getText());
        mP.setBayar(vP.getBayar_TF5().getText());
        mP.setKategori(vP.getKategori_TF2().getText());
        mP.setJumlahBeli(vP.getJumlahBeli_TF4().getText());
        mP.setKembalian(vP.getKembalian_TF6().getText());
        
        
        mP.simpantransaksi();
        
    }
}
