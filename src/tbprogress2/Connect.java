/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Connection;

/**
 *
 * @author Deny SQP
 */
public class Connect {
    //asdlaksdjlaksjdklsajdsaprivate Connection connect;
    private Connection connect;
    private String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100
    private String port = "3306/"; // Port ini port MySQL
    private String database = "inventaris"; // Ini Database yang akan digunakan
    private String url = jdbc + host + port + database;
    private String username = "root"; // username default mysql
    private String password = "";

    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                try {
                    connect = DriverManager.getConnection(url, username, password);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal : " + se);
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);
                System.exit(0);
            }
        }
        return connect;
    } 
    public static void main(String[] args) throws SQLException {
        Connect connection = new Connect();
        connection.getKoneksi();
    }
}
