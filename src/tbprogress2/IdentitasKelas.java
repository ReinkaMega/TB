/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



/**
 *
 * @author Reinka
 */
public class IdentitasKelas extends JFrame implements ActionListener{
    private Connect con = new Connect();
//    private JLabel lbl[];
//    private JTextField txt[];
//    private JButton btn[];
    JLabel lbl[] = new JLabel[4];
    JTextField txt[] = new JTextField[4];
    JButton btn[] = new JButton[6];
    JTable tabel = new JTable();
    private DefaultTableModel DefaultTabelku;
    private TableColumn kolom;
    public IdentitasKelas(){
           super("IDENTITAS RUANG KELAS");
        lbl[0] = new JLabel("Nama Ruang");
        lbl[0].setBounds(15, 30, 160, 20);
        lbl[1] = new JLabel("Lokasi Ruang");
        lbl[1].setBounds(15, 60, 160, 20);
        lbl[2] = new JLabel("Fakultas");
        lbl[2].setBounds(15, 90, 160, 20);
        lbl[3] = new JLabel("Program Studi");
        lbl[3].setBounds(15, 120, 160, 20);
        txt[0] = new JTextField();
        txt[0].setBounds(150, 30, 250, 20);
        txt[1] = new JTextField();
        txt[1].setBounds(150, 60, 250, 20);
        txt[2] = new JTextField();
        txt[2].setBounds(150, 90, 250, 20);
        txt[3] = new JTextField();
        txt[3].setBounds(150, 120, 250, 20);
        btn[0] = new JButton("ADD");
        btn[0].setBounds(15, 160, 60, 20);
        btn[0].addActionListener(this);
        btn[1] = new JButton("SAVE");
        btn[1].setBounds(80, 160, 70, 20);
        btn[1].addActionListener(this);
        btn[2] = new JButton("EDIT");
        btn[2].setBounds(155, 160, 60, 20);
        btn[2].addActionListener(this);
        btn[3] = new JButton("DELETE");
        btn[3].setBounds(220, 160, 80, 20);
        btn[4] = new JButton("OK");
        btn[4].setBounds(305, 160, 55, 20);
        btn[2].addActionListener(this);
        btn[5] = new JButton("NEXT");
        btn[5].setBounds(365, 160, 70, 20);
        tabel = new JTable();
        tabel.setBounds(15, 200, 300, 100);
        //tabel.setBorder();
          tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"aa", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Lokasi", "Prodi", "Fakultas", "ID"}
        ));
//        tabel.setModel(DefaultTabelku);
//              try {
//            Object[] field = {"No", "Nama", "Lokasi", "Prodi", "Fakultas","ID"};
//            DefaultTabelku = new DefaultTableModel(null, field){
//                @Override
//                public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//   };
//            
//            tabel.setModel(DefaultTabelku);
//
//            String sql = "Select * from identitas";
//            Statement st = con.config.getConnection().createStatement();
//            ResultSet set = st.executeQuery(sql);
//
//            int no = 0;
//            while (set.next()) {
//                no++;
//                String kolom1 = String.valueOf(no).toString();
//                String kolom2 = set.getString("nama");
//                String kolom3 = set.getString("lokasi");
//                String kolom4 = set.getString("prodi");
//                String kolom5 = set.getString("fakultas");
//                String kolom6 = set.getString("id");
//                String[] data = {kolom1, kolom2, kolom3, kolom4, kolom5,kolom6};
//                DefaultTabelku.addRow(data);
//            }
//
//            tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
//            
//            kolom = tabel.getColumnModel().getColumn(0);
//            kolom.setPreferredWidth(40);
//            kolom = tabel.getColumnModel().getColumn(1);
//            kolom.setPreferredWidth(145);
//            kolom = tabel.getColumnModel().getColumn(2);
//            kolom.setPreferredWidth(217);
//            kolom = tabel.getColumnModel().getColumn(3);
//            kolom.setPreferredWidth(220);
//            kolom = tabel.getColumnModel().getColumn(4);
//            kolom.setPreferredWidth(240);
//            kolom = tabel.getColumnModel().getColumn(5);
//            kolom.setPreferredWidth(0);
//            kolom.setMinWidth(0);
//            kolom.setMaxWidth(0);
//            kolom.setWidth(0);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, "Koneksi gagal: " + e);
//       }
//        
        
        
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder("Data Ruang"));
        panel.add(lbl[0]);
        panel.add(txt[0]);
        panel.add(lbl[1]);
        panel.add(txt[1]);
        panel.add(lbl[2]);
        panel.add(txt[2]);
        panel.add(lbl[3]);
        panel.add(txt[3]);
        panel.add(btn[0]);
        panel.add(btn[1]);
        panel.add(btn[2]);
        panel.add(btn[3]);
        panel.add(btn[4]);
        panel.add(btn[5]);
        panel.add(tabel);
        
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pack();
        setSize(450, 700);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        txt[0].setEditable(false);
        txt[1].setEditable(false);
        txt[2].setEditable(false);
        txt[3].setEditable(false);
        btn[0].setVisible(true);
        btn[1].setVisible(false);
        btn[2].setVisible(false);
        btn[3].setVisible(false);
        btn[4].setVisible(false);
        btn[5].setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btn[0]){
        txt[0].setEditable(true);
        txt[1].setEditable(true);
        txt[2].setEditable(true);
        txt[3].setEditable(true);
        btn[0].setVisible(false);
        btn[1].setVisible(true);
        btn[2].setVisible(false);
        btn[3].setVisible(false);
       }
       if(e.getSource() == btn[1]){
//        da.Save(NM, LK, JR, FK);
//        tampilDataKeTabel();
        btn[0].setVisible(true);
        btn[1].setVisible(false);
        btn[5].setVisible(true);
        btn[2].setVisible(true);
        }
        if(e.getSource() == btn[2]){
        btn[4].setVisible(true);
        txt[0].setEditable(true);
        txt[1].setEditable(true);
        txt[2].setEditable(true);
        txt[3].setEditable(true);
        btn[0].setVisible(false);
        btn[2].setVisible(false);
        btn[3].setVisible(false);
        btn[5].setVisible(false);//??kliktbl
    }
        if(e.getSource() == btn[4]){
         btn[4].setVisible(false);//??diedit
        btn[2].setVisible(false);
        btn[0].setVisible(true);
        btn[3].setVisible(false);
        btn[5].setVisible(false);
        //clearTEXT();
       txt[0].setEditable(false);
        txt[1].setEditable(false);
        txt[2].setEditable(false);
        txt[3].setEditable(false);
        }
    
}
    
    
    //private void tableModel(JTable tabel) {
  
//}
}

 

