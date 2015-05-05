/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tbprogress2;
/**
 *
 * @author toshiba
 */
public class TBProgress2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sistem kk = new Sistem();
        IO ll = new IO();
        kk.inputIdentitasKelas();
        kk.InputKondisiRuang();
        kk.CheckKondisiRuang();
        kk.tampil();
    }
}
