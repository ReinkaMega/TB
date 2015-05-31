/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB_Java;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Deny SQP
 */
public class KondisiLingkungan extends javax.swing.JFrame {

    /**
     * Creates new form KondisiLingkunga
     */
    RuangKelas kls = new RuangKelas();
    int s = 0, ts = 0, kondisi;
    public KondisiLingkungan() {
        initComponents();
        setResizable(false);
        PC.setEditable(false);
        PL.setEditable(false);
        PS.setEditable(false);
        PRC.setEditable(false);
        PRL.setEditable(false);
        PSR.setEditable(false);
        nyeret1();
        nyeret2();
        nyeret3();
    }
public void nyeret1(){
                PC.setEditable(false);	
	        PC.setText(String.valueOf(SC.getValue()));	
	        SC.setMinorTickSpacing(5);	
	        SC.setMajorTickSpacing(20);	
	        SC.setPaintTicks(true);	
	        SC.setLabelTable(SC.getLabelTable());	
	        SC.setPaintLabels(true);
                SC.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PC.setText ( String.valueOf(SC.getValue()) );
                            int PBs = Integer.parseInt(PC.getText());
                            if(PBs>=80){
                                PRC.setText("Sangat Terang");
                            }
                            else if(PBs<80&&PBs>=60){
                                PRC.setText("Terang");
                            }
                            else if(PBs<60&&PBs>=30){
                                PRC.setText("Redup");
                            }
                            else if(PBs<30&&PBs>=10){
                                PRC.setText("Remang Remang");
                            }
                            else if(PBs<10){
                                PRC.setText("Gelap");
                            }
                        }	
	            }
	        );
    }
     public void nyeret2(){
                PL.setEditable(false);	
	        PL.setText(String.valueOf(SL.getValue()));	
	        SL.setMinorTickSpacing(5);	
	        SL.setMajorTickSpacing(20);	
	        SL.setPaintTicks(true);	
	        SL.setLabelTable(SL.getLabelTable());	
	        SL.setPaintLabels(true);
	        SL.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PL.setText ( String.valueOf(SL.getValue()) );	
                            int PBa = Integer.parseInt(PL.getText());
                            if(PBa>=80){
                                PRL.setText("Basah");
                            }
                            else if(PBa<80&&PBa>=70){
                                PRL.setText("Lembab");
                            }
                            else if(PBa<70&&PBa>=30){
                                PRL.setText("Biasa");
                            }
                            else if(PBa<30&&PBa>=10){
                                PRL.setText("Agak Kering");
                            }
                            else if(PBa<10){
                                PRL.setText("Kering");
                            }
                        }	
	            }
	        );
     }
     public void nyeret3(){
         PS.setEditable(false);	
	        PS.setText(String.valueOf(SS.getValue()));	
	        SS.setMinorTickSpacing(5);	
	        SS.setMajorTickSpacing(20);	
	        SS.setPaintTicks(true);	
	        SS.setLabelTable(SS.getLabelTable());	
	        SS.setPaintLabels(true);
	        SS.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PS.setText ( String.valueOf(SS.getValue()) );	
                            int PA = Integer.parseInt(PS.getText());
                            if(PA>=80){
                                PSR.setText("Mendidih");
                            }
                            else if(PA<80&&PA>=60){
                                PSR.setText("Sangat Panas");
                            }
                            else if(PA<60&&PA>35){
                                PSR.setText("Panas");
                            }
                            else if(PA<=35&&PA>=25){
                                PSR.setText("Hangat");
                            }
                            else if(PA<25&&PA>=10){
                                PSR.setText("Dingin");
                            }
                            else if(PA<10){
                                PSR.setText("Beku");
                            }
                        }	
	            }
	        );
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SC = new javax.swing.JSlider();
        SL = new javax.swing.JSlider();
        SS = new javax.swing.JSlider();
        PRL = new javax.swing.JTextField();
        PRC = new javax.swing.JTextField();
        PC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SUT = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        SUL = new javax.swing.JCheckBox();
        LJ = new javax.swing.JButton();
        DEL = new javax.swing.JButton();
        PSR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("LINGKUNGAN RUANG KELAS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nilai Pencahayaan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kelembaban");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Suhu");

        PRL.setText("Parameter");

        PRC.setText("Parameter");

        PC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("%");

        PL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PL.setText(" ");
        PL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("%");

        PS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("%");

        SUT.setText("Terhambat");
        SUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUTActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Sirkulasi Udara");

        SUL.setText("Lancar");
        SUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SULActionPerformed(evt);
            }
        });

        LJ.setText("Selanjutnya");
        LJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LJActionPerformed(evt);
            }
        });

        DEL.setText("Hapus");

        PSR.setText("Parameter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SUL)
                        .addGap(34, 34, 34)
                        .addComponent(SUT))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PC)
                                .addComponent(PL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addComponent(PRC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PRL, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel6))
                    .addComponent(PSR, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(DEL)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LJ)
                        .addGap(112, 112, 112))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(PSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SUL)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)))
                    .addComponent(SUT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LJ)
                    .addComponent(DEL))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLActionPerformed

    }//GEN-LAST:event_PLActionPerformed

    private void SUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUTActionPerformed
        SUL.setSelected(false);
        
    }//GEN-LAST:event_SUTActionPerformed

    private void SULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SULActionPerformed
        SUT.setSelected(false);
        
    }//GEN-LAST:event_SULActionPerformed

    private void LJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LJActionPerformed
        IO x = new IO(SUL,SUT,PC,PL,PS);
        Sistem n = new Sistem();
        kls = x.getRuangKelas();
        x.output(kls.getSirkulasiUdara(), kls.getNilaiPencahayaan(), kls.getKelembaban(),kls.getSuhu());
        System.out.println("==============Analisis==================");
        if ("Lancar".equalsIgnoreCase(kls.getSirkulasiUdara())) {
            System.out.println("Sirkulasi Udara : Sesuai");
            s++;
        } else {
            System.out.println("Sirkulasi Udara : Tidak Sesuai");
            ts++;
        }
        if (kls.getNilaiPencahayaan() >= 60) {
            if (kls.getNilaiPencahayaan() < 80) {
                System.out.println("Nilai Pencahayaan : Sesuai");
            }
            s++;
        } else {
            System.out.println("Nilai Pencahayaan : Tidak Sesuai");
            ts++;
        }
        if (kls.getKelembaban() >= 70) {
            if (kls.getKelembaban() <= 80) {
                System.out.println("Kelembaban : Sesuai");
            }
            s++;
        } else {
            System.out.println("Kelembaban : Tidak Sesuai");
            ts++;
        }
        
        if (kls.getSuhu() >= 25) {
            if (kls.getSuhu() <= 35) {
                System.out.println("Suhu : Sesuai");
            }
            s++;
        } else {
            System.out.println("Suhu : Tidak Sesuai");
            ts++;
        }
        n.persentaseKondisiLingkungan(s);
        dispose();
    }//GEN-LAST:event_LJActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KondisiLingkungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEL;
    private javax.swing.JButton LJ;
    private javax.swing.JTextField PC;
    private javax.swing.JTextField PL;
    private javax.swing.JTextField PRC;
    private javax.swing.JTextField PRL;
    private javax.swing.JTextField PS;
    private javax.swing.JTextField PSR;
    private javax.swing.JSlider SC;
    private javax.swing.JSlider SL;
    private javax.swing.JSlider SS;
    private javax.swing.JCheckBox SUL;
    private javax.swing.JCheckBox SUT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
