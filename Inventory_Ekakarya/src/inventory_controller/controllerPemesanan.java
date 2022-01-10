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
    private modelPemesanan mPP;
    private viewPemesanan vPP;
    
public controllerPemesanan (viewPemesanan vPP){
        this.vPP = vPP;
    }
    
    public void SimpanTransaksi(){
        mPP = new modelPemesanan();
        mPP.setNamaProduk((String) vPP.getNamaProduk_CB1().getSelectedItem());
        mPP.setHargaSatuan(vPP.getHargaSatuan_TF3().getText());
        mPP.setNamaPelanggan(vPP.getNamaPelanggan_TF7().getText());
        mPP.setBayar(vPP.getBayar_TF5().getText());
        mPP.setKategori(vPP.getKategori_TF2().getText());
        mPP.setJumlahBeli(vPP.getJumlahBeli_TF4().getText());
        mPP.setKembalian(vPP.getKembalian_TF6().getText());
        
        
        mPP.simpantransaksi();
        
    }
}
