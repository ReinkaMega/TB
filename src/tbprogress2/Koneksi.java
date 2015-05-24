/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbprogress2;

/**
 *
 * @author toshiba
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author phantom
 */
public class Koneksi {
 private Connection connect;
 private String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100
    private String port = "3306/"; // Port ini port MySQL
    private String database = "inventaris"; // Ini Database yang akan digunakan
    private String url = jdbc + host + port + database;
    private String username = "root"; // username default mysql
    private String password = "";
    /**
     * @param args the command line arguments
     */
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
        Koneksi connection = new Koneksi();
        connection.getKoneksi();
    }
}

//       Connection conn = null;
//        
//            String driver = "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/inventaris"; // nama database
//            String user = "root"; // user mysql 
//            String pass = ""; // passowrd mysql
// 
//        try {
//            Class.forName(driver);
//            conn = DriverManager.getConnection(url,user,pass);
//            System.out.println("Koneksi Berhasil");
//        } catch (SQLException e) {
//            System.out.println("SQLException: "+e.getMessage());
//            System.out.println("SQLState: "+e.getSQLState());
//            System.out.println("VendorError: "+e.getErrorCode());
//        }
//    
//    }

