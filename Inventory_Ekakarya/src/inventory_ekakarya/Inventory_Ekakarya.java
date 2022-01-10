/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_ekakarya;

import inventory_controller.controllerLogin;
import inventory_view.viewLogin;
import invetory_db.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ertit
 */
public class Inventory_Ekakarya {
    static controllerLogin cL;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
//        app_utama utama = new app_utama();
//        utama.setVisible(true);
        viewLogin vL = new viewLogin();
        cL = controllerLogin.getInstance(vL);
        cL.getvL().setVisible(true);
  
    }
    
}
