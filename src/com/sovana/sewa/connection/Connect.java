package com.sovana.sewa.connection;

//Created by Sovana S
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {

    private static Connection mysqlconfig;

//    public static void startMysql() {
//        JOptionPane opt = new JOptionPane();
//        opt.setMessage("Memulai MySQL server...");
//        opt.setMessageType(1);
//        opt.setVisible(true);
//        
//                
//        String command = "C:\\xampp\\mysql\\bin\\mysqld.exe";
//        EventQueue.invokeLater(() -> {
//            try {
//                Process process = Runtime.getRuntime().exec(command);
//                if (process.isAlive()) {
//                    JOptionPane.showMessageDialog(null, "MySQL Server sudah berjalan.", "Info", 1);
//                }
//            } catch (HeadlessException | IOException e) {
//                JOptionPane.showMessageDialog(null, "Terjadi error:\n" + e.getMessage(), "Error", 0);
//            }
//        });
//        opt.setVisible(false);
//
//    }

    public static Connection configDB() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/sewaterop"; //url database
            String user = "root"; //user database    public static Connection configDB() throws SQLException{

            String pass = ""; //password database
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database.\nPenyebab:\n" + e.getMessage(), "Error", 0); //perintah menampilkan error pada koneksi
            System.exit(0);
        }
        return mysqlconfig;
    }
}
