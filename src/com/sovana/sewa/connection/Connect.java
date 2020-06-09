
package com.sovana.sewa.connection;

//Created by Sovana S

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connect {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost/sewaterop"; //url database
            String user="root"; //user database    public static Connection configDB() throws SQLException{

            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database:\n"+e.getMessage(), "Error", 0); //perintah menampilkan error pada koneksi
            System.exit(0);
        }
        return mysqlconfig;
    }    
}
