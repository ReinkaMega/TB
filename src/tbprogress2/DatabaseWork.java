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
    con.koneksi();
}
     
     Integer baris;
     Connect con = new Connect();
     JTable Tabelku = new JTable();
     DefaultTableModel DefaultTabelku;
     TableColumn kolom;
     String a, b,c,d,e,f,g;
//     DataAwal DA = new DataAwal();
     
    void Save(JTextField NM,JTextField LK,JTextField JR, JTextField FK) {
        
        String a,b,C,D;
        a = NM.getText();
        b = JR.getText();
        C = LK.getText();
        D = FK.getText();
        
        try {
            if (a.equals("") || C.equals("") || b.equals("") || D.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
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
    void Save(String KodeR,JTextField txtValue1,JTextField txtValue2,JTextField kursi,JTextField pintu,JTextField jendela) {
        
        a = txtValue1.getText();
        b = txtValue2.getText();
        c = kursi.getText();
        d = pintu.getText();
        e = jendela.getText();
        try {
            if (a.equals("") || c.equals("") || b.equals("") || d.equals("") || e.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into kondisi"
                        + "(id ,panjang, lebar, kursi, pintu, jendela) values ('" + KodeR + "','" + a + "','" + b + "','" + c + "','" + d + "','" + e + "')");

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

    void Save(String Kokoh,String Adakunci,String Aman,String KodeR) {
       
        try {
            if (Kokoh.equals("") || Adakunci.equals("") || Aman.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into keamanan"
                        + "(id,kokoh, kunci, bahaya) values ('" +  KodeR+ "','"+  Kokoh+ "','" + Adakunci + "','" + Aman + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
    
    
      void Save(String LB,String DB,String AB,String PB,String JB) {
        //  System.out.println(""+LB+DB+AB);
        try {
            if (LB.equals("") || DB.equals("") || AB.equals("") || PB.equals("") || JB.equals("") ) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into kebersihan"
                        + "(lantai, dinding, atap, pintu, jendela) values ('" +  LB+ "','" + DB + "','" + AB + "','" + PB + "','"+ JB + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
    
      
       void Save(JTextField PBising,JTextField PBau,JTextField PAus,String BBanyak,String RBanyak) {
           
           try {
            if (PBising.equals("") || PBau.equals("") || PAus.equals("") || BBanyak.equals("") || RBanyak.equals("") ) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into kenyamanan"
                        + "(bising, bau, bocor, rusak, aus) values ('" + PBising.getText() + "','" + PBau.getText() + "','" + BBanyak + "','" + RBanyak  + "','"+ PAus.getText() + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
       
       }
      
       
       
         void Save(String KodeR,int PRC,int PRL,int PSR,String SUL) {
             System.out.println(""+SUL);
             System.out.println(""+PSR);
           try {
            if (SUL.equals("") ) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                
            } else {
                
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        "insert into lingkungan"
                        + "(id,udara, cahaya, lembab, suhu) values ('" + KodeR + "','" + SUL + "','" + PRC + "','" + PRL + "','" + PSR +  "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
       
       }
         
         
         
     void kondisiHapus(String id){
          try {
            Statement st = con.config.getConnection().createStatement();
            Statement stk = con.config.getConnection().createStatement();
            Statement st1 = con.config.getConnection().createStatement();
            Statement st2 = con.config.getConnection().createStatement();
            Statement st3 = con.config.getConnection().createStatement();
            Statement st4 = con.config.getConnection().createStatement();
            st.executeUpdate(
                    " delete from "+"identitas"+" where "+"id"+" ='" + id + "'");
            stk.executeUpdate(
                    " delete from "+"keamanan"+" where "+"id"+" ='" + id + "'"); 
            st1.executeUpdate(
                    " delete from "+"kebersihan"+" where "+"id"+" ='" + id + "'"); 
            st2.executeUpdate(
                    " delete from "+"kondisi"+" where "+"id"+" ='" + id + "'"); 
            st3.executeUpdate(
                    " delete from "+"kenyamanan"+" where "+"id"+" ='" + id + "'"); 
            st4.executeUpdate(
                    " delete from "+"lingkungan"+" where "+"id"+" ='" + id + "'"); 
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + ex);
        }
     }
         
     void kondisiHapus(String Tabel,String Arrow,String id) {
        //g = id.getText();
        try {
            Statement st = con.config.getConnection().createStatement();
            st.executeUpdate(
                    " delete from "+Tabel+" where "+Arrow+" ='" + id + "'");
                    
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + ex);
        }
    }
}  
//
