/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3dan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class koneksiDB {
    private Connection koneksi;
    public static String pathReport = System.getProperty("user.dir") + 
            "/src/report/";
    
    public Connection getKoneksi() {
        return koneksi;
    }
    
    public void koneksiDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            try {
                String url = "jdbc:mysql://localhost:3306/db_kry";
                koneksi = DriverManager.getConnection(url, "root", "");
            } catch (SQLException se) {
                System.out.println("Koneksi Gagal..." + se.getMessage());
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver tidak ditemukan!!!" + cnfe.getMessage());
            System.exit(0);
        }
    }
}
