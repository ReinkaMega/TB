/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import koneksi.SettingUI;

/**
 *
 * @author Deny SQP
 */
public class Connect {
    //asdlaksdjlaksjdklsajdsaprivate Connection connect;
    public SettingUI config = new SettingUI(null, true);
//    private String PROP_FILE="config.ini";
//    private Properties p2;
    public void konekkeDatabase() {
        config.setServer("localhost");
        config.setUser("root");
        config.setPassword("");
        config.setDatabase("inventaris");
        config.makeConnect();
    }
//    public static Properties loadProperties(String sFile) {
//      Properties p = new Properties();
//      try {
//	FileInputStream in = new FileInputStream(sFile);
//	p.load(in);
//	in.close();
//      } catch (IOException iOException) {
// 	System.out.println(iOException);
//      }
//
//      return p;
//   }
//
//   public static void saveProperties(Properties p, String sFile)
//       throws IOException{
//
//   FileOutputStream out = null;
//   try {
//	out = new FileOutputStream(sFile);
//	p.store(out, "Ini baris komentar\nFile konfigurasi");
//
//   } catch (FileNotFoundException ex) {
//	JOptionPane.showMessageDialog(null, ex.getMessage());
//   } finally {
//        try {
//	   out.close();
//         } catch (IOException ex) {
//	    JOptionPane.showMessageDialog(null, ex.getMessage());
//         }
//    }
//  }
//
//  public void loadID(JLabel Label1){
//        p2 = loadProperties(PROP_FILE);
//	Label1.setText(p2.getProperty("id"));	
//  }
//
//  public void saveID(String id) {
//      try {
//        Properties p = new Properties();
//        
//	p.setProperty("id", id);
//	
//	saveProperties(p, PROP_FILE);
//	} catch (IOException ex) {
//	    JOptionPane.showMessageDialog(null, ex.getMessage());
//	}
//  }
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
