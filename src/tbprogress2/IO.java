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
public class IO {
    
    
        
    
    
    Scanner in = new Scanner(System.in);
    RuangKelas rk;
     
    
    void inputIdentitasKelas(){
        RuangKelas lo = new RuangKelas();
        System.out.println("Masukkan Nama Ruang : ");
        lo.setNamaRuang(in.next());
        System.out.println("Masukkan Lokasi Ruang : ");
        lo.setLokasiRuang(in.next());
        System.out.println("Masukkan Fakultas : ");
        lo.setFakultas(in.next());
        System.out.println("Masukkan Program Studi : ");
        lo.setProgramStudi(in.next());
        //System.out.println("Masukkan Pilih Progam Studi : ");
        //System.out.println("Masukkan Pilih Fakultas : ");
        rk = new RuangKelas(lo.getNamaRuang(),lo.getLokasiRuang(),lo.getFakultas(),lo.getProgramStudi());
        }
   
    public RuangKelas getRuangKelas(){
    return rk;
    }
    
    void InputKondisiRuang(){
        RuangKelas lo = new RuangKelas();
        System.out.println("Masukkan Panjang Ruang : ");
        lo.setPanjangRuang(in.nextInt());
        System.out.println("Masukkan Lebar Ruang : ");
        lo.setLebarRuang(in.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        lo.setJumlahKursi(in.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        lo.setJumlahPintu(in.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        lo.setJumlahJendela(in.nextInt());
        rk = new RuangKelas(lo.getPanjangRuang(),lo.getLebarRuang(),lo.getJumlahKursi(),lo.getJumlahPintu(),lo.getJumlahJendela());
        }
   
    
//    void inputKondisiSarana(){
//        System.out.println("Masukkan Jumlah Stop Kontak : ");
//        rk.setJumlahStopKontak(in.nextInt());
//        System.out.println("Masukkan Kondisi Stop Kontak : ");
//        rk.setKondisiStopKontak(in.next());
//        System.out.println("Masukkan Posisi Stop Kontak : ");
//        rk.setPosisiStopKontak(in.next());
//        System.out.println("Masukkan Jumlah Kabel LCD : ");
//        rk.setJumlahKabelLCD(in.nextInt());
//        System.out.println("Masukkan Kondisi Kabel LCD : ");
//        rk.setKondisiKabelLCD(in.next());
//        System.out.println("Masukkan Posisi Kabel LCD : ");
//        rk.setPosisiKabelLCD(in.next());
//        System.out.println("Masukkan Jumlah Lampu : ");
//        rk.setJumlahLampu(in.nextInt());
//        System.out.println("Masukkan Kondisi Lampu : ");
//        rk.setKondisiLampu(in.next());
//        System.out.println("Masukkan Posisi Lampu : ");
//        rk.setPosisiLampu(in.next());
//        System.out.println("Masukkan Jumlah Kipas Angin : ");
//        rk.setJumlahKipasAngin(in.nextInt());
//        System.out.println("Masukkan Kondisi Kipas Angin : ");
//        rk.setKondisiKipasAngin(in.next());
//        System.out.println("Masukkan Posisi Kipas Angin : ");
//        rk.setPosisiKipasAngin(in.next());
//        System.out.println("Masukkan Jumlah AC : ");
//        rk.setJumlahAC(in.nextInt());
//        System.out.println("Masukkan Kondisi AC : ");
//        rk.setKondisiAC(in.next());
//        System.out.println("Masukkan Posisi AC : ");
//        rk.setPosisiAC(in.next());
//        System.out.println("Masukkan SSID : ");
//        rk.setSSID(in.next());
//        System.out.println("Masukkan Bandwidth : ");
//        rk.setBandwidth(in.nextInt());
//         System.out.println("Masukkan Jumlah CCTV : ");
//        rk.setJumlahCCTV(in.nextInt());
//        System.out.println("Masukkan Kondisi CCTV : ");
//        rk.setKondisiCCTV(in.next());
//        System.out.println("Masukkan Posisi CCTV : ");
//        rk.setPosisiCCTV(in.next());
//    }
//    void inputKondisiLingkungan(){
//        System.out.println("Masukkan Kondisi Lantai : ");
//        rk.setKondisiLantai(in.next());
//        System.out.println("Masukkan Kondisi Dinding : ");
//        rk.setKondisiDinding(in.next());
//        System.out.println("Masukkan Kondisi Atap : ");
//        rk.setKondisiAtap(in.next());
//        System.out.println("Masukkan Kondisi Pintu : ");
//        rk.setKondisiPintu(in.next());
//        System.out.println("Masukkan Kondisi Jendela : ");
//        rk.setKondisiJendela(in.next());}
//    
//    void inputKondisiKebersihan(){
//        System.out.println("Masukkan Sirkulasi Udara: ");
//        rk.setSirkulasiUdara(in.next());
//        System.out.println("Masukkan Nilai Pencahayaan : ");
//        rk.setNilaiPencahayaan(in.nextInt());
//        System.out.println("Masukkan Kelembaban (%) : ");
//        rk.setKelembaban(in.nextInt());
//        System.out.println("Masukkan Suhu (celcius) : ");
//        rk.setSuhu(in.nextInt());
//    }
//    
//    void inputKondisiKenyamanan(){
//        System.out.println("Masukkan Kebisingan : ");
//        rk.setKebisingan(in.next());
//        System.out.println("Masukkan Bau : ");
//        rk.setBau(in.next());
//        System.out.println("Masukkan Kebocoran : ");
//        rk.setKebocoran(in.next());
//        System.out.println("Masukkan Kerusakan : ");
//        rk.setKerusakan(in.next());
//        System.out.println("Masukkan Keausan : ");
//        rk.setKeausan(in.next());
//    }
//    void inputKondisiKeamanan(){
//        System.out.println("Masukkan Kekokohan : ");
//       rk.setKekokohan(in.next());
//        System.out.println("Masukkan Kunci Pintu dan Jendela : ");
//        rk.setKunciPintuJendela(in.next());
//        System.out.println("Masukkan Bahaya : ");
//        rk.setBahaya(in.next());
//    }
    void tampil(){
        System.out.println("===========Hasil===============");
        System.out.println("=========Identitas Kelas=========");
        System.out.println("Nama Ruang : "+rk.getNamaRuang());
        System.out.println("Lokasi Ruang : "+rk.getLokasiRuang());  
        System.out.println("Fakultas : "+rk.getFakultas());
        System.out.println("Program Studi : "+rk.getProgramStudi());
        System.out.println("=========Kondisi Ruang Kelas=========");
        System.out.println("Panjang Ruang : "+rk.getPanjangRuang());
        System.out.println("Lebar Ruang : "+rk.getJumlahKursi());
        System.out.println("Jumlah Pintu : "+rk.getJumlahPintu());
        System.out.println("Jumlah Jendela : "+rk.getJumlahJendela());
        System.out.println("=========Kondisi Sarana=========");
        System.out.println("Jumlah Stop Kontak : "+rk.getJumlahStopKontak());
        System.out.println("Kondisi Stop Kontak : "+rk.getKondisiStopKontak());
        System.out.println("Posisi Stop Kontak : "+rk.getPosisiStopKontak());
        System.out.println("Jumlah Kabel LCD : "+rk.getJumlahKabelLCD());
        System.out.println("Kondisi Kabel LCD : "+rk.getKondisiKabelLCD());
        System.out.println("Posisi Kabel LCD : "+rk.getPosisiKabelLCD());
        System.out.println("Jumlah Lampu : "+rk.getJumlahLampu());
        System.out.println("Kondisi Lampu : "+rk.getKondisiLampu());
        System.out.println("Posisi Lampu : "+rk.getPosisiLampu());
        System.out.println("Jumlah Kipas Angin : "+rk.getJumlahKipasAngin());
        System.out.println("Kondisi Kipas Angin : "+rk.getKondisiKipasAngin());
        System.out.println("Posisi Kipas Angin : "+rk.getPosisiKipasAngin());
        System.out.println("Jumlah AC : "+rk.getJumlahAC());
        System.out.println("Kondisi AC : "+rk.getKondisiAC());
        System.out.println("Posisi AC : "+rk.getPosisiAC());
        System.out.println("SSID : "+rk.getSSID());
        System.out.println("Bandwidth : "+rk.getBandwidth());
        System.out.println("Jumlah CCTV : "+rk.getJumlahCCTV());
        System.out.println("Kondisi CCTV : "+rk.getKondisiCCTV());
        System.out.println("Posisi CCTV : "+rk.getPosisiCCTV());
        System.out.println("===============Kondisi Lingkungan=================");
        System.out.println("Kondisi Lantai : "+rk.getKondisiLantai()); 
        System.out.println("Kondisi Dinding : "+rk.getKondisiDinding());
        System.out.println("Kondisi Atap : "+rk.getKondisiAtap());
        System.out.println("Kondisi Pintu : "+rk.getKondisiPintu());
        System.out.println("Kondisi Jendela : "+rk.getKondisiJendela());
        System.out.println("===============Kenyamanan================");
        System.out.println("Kebisingan : "+rk.getKebisingan());
        System.out.println("Bau : "+rk.getBau());
        System.out.println("Kebocoran : "+rk.getKebocoran());
        System.out.println("Kerusakan : "+rk.getKerusakan());
        System.out.println("Keausan : "+rk.getKeausan());
        System.out.println("===============Keamanan===============");
        System.out.println("Kekokohan : "+rk.getKekokohan());
        System.out.println("Kunci Pintu dan Jendela : "+rk.getKunciPintuJendela());
        System.out.println("Bahaya : "+rk.getBahaya()); 
    }
}

