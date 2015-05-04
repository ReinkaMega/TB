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
public class Sistem extends RuangKelas {
    Scanner in = new Scanner(System.in); 

    int s=0,ts=0,kondisi;
private double Luas,RasioLuas;
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
double HitungLuas(){
    Luas = super.getPanjangRuang()* super.getLebarRuang();
    return Luas;
    }
double HitungRasioLuas(){
    RasioLuas = Luas/ super.getJumlahKursi();
    return RasioLuas;
    }
   void inputIdentitasKelas(){
   
        System.out.println("Masukkan Nama Ruang : ");
        super.setNamaRuang(in.next());
        System.out.println("Masukkan Lokasi Ruang : ");
        super.setLokasiRuang(in.next());
        System.out.println("Masukkan Fakultas : ");
        super.setFakultas(in.next());
        System.out.println("Masukkan Program Studi : ");
        super.setProgramStudi(in.next());
        //System.out.println("Masukkan Pilih Progam Studi : ");
        //System.out.println("Masukkan Pilih Fakultas : ");
        }
    
    void InputKondisiRuang(){
        
        System.out.println("Masukkan Panjang Ruang : ");
        super.setPanjangRuang(in.nextInt());
        System.out.println("Masukkan Lebar Ruang : ");
        super.setLebarRuang(in.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        super.setJumlahKursi(in.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        super.setJumlahPintu(in.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        super.setJumlahJendela(in.nextInt());
        }
    void inputKondisiSarana(){
        System.out.println("Masukkan Jumlah Stop Kontak : ");
        super.setJumlahStopKontak(in.nextInt());
        System.out.println("Masukkan Kondisi Stop Kontak : ");
        super.setKondisiStopKontak(in.next());
        System.out.println("Masukkan Posisi Stop Kontak : ");
        super.setPosisiStopKontak(in.next());
        System.out.println("Masukkan Jumlah Kabel LCD : ");
        super.setJumlahKabelLCD(in.nextInt());
        System.out.println("Masukkan Kondisi Kabel LCD : ");
        super.setKondisiKabelLCD(in.next());
        System.out.println("Masukkan Posisi Kabel LCD : ");
        super.setPosisiKabelLCD(in.next());
        System.out.println("Masukkan Jumlah Lampu : ");
        super.setJumlahLampu(in.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        super.setKondisiLampu(in.next());
        System.out.println("Masukkan Posisi Lampu : ");
        super.setPosisiLampu(in.next());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        super.setJumlahKipasAngin(in.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        super.setKondisiKipasAngin(in.next());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        super.setPosisiKipasAngin(in.next());
        System.out.println("Masukkan Jumlah AC : ");
        super.setJumlahAC(in.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        super.setKondisiAC(in.next());
        System.out.println("Masukkan Posisi AC : ");
        super.setPosisiAC(in.next());
        System.out.println("Masukkan SSID : ");
        super.setSSID(in.next());
        System.out.println("Masukkan Bandwidth : ");
        super.setBandwidth(in.nextInt());
         System.out.println("Masukkan Jumlah CCTV : ");
        super.setJumlahCCTV(in.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        super.setKondisiCCTV(in.next());
        System.out.println("Masukkan Posisi CCTV : ");
        super.setPosisiCCTV(in.next());
    }
    void inputKondisiLingkungan(){
        System.out.println("Masukkan Kondisi Lantai : ");
        super.setKondisiLantai(in.next());
        System.out.println("Masukkan Kondisi Dinding : ");
        super.setKondisiDinding(in.next());
        System.out.println("Masukkan Kondisi Atap : ");
        super.setKondisiAtap(in.next());
        System.out.println("Masukkan Kondisi Pintu : ");
        super.setKondisiPintu(in.next());
        System.out.println("Masukkan Kondisi Jendela : ");
        super.setKondisiJendela(in.next());}
    
    void inputKondisiKebersihan(){
        System.out.println("Masukkan Sirkulasi Udara: ");
        super.setSirkulasiUdara(in.next());
        System.out.println("Masukkan Nilai Pencahayaan : ");
        super.setNilaiPencahayaan(in.nextInt());
        System.out.println("Masukkan Kelembaban (%) : ");
        super.setKelembaban(in.nextInt());
        System.out.println("Masukkan Suhu (celcius) : ");
        super.setSuhu(in.nextInt());
    }
    
    void inputKondisiKenyamanan(){
        System.out.println("Masukkan Kebisingan : ");
        super.setKebisingan(in.next());
        System.out.println("Masukkan Bau : ");
        super.setBau(in.next());
        System.out.println("Masukkan Kebocoran : ");
        super.setKebocoran(in.next());
        System.out.println("Masukkan Kerusakan : ");
        super.setKerusakan(in.next());
        System.out.println("Masukkan Keausan : ");
        super.setKeausan(in.next());
    }
    void inputKondisiKeamanan(){
        System.out.println("Masukkan Kekokohan : ");
       super.setKekokohan(in.next());
        System.out.println("Masukkan Kunci Pintu dan Jendela : ");
        super.setKunciPintuJendela(in.next());
        System.out.println("Masukkan Bahaya : ");
        super.setBahaya(in.next());
    }
    void tampil(){
        System.out.println("===========Hasil===============");
        System.out.println("=========Identitas Kelas=========");
        System.out.println("Nama Ruang : "+super.getNamaRuang());
        System.out.println("Lokasi Ruang : "+super.getLokasiRuang());  
        System.out.println("Fakultas : "+super.getFakultas());
        System.out.println("Program Studi : "+super.getProgramStudi());
        System.out.println("=========Kondisi Ruang Kelas=========");
        System.out.println("Panjang Ruang : "+super.getPanjangRuang());
        System.out.println("Lebar Ruang : "+super.getJumlahKursi());
        System.out.println("Jumlah Pintu : "+super.getJumlahPintu());
        System.out.println("Jumlah Jendela : "+super.getJumlahJendela());
        System.out.println("=========Kondisi Sarana=========");
        System.out.println("Jumlah Stop Kontak : "+super.getJumlahStopKontak());
        System.out.println("Kondisi Stop Kontak : "+super.getKondisiStopKontak());
        System.out.println("Posisi Stop Kontak : "+super.getPosisiStopKontak());
        System.out.println("Jumlah Kabel LCD : "+super.getJumlahKabelLCD());
        System.out.println("Kondisi Kabel LCD : "+super.getKondisiKabelLCD());
        System.out.println("Posisi Kabel LCD : "+super.getPosisiKabelLCD());
        System.out.println("Jumlah Lampu : "+super.getJumlahLampu());
        System.out.println("Kondisi Lampu : "+super.getKondisiLampu());
        System.out.println("Posisi Lampu : "+super.getPosisiLampu());
        System.out.println("Jumlah Kipas Angin : "+super.getJumlahKipasAngin());
        System.out.println("Kondisi Kipas Angin : "+super.getKondisiKipasAngin());
        System.out.println("Posisi Kipas Angin : "+super.getPosisiKipasAngin());
        System.out.println("Jumlah AC : "+super.getJumlahAC());
        System.out.println("Kondisi AC : "+super.getKondisiAC());
        System.out.println("Posisi AC : "+super.getPosisiAC());
        System.out.println("SSID : "+super.getSSID());
        System.out.println("Bandwidth : "+super.getBandwidth());
        System.out.println("Jumlah CCTV : "+super.getJumlahCCTV());
        System.out.println("Kondisi CCTV : "+super.getKondisiCCTV());
        System.out.println("Posisi CCTV : "+super.getPosisiCCTV());
        System.out.println("===============Kondisi Lingkungan=================");
        System.out.println("Kondisi Lantai : "+super.getKondisiLantai()); 
        System.out.println("Kondisi Dinding : "+super.getKondisiDinding());
        System.out.println("Kondisi Atap : "+super.getKondisiAtap());
        System.out.println("Kondisi Pintu : "+super.getKondisiPintu());
        System.out.println("Kondisi Jendela : "+super.getKondisiJendela());
        System.out.println("===============Kenyamanan================");
        System.out.println("Kebisingan : "+super.getKebisingan());
        System.out.println("Bau : "+super.getBau());
        System.out.println("Kebocoran : "+super.getKebocoran());
        System.out.println("Kerusakan : "+super.getKerusakan());
        System.out.println("Keausan : "+super.getKeausan());
        System.out.println("===============Keamanan===============");
        System.out.println("Kekokohan : "+super.getKekokohan());
        System.out.println("Kunci Pintu dan Jendela : "+super.getKunciPintuJendela());
        System.out.println("Bahaya : "+super.getBahaya()); 
    }

double CheckKondisiRuang(){
    
    Luas = super.getPanjangRuang()* super.getLebarRuang();
    if(super.getLebarRuang()==super.getPanjangRuang()){
        System.out.println("Luas Tidak Sesuai"); 
    ts++;} 
    else{
        System.out.println("Luas Sesuai");
        s++;
    }

    RasioLuas = Luas/ super.getJumlahKursi();
    System.out.println("Rasio : "+RasioLuas);
     if(super.getJumlahPintu()>=2){
    System.out.println("Pintu Sesuai");
    s++;
    }else {
        System.out.println("Pintu Tidak Sesuai");
            ts++;
            }
     if(super.getJumlahJendela()>=1){
    System.out.println("Sesuai");
    s++;
    }else {
        System.out.println("Tidak Sesuai");
            ts++;
            }
     if(ts>s){
         kondisi=0;
     }
     else{
         kondisi=1;
     }
       return kondisi;
}
int CheckKondisiSarana(){
    
    if(super.getJumlahStopKontak()>=4){
        System.out.println("Sesuai");
        s++;
    }else{
        System.out.println("Tidak Sesusai");
        ts++;
    }
    if("DekatDosen".equals(super.getPosisiStopKontak())||"PojokKelas".equals(super.getPosisiStopKontak())){
        System.out.println("Sesuai");
        s++;
    }
    else{
        System.out.println("Tidak Sesuai");
        ts++;
    }
    if(ts>s){
         kondisi=0;
     }
     else{
         kondisi=1;
     }

    return kondisi;
}
int CheckKondisiLingkungan(){
    int ber=0,kot=0,kon;
    if("bersih".equalsIgnoreCase(super.getKondisiLantai())){
        ber++;
}
    else{
        kot++;
    }
    if(ber==5){
        System.out.println("Bersih");
        kon=1;
    }else{
        System.out.println("Kotor");
        kon=0;
    }
    return kon;
}
    @SuppressWarnings("empty-statement")
int CheckKondisiKebersihan(){
    int lan=0,tl=0,kon,sesuai=0,ts=0;
    if("Lancar".equalsIgnoreCase(super.getSirkulasiUdara())){
        System.out.println("Lancar");
        lan++;
    }else{
        System.out.println("Tidak Lancar");
        tl++;
        }
    if(lan>tl){
         kon=1;
     }
     else{
         kon=0;
     }
      
      if(super.getNilaiPencahayaan()>=250){
          if(super.getNilaiPencahayaan()<=350){
              System.out.println("Sesuai");
          }
          sesuai++;
          
      }else{
          System.out.println("Tidak Sesuai");
          ts++;
      }
      if(sesuai>ts){
          kon =1;
      }else{
          kon =0;
      }
      if(super.getKelembaban()>=70){
          if(super.getKelembaban()<=80){
              System.out.println("Sesuai");
          }
          sesuai++;
      }else{
          System.out.println("Tidak Sesuai");
          ts++;
      }
      if(sesuai>ts){
          kon =1;
      }else{
          kon =0;
      }
      if(super.getSuhu()>=25){
          if(super.getSuhu()<=35){
              System.out.println("Sesuai");
          }
          sesuai++;
      }else{
          System.out.println("Tidak Sesuai");
          ts++;
      }
      if(sesuai>ts){
          kon =1;
      }else{
          kon =0;
      }
      return kon;

}

int CheckKondisiKenyamanan(){
    int kon,sesuai=0,ts=0;
    if("Sesuai".equalsIgnoreCase(super.getKebisingan())){
        sesuai++;
}
    else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    if("Sesuai".equalsIgnoreCase(super.getBau())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    if("Sesuai".equalsIgnoreCase(super.getKerusakan())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    if("Sesuai".equalsIgnoreCase(super.getKeausan())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    return kon;  
}
int CheckKondisiKeamanan(){
    int kon,sesuai=0,ts=0;
    if("Sesuai".equalsIgnoreCase(super.getKekokohan())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    if("Sesuai".equalsIgnoreCase(super.getKunciPintuJendela())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    if("Sesuai".equalsIgnoreCase(super.getBahaya())){
        sesuai++;
    }else{
        ts++;
    }
    if(sesuai==1){
        System.out.println("Sesuai");
        kon=1;
    }else{
        System.out.println("Tidak Sesuai");
        kon=0;
    }
    return kon;
    } 
    
}

