/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invetory_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ertit
 */
public class koneksi {
    private static Connection conn;
    public static Connection getKoneksi(){
        if(conn == null){
          try{
              String url = "jdbc:mysql://localhost/invent_bunga";
              String user = "root";
              String password = "";
              
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
              
              conn = DriverManager.getConnection(url, user, password);
          }catch(SQLException t){
              System.out.println("Error Membuat Koneksi");
          }  
        }
        return conn;

    }
    public static void main(String args[]) throws SQLException{
        if(getKoneksi().equals(conn)){
            System.out.print("sukses terkoneksi");
        }
   
    }
}