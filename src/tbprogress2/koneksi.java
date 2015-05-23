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
public class koneksi {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
       Connection conn = null;
        
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/inventaris"; // nama database
            String user = "root"; // user mysql 
            String pass = ""; // passowrd mysql
 
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
    
    }
}
