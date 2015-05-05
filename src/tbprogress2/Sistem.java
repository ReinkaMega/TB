/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tbprogress2;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Sistem {

    IO inop = new IO();
    RuangKelas kls = new RuangKelas();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
    private double Luas, RasioLuas;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double Luas) {
        this.Luas = Luas;
    }

    public double getRasioLuas() {
        return RasioLuas;
    }

    public void setRasioLuas(double RasioLuas) {
        this.RasioLuas = RasioLuas;
    }

    double HitungLuas() {
        Luas = kls.getPanjangRuang() * kls.getLebarRuang();
        return Luas;
    }

    double HitungRasioLuas() {
        RasioLuas = Luas / kls.getJumlahKursi();
        return RasioLuas;
    }

    double CheckKondisiRuang() {
        inop.InputKondisiRuang();
        kls = inop.getRuangKelas();
        Luas = kls.getPanjangRuang() * kls.getLebarRuang();
        if (kls.getLebarRuang() == kls.getPanjangRuang()) {
            System.out.println("Luas Tidak s");
            ts++;
        } else {
            System.out.println("Luas s");
            s++;
        }

        RasioLuas = Luas / kls.getJumlahKursi();
        System.out.println("Rasio : " + RasioLuas);
        
        if (kls.getJumlahPintu() >= 2) {
            System.out.println("Jumlah Pintu s");
            s++;
        } else {
            System.out.println("Jumlah Pintu Tidak s");
            ts++;
        }
        if (kls.getJumlahJendela() >= 1) {
            System.out.println("Jumlah Jendela s");
            s++;
        } else {
            System.out.println("Jumlah Jendela Tidak s");
            ts++;
        }
        if (ts > s) {
            kondisi = 0;
        } else {
            kondisi = 1;
        }
        
        return kondisi;
    }

    int CheckKondisiSarana() {

        if (kls.getJumlahStopKontak() >= 4) {
            System.out.println("s");
            s++;
        } else {
            System.out.println("Tidak Sesusai");
            ts++;
        }
        
        if (kls.getPosisiStopKontak().equalsIgnoreCase("DekatDosen") || kls.getPosisiStopKontak().equalsIgnoreCase("PojokKelas")) {
            System.out.println("s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (ts > s) {
            kondisi = 0;
        } else {
            kondisi = 1;
        }

        return kondisi;
    }

    int CheckKondisiLingkungan() {
        int ber = 0, kot = 0, kon;
        if (kls.getKondisiLantai().equalsIgnoreCase("bersih")) {
            ber++;
        } else {
            kot++;
        }
        if (ber == 5) {
            System.out.println("Bersih");
            kon = 1;
        } else {
            System.out.println("Kotor");
            kon = 0;
        }
        return kon;
    }

    
    int CheckKondisiKebersihan() {
        int lan = 0, tl = 0, kon;
        if ("Lancar".equalsIgnoreCase(kls.getSirkulasiUdara())) {
            System.out.println("Lancar");
            lan++;
        } else {
            System.out.println("Tidak Lancar");
            tl++;
        }
        if (lan > tl) {
            kon = 1;
        } else {
            kon = 0;
        }

        if (kls.getNilaiPencahayaan() >= 250) {
            if (kls.getNilaiPencahayaan() <= 350) {
                System.out.println("s");
            }
            s++;

        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s > ts) {
            kon = 1;
        } else {
            kon = 0;
        }
        if (kls.getKelembaban() >= 70) {
            if (kls.getKelembaban() <= 80) {
                System.out.println("s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s > ts) {
            kon = 1;
        } else {
            kon = 0;
        }
        if (kls.getSuhu() >= 25) {
            if (kls.getSuhu() <= 35) {
                System.out.println("s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s > ts) {
            kon = 1;
        } else {
            kon = 0;
        }
        return kon;

    }

    int CheckKondisiKenyamanan() {
        int kon, s = 0, ts = 0;
        if ("s".equalsIgnoreCase(kls.getKebisingan())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        if ("s".equalsIgnoreCase(kls.getBau())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        if ("s".equalsIgnoreCase(kls.getKerusakan())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        if ("s".equalsIgnoreCase(kls.getKeausan())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        return kon;
    }

    int CheckKondisiKeamanan() {
        int kon, s = 0, ts = 0;
        if ("s".equalsIgnoreCase(kls.getKekokohan())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        if ("s".equalsIgnoreCase(kls.getKunciPintuJendela())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        if ("s".equalsIgnoreCase(kls.getBahaya())) {
            s++;
        } else {
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        return kon;
    }
}
