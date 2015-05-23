/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tbprogress2;

import java.util.Scanner;

/**
 *
 * @author Eko Ari Irawan (167)
 */
public class Sistem extends Proses{

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
//        inop.InputKondisiRuang();
//        kls = inop.getRuangKelas();
//        Luas = kls.getPanjangRuang() * kls.getLebarRuang();
//        if (kls.getLebarRuang() == kls.getPanjangRuang()) {
//            System.out.println("Luas = "+Luas);
//            System.out.println("Luas Tidak s");
//            ts++;
//        } else {
//            System.out.println("Luas = "+Luas);
//            System.out.println("Luas s");
//            s++;
//        }
//        RasioLuas = Luas / kls.getJumlahKursi();
//        System.out.println("Rasio : " + RasioLuas);
//        if(RasioLuas<=0.5){
//            System.out.println("Rasio Tidak s");
//        }
//        else{
//            System.out.println("Rasio s");
//            s++;
//        }
//        if (kls.getJumlahPintu() >= 2) {
//            System.out.println("Jumlah Pintu s");
//            s++;
//        } else {
//            System.out.println("Jumlah Pintu Tidak s");
//            ts++;
//        }
//        if (kls.getJumlahJendela() >= 1) {
//            System.out.println("Jumlah Jendela s");
//            s++;
//        } else {
//            System.out.println("Jumlah Jendela Tidak s");
//            ts++;
//        }
//        inop.output(kls.getPanjangRuang(), kls.getLebarRuang(), kls.getJumlahKursi(),kls.getJumlahPintu() ,kls.getJumlahJendela());
//        
////        if (ts > s) {
////            kondisi = 0; 
////        } else {
////            kondisi = 1;
////        }
        return s;
    } 
   @Override
   void persentaseKondisiRuang(int s){
        int total = s*25;
        System.out.println("persentase KOndisi Ruang : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiSarana::");

    }

    double CheckKondisiSarana() {
        inop.inputKondisiSarana();
        kls = inop.getRuangKelas();
        
        if (kls.getJumlahStopKontak() >= 4) {
            System.out.println("Jumlah Stop Kontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesusai");
            ts++;
        }
        if (kls.getKondisiStopKontak().equalsIgnoreCase("baik")){
            System.out.println("KondisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (kls.getPosisiStopKontak().equalsIgnoreCase("DekatDosen") || kls.getPosisiStopKontak().equalsIgnoreCase("PojokKelas")) {
            System.out.println("PosisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahKabelLCD()>=1){
            System.out.println("JumlahKabelLCD : s");
            s++;

        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiKabelLCD().equalsIgnoreCase("baik")|| kls.getKondisiKabelLCD().equalsIgnoreCase("berfungsi")){
            System.out.println("KondisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")){
            System.out.println("PosisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahLampu()>=18){
            System.out.println("JumlahLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiLampu().equalsIgnoreCase("baik")){
            System.out.println("KondisiLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiLampu().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiLampu : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahKipasAngin()>=2){
            System.out.println("JumlahKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiKipasAngin().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiKipasAngin().equalsIgnoreCase("baik")){
            System.out.println("KondisiKipasAngin : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahAC()>=1){
            System.out.println("JumlahAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiAC().equalsIgnoreCase("baik")){
            System.out.println("KondisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            s++;
        }
        if(kls.getPosisiAC().equalsIgnoreCase("belakang")|| kls.getPosisiAC().equalsIgnoreCase("samping")){
            System.out.println("PosisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getSSID().equalsIgnoreCase("ummhotspot")){
            System.out.println("getSSID : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getBandwidth().equalsIgnoreCase("bisa")){
            System.out.println("Bandwidth : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getJumlahCCTV()>=2){
            System.out.println("JumlahCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiCCTV().equalsIgnoreCase("baik")){
            System.out.println("KondisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiCCTV().equalsIgnoreCase("depanbelakang")){
            System.out.println("PosisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
       inop.output(kls.getJumlahStopKontak(), kls.getKondisiStopKontak(), kls.getPosisiStopKontak(), kls.getJumlahKabelLCD(), kls.getKondisiKabelLCD(), kls.getPosisiKabelLCD(),kls.getJumlahLampu(), kls.getKondisiLampu(), kls.getPosisiLampu(), kls.getJumlahKipasAngin(), kls.getKondisiKipasAngin(), kls.getPosisiKipasAngin() , kls.getJumlahAC(), kls.getKondisiAC(), kls.getPosisiAC(), kls.getSSID(), kls.getBandwidth(), kls.getJumlahCCTV(), kls.getKondisiCCTV(), kls.getPosisiCCTV());
//        if (ts > s) {
//            kondisi = 0;
//        } else {
//            kondisi = 1;
//        }
        return s;
    }
    @Override
    void persentaseKondisiSarana(){
         int total = s*5;
        System.out.println("persentase KOndisi Sarana : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiLingkungan::");
       
    }
    int CheckKondisiLingkungan() {
        inop.inputKondisiLingkungan();
        kls = inop.getRuangKelas();
        int kon;
        if (kls.getKondisiLantai().equalsIgnoreCase("bersih")) {
            System.out.println("getKondisiLantai : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getKondisiDinding().equalsIgnoreCase("bersih")){
            System.out.println("KondisiDinding : s");
            s++;
        }else {
            ts++;
            System.out.println("Tidak s");
        }
        if (kls.getKondisiAtap().equalsIgnoreCase("bersih")){
            System.out.println("KondisiAtap : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getKondisiPintu().equalsIgnoreCase("bersih")){
            System.out.println("KondisiPintu : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getKondisiJendela().equalsIgnoreCase("bersih")){
            System.out.println("getKondisiJendela : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (s > ts) {
            System.out.println("Bersih");
            kon = 1;
        } else {
            System.out.println("Kotor");
            kon = 0;
        }
        return s;
    }
    @Override
    void persentaseKondisiLingkungan(){
        int total = s*20;
        System.out.println("persentase KOndisi Lingkungan : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiKebersihan::");
        
    }
    
    int CheckKondisiKebersihan() {
        int kon;
        if ("Lancar".equalsIgnoreCase(kls.getSirkulasiUdara())) {
            System.out.println("SirkulasiUdara : Lancar");
            s++;
        } else {
            System.out.println("Tidak Lancar");
            ts++;
        }
        if (kls.getNilaiPencahayaan() >= 250) {
            if (kls.getNilaiPencahayaan() <= 350) {
                System.out.println("NilaiPencahayaan : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getKelembaban() >= 70) {
            if (kls.getKelembaban() <= 80) {
                System.out.println("Kelembaban : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (kls.getSuhu() >= 25) {
            if (kls.getSuhu() <= 35) {
                System.out.println("Suhu : s");
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
        return s;
    }
    @Override
    void persentaseKondisiKebersihan(){
    int total = s*25;
    System.out.println("persentase Kondisi Kebersihan : "+total+"%");
    System.out.println("======================================");
    System.out.println("::Anda Masuk CheckKondisiKenyamanan::");
    }
  
    int CheckKondisiKenyamanan() {
        int kon;
        if ("s".equalsIgnoreCase(kls.getKebisingan())) {
            System.out.println("Kebisingan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getBau())) {
            System.out.println("Bau : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKerusakan())) {
            System.out.println("Kerusakan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKeausan())) {
            System.out.println("Keausan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        return s;
    }
    @Override
    void persentaseKenyamanan(int s){
     int total = s*25;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
    System.out.println("======================================");
    System.out.println("::Anda Masuk CheckKondisiKeamanan::");
    }

    int CheckKondisiKeamanan() {
        int kon;
        inop.inputKondisiLingkungan();
        kls = inop.getRuangKelas();
        if ("s".equalsIgnoreCase(kls.getKekokohan())) {
            System.out.println("Kekokohan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKunciPintuJendela())) {
            System.out.println("KunciPintuJendela : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getBahaya())) {
            System.out.println("Bahaya : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }  
        return s;
    }
    @Override
    void persentaseKeamanan(int s){
    double total = s*33.3;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
    System.out.println("======================================"); 
    }
    
}
