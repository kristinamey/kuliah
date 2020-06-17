/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3dan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class KaryawanDB {
    String user = "root";
    String pass = "";
    private ResultSet rs = null;
    private Connection cn = null;
    private Statement st = null;
    
    public static String PathReport = System.getProperty("user.dir") + "/src/report/";
    
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi==null) {
            try{
                String url = new String();
                String user = new String ();
                String password = new String ();
                url = "jdbc:mysql://localhost:3306/db_kry";
                user = "root";
                password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi=DriverManager.getConnection(url,user,password);
            } catch (SQLException e ) {
                System.out.println("Error membuat koneksi");
            }
        } return koneksi;
    }
    
    public ResultSet getTampil(String hasil) {
        try {
            rs = st.executeQuery(hasil);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Tampilkan Data");
        }
        return rs;
    }
}
