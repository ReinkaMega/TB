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
public class IO extends SuperKelas{
    
    Scanner in = new Scanner(System.in);
     RuangKelas kls = new RuangKelas();
    RuangKelas rk;
    
    public RuangKelas getRuangKelas(){
    return rk;
    }
    
    void inputIdentitasKelas(){
        
        System.out.println("Masukkan Nama Ruang : ");
        kls.setNamaRuang(in.next());
        System.out.println("Masukkan klskasi Ruang : ");
        kls.setLokasiRuang(in.next());
        System.out.println("Masukkan Fakultas : ");
        kls.setFakultas(in.next());
        System.out.println("Masukkan Program Studi : ");
        kls.setProgramStudi(in.next());
        rk = new RuangKelas(kls.getNamaRuang(),kls.getLokasiRuang(),kls.getFakultas(),kls.getProgramStudi());
        }
   
    
    
    void InputKondisiRuang(){
       
        System.out.println("Masukkan Panjang Ruang : ");
        kls.setPanjangRuang(in.nextInt());
        System.out.println("Masukkan Lebar Ruang : ");
        kls.setLebarRuang(in.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        kls.setJumlahKursi(in.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        kls.setJumlahPintu(in.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        kls.setJumlahJendela(in.nextInt());
        rk = new RuangKelas(kls.getPanjangRuang(),kls.getLebarRuang(),kls.getJumlahKursi(),kls.getJumlahPintu(),kls.getJumlahJendela());
        }
    void inputKondisiSarana(){
        System.out.println("Masukkan Jumlah Stop Kontak : ");
        kls.setJumlahStopKontak(in.nextInt());
        System.out.println("Masukkan Kondisi Stop Kontak : ");
        kls.setKondisiStopKontak(in.next());
        System.out.println("Masukkan Posisi Stop Kontak : ");
        kls.setPosisiStopKontak(in.next());
        System.out.println("Masukkan Jumlah Kabel LCD : ");
        kls.setJumlahKabelLCD(in.nextInt());
        System.out.println("Masukkan Kondisi Kabel LCD : ");
        kls.setKondisiKabelLCD(in.next());
        System.out.println("Masukkan Posisi Kabel LCD : ");
        kls.setPosisiKabelLCD(in.next());
        System.out.println("Masukkan Jumlah Lampu : ");
        kls.setJumlahLampu(in.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        kls.setKondisiLampu(in.next());
        System.out.println("Masukkan Posisi Lampu : ");
        kls.setPosisiLampu(in.next());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        kls.setJumlahKipasAngin(in.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        kls.setKondisiKipasAngin(in.next());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        kls.setPosisiKipasAngin(in.next());
        System.out.println("Masukkan Jumlah AC : ");
        kls.setJumlahAC(in.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        kls.setKondisiAC(in.next());
        System.out.println("Masukkan Posisi AC : ");
        kls.setPosisiAC(in.next());
        System.out.println("Masukkan SSID : ");
        kls.setSSID(in.next());
        System.out.println("Masukkan Bandwidth : ");
        kls.setBandwidth(in.next());
        System.out.println("Masukkan Jumlah CCTV : ");
        kls.setJumlahCCTV(in.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        kls.setKondisiCCTV(in.next());
        System.out.println("Masukkan Posisi CCTV : ");
        kls.setPosisiCCTV(in.next());
        rk = new RuangKelas(kls.getJumlahStopKontak(),kls.getKondisiStopKontak(),kls.getPosisiStopKontak(),kls.getJumlahKabelLCD(),kls.getKondisiKabelLCD(),kls.getPosisiKabelLCD(),kls.getJumlahLampu(),kls.getKondisiLampu(),kls.getPosisiLampu(),kls.getJumlahKipasAngin(),kls.getKondisiKipasAngin(),kls.getPosisiKipasAngin(),kls.getJumlahAC(),kls.getKondisiAC(),kls.getPosisiAC(),kls.getSSID(),kls.getBandwidth(),kls.getJumlahCCTV(),kls.getKondisiCCTV(),kls.getPosisiCCTV());
    }
    
    void inputKondisiLingkungan(){
        System.out.println("Masukkan Kondisi Lantai : ");
        kls.setKondisiLantai(in.next());
        System.out.println("Masukkan Kondisi Dinding : ");
        kls.setKondisiDinding(in.next());
        System.out.println("Masukkan Kondisi Atap : ");
        kls.setKondisiAtap(in.next());
        System.out.println("Masukkan Kondisi Pintu : ");
        kls.setKondisiPintu(in.next());
        System.out.println("Masukkan Kondisi Jendela : ");
        kls.setKondisiJendela(in.next());
        rk = new RuangKelas(kls.getKondisiLantai(),kls.getKondisiDinding(),kls.getKondisiAtap(),kls.getKondisiPintu(),kls.getKondisiJendela());
    }
    
    void inputKondisiKebersihan(){
        System.out.println("Masukkan Sirkulasi Udara: ");
        kls.setSirkulasiUdara(in.next());
        System.out.println("Masukkan Nilai Pencahayaan : ");
        kls.setNilaiPencahayaan(in.nextInt());
        System.out.println("Masukkan Kelembaban (%) : ");
        kls.setKelembaban(in.nextInt());
        System.out.println("Masukkan Suhu (celcius) : ");
        kls.setSuhu(in.nextInt());
        rk = new RuangKelas(kls.getSirkulasiUdara(),kls.getNilaiPencahayaan(),kls.getKelembaban(),kls.getSuhu());   
    }
      void inputKondisiKenyamanan(){
        System.out.println("Masukkan Kebisingan : ");
        kls.setKebisingan(in.next());
        System.out.println("Masukkan Bau : ");
        kls.setBau(in.next());
        System.out.println("Masukkan Kebocoran : ");
        kls.setKebocoran(in.next());
        System.out.println("Masukkan Kerusakan : ");
        kls.setKerusakan(in.next());
        System.out.println("Masukkan Keausan : ");
        kls.setKeausan(in.next());
        rk = new RuangKelas(kls.getKebisingan(),kls.getBau(),kls.getKebocoran(),kls.getKerusakan(),kls.getKeausan());
        
    }
    
    void inputKondisiKeamanan(){
        System.out.println("Masukkan Kekokohan : ");
       kls.setKekokohan(in.next());
        System.out.println("Masukkan Kunci Pintu dan Jendela : ");
        kls.setKunciPintuJendela(in.next());
        System.out.println("Masukkan Bahaya : ");
        kls.setBahaya(in.next());
        rk = new RuangKelas(kls.getKekokohan(),kls.getKunciPintuJendela(),kls.getBahaya());

    }
    
    @Override
    void IdentitasKelas(){ 
        System.out.println("=========Identitas Kelas=========");
        System.out.println("Nama Ruang : "+kls.getNamaRuang());
        System.out.println("klskasi Ruang : "+kls.getLokasiRuang());  
        System.out.println("Fakultas : "+kls.getFakultas());
        System.out.println("Program Studi : "+kls.getProgramStudi());
    }
    void tampil(){
          System.out.println("==============Hasil===============");
//        System.out.println("=========Kondisi Ruang Kelas=========");
//        System.out.println("Panjang Ruang : "+kls.getPanjangRuang());
//        System.out.println("Lebar Ruang : "+kls.getJumlahKursi());
//        System.out.println("Jumlah Pintu : "+kls.getJumlahPintu());
//        System.out.println("Jumlah Jendela : "+kls.getJumlahJendela());
//        System.out.println("=========Kondisi Sarana=========");
//        System.out.println("Jumlah Stop Kontak : "+kls.getJumlahStopKontak());
//        System.out.println("Kondisi Stop Kontak : "+kls.getKondisiStopKontak());
//        System.out.println("Posisi Stop Kontak : "+kls.getPosisiStopKontak());
//        System.out.println("Jumlah Kabel LCD : "+kls.getJumlahKabelLCD());
//        System.out.println("Kondisi Kabel LCD : "+kls.getKondisiKabelLCD());
//        System.out.println("Posisi Kabel LCD : "+kls.getPosisiKabelLCD());
//        System.out.println("Jumlah Lampu : "+kls.getJumlahLampu());
//        System.out.println("Kondisi Lampu : "+kls.getKondisiLampu());
//        System.out.println("Posisi Lampu : "+kls.getPosisiLampu());
//        System.out.println("Jumlah Kipas Angin : "+kls.getJumlahKipasAngin());
//        System.out.println("Kondisi Kipas Angin : "+kls.getKondisiKipasAngin());
//        System.out.println("Posisi Kipas Angin : "+kls.getPosisiKipasAngin());
//        System.out.println("Jumlah AC : "+kls.getJumlahAC());
//        System.out.println("Kondisi AC : "+kls.getKondisiAC());
//        System.out.println("Posisi AC : "+kls.getPosisiAC());
//        System.out.println("SSID : "+kls.getSSID());
//        System.out.println("Bandwidth : "+kls.getBandwidth());
//        System.out.println("Jumlah CCTV : "+kls.getJumlahCCTV());
//        System.out.println("Kondisi CCTV : "+kls.getKondisiCCTV());
//        System.out.println("Posisi CCTV : "+kls.getPosisiCCTV());
//        System.out.println("===============Kondisi Lingkungan=================");
//        System.out.println("Kondisi Lantai : "+kls.getKondisiLantai()); 
//        System.out.println("Kondisi Dinding : "+kls.getKondisiDinding());
//        System.out.println("Kondisi Atap : "+kls.getKondisiAtap());
//        System.out.println("Kondisi Pintu : "+kls.getKondisiPintu());
//        System.out.println("Kondisi Jendela : "+kls.getKondisiJendela());
//        System.out.println("===============Kenyamanan================");
//        System.out.println("Kebisingan : "+kls.getKebisingan());
//        System.out.println("Bau : "+kls.getBau());
//        System.out.println("Kebocoran : "+kls.getKebocoran());
//        System.out.println("Kerusakan : "+kls.getKerusakan());
//        System.out.println("Keausan : "+kls.getKeausan());
//        System.out.println("===============Keamanan===============");
//        System.out.println("Kekokohan : "+kls.getKekokohan());
//        System.out.println("Kunci Pintu dan Jendela : "+kls.getKunciPintuJendela());
//        System.out.println("Bahaya : "+kls.getBahaya()); 
    }
    
}

