/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Deny SQP
 */
public class DatabaseWork {

DatabaseWork(){
    aplikasi_inventaris.konekkeDatabase();
}
     
     Integer baris;
     Connect aplikasi_inventaris = new Connect();
     JTable Tabelku = new JTable();
     DefaultTableModel DefaultTabelku;
     TableColumn kolom;
     String a, b,c,d,e,f,g;
//     DataAwal DA = new DataAwal();
     
    void kondisiSave(JTextField NM,JTextField LK,JTextField JR, JTextField FK) {
        
        String a,b,C,D;
        a = NM.getText();
        b = JR.getText();
        C = LK.getText();
        D = FK.getText();
        
        try {
            if (a.equals("") || C.equals("") || b.equals("") || D.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = aplikasi_inventaris.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into identitas"
                        + "(nama, lokasi, prodi, fakultas) values ('" + a + "','" + C + "','" + b + "','" + D + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
        NM.setEditable(false);
        FK.setEditable(false);
        LK.setEditable(false);
        JR.setEditable(false);
    }
     void kondisiHapus(String id) {
        //g = id.getText();
        try {
            Statement st = aplikasi_inventaris.config.getConnection().createStatement();
            st.executeUpdate(
                    " delete from identitas where id ='" + id + "'");
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + ex);
        }
    }
    void kondisiSave(JTextField txtValue1,JTextField txtValue2,JTextField kursi,JTextField pintu,JTextField jendela) {
        
        a = txtValue1.getText();
        b = txtValue2.getText();
        c = kursi.getText();
        d = pintu.getText();
        e = jendela.getText();
        try {
            if (a.equals("") || c.equals("") || b.equals("") || d.equals("") || e.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = aplikasi_inventaris.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into kondisi"
                        + "(panjang, lebar, kursi, pintu, jendela) values ('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
        txtValue1.setEditable(false);
        txtValue2.setEditable(false);
        kursi.setEditable(false);
        pintu.setEditable(false);
        jendela.setEditable(false);
    }
     void kondisiHapus(JTextField panjang,JTextField lebar,JTextField kursi,JTextField pintu,JTextField jendela) {
        a = panjang.getText();
        b = lebar.getText();
        c = kursi.getText();
        d = pintu.getText();
        e = jendela.getText();
        try {
            Statement st = aplikasi_inventaris.config.getConnection().createStatement();
            st.executeUpdate(
                    " delete from kondisi where panjang ='" + a +"'"+"and"+" lebar ='"+b+"'");
//                    +"and"+" lebar ='"+c+"'"+"and"+" lebar ='"+d+"'"+"and"+" lebar ='"+e+"'");
//            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + ex);
        }
    }
}
//