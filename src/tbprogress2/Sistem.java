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
    DatabaseWork con = new DatabaseWork();
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

    double CheckKondisiRuang(RuangKelas kls,String IDKelas) {
//        inop.InputKondisiRuang();
//        kls = inop.getRuangKelas();
        String arasio,bentuk,apintu,ajendela;
        System.out.println("==============Analisis==================");
        Luas = kls.getPanjangRuang() * kls.getLebarRuang();
        if (kls.getLebarRuang() == kls.getPanjangRuang()) {
            
            bentuk = "Bentuk Tidak Sesuai";
           
            ts++;
        } else {
            System.out.println("Luas = "+Luas);
            bentuk = "Bentuk Sesuai";
            s++;
        }
        RasioLuas = Luas / kls.getJumlahKursi();
        System.out.println("Rasio : " + RasioLuas);
        if(RasioLuas<=0.5){
            arasio ="Tidak Sesuai";
        }
        else{
            arasio = "Sesuai";
            s++;
        }
        if (kls.getJumlahPintu() >= 2) {
            apintu = "Sesuai";
            s++;
        } else {
            apintu = "Tidak Sesuai";
           // System.out.println("Jumlah Pintu Tidak Sesuai");
            ts++;
        }
        if (kls.getJumlahJendela() >= 1) {
            ajendela = "Sesuai";
            s++;
        } else {
            ajendela = "Tidak Sesuai";
            ts++;
        }
        con.analisisSave(IDKelas, Luas, bentuk, RasioLuas,arasio, apintu, ajendela);
        
//        if (ts > s) {
//            kondisi = 0; 
//        } else {
//            kondisi = 1;
//        }
        persentaseKondisiRuang(s);
        return s;
    } 
   @Override
   void persentaseKondisiRuang(int s){
        int total = s*25;
        System.out.println("persentase KOndisi Ruang : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiSarana::");
    }

    double CheckKondisiSarana(RuangKelas kls,String IDRuang) {
        String ajstopkontak,akstopkontak,apstopkontak;
        String ajlcd,aklcd,aplcd;
        String ajlampu,aklampu,aplampu;
        
        if (kls.getJumlahStopKontak() >= 4) {
            ajstopkontak = "Sesuai";
            s++;
        } else {
            ajstopkontak = "Tidak Sesuai";
            ts++;
        }
        if (kls.getKondisiStopKontak().equalsIgnoreCase("baik")){
            akstopkontak = "Sesuai";
            s++;
        } else {
            akstopkontak = "Tidak Sesuai";
        }
        if (kls.getPosisiStopKontak().equalsIgnoreCase("DekatDosen") || kls.getPosisiStopKontak().equalsIgnoreCase("PojokKelas")) {
            apstopkontak = "Sesuai";
            s++;
        } else {
            apstopkontak = "Tidak Sesuai";
            ts++;
        }
        if(kls.getJumlahKabelLCD()>=1){
            ajlcd = "Sesuai";
            s++;

        } else {
             ajlcd = "Tidak Sesuai";
            ts++;
        }
        if(kls.getKondisiKabelLCD().equalsIgnoreCase("baik")|| kls.getKondisiKabelLCD().equalsIgnoreCase("berfungsi")){
            aklcd = "Sesuai";
            s++;
        }else{
           aklcd = "Tidak Sesuai";
            ts++;
        }
        if(kls.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")){
            aplcd = "Sesuai";
            s++;
        }else{
            aplcd = "Tidak Sesuai";
            ts++;
        }
        if(kls.getJumlahLampu()>=18){
            ajlampu = "Sesuai";
            s++;
        }else{
            ajlampu = "Tidak Sesuai";
            ts++;
        }
        if(kls.getKondisiLampu().equalsIgnoreCase("baik")){
            aklampu = "Sesuai";
            s++;
        }else{
            aklampu = "Tidak Sesuai";
            ts++;
        }
        if(kls.getPosisiLampu().equalsIgnoreCase("atapruangan")){
            aplampu = "Sesuai";
            s++;
        } else {
            aplampu = "Tidak Sesuai";
            ts++;
        }
        con.analisisSave(IDRuang, ajstopkontak, akstopkontak, apstopkontak, ajlcd, aklcd, aplcd, ajlampu, aklampu, aplampu);
       persentaseKondisiSarana(s);
       //output(kls.getJumlahStopKontak(), kls.getKondisiStopKontak(), kls.getPosisiStopKontak(), kls.getJumlahKabelLCD(), kls.getKondisiKabelLCD(), kls.getPosisiKabelLCD(),kls.getJumlahLampu(), kls.getKondisiLampu(), kls.getPosisiLampu());
//        if (ts > s) {
//            kondisi = 0;
//        } else {
//            kondisi = 1;
//        }
        return s;
    }
    @Override
    void persentaseKondisiSarana(int s){
        int total = s*11;
        System.out.println("persentase KOndisi Sarana : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiLingkungan::");
       
    }
    double CheckKondisiSarana2(RuangKelas kls) {
//        inop.inputKondisiSarana();
//        kls = inop.getRuangKelas();
        
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
        persentaseKondisiSarana2(s);
        //inop.output(kls.getJumlahKipasAngin(), kls.getKondisiKipasAngin(), kls.getPosisiKipasAngin() , kls.getJumlahAC(), kls.getKondisiAC(), kls.getPosisiAC(), kls.getSSID(), kls.getBandwidth(), kls.getJumlahCCTV(), kls.getKondisiCCTV(), kls.getPosisiCCTV());
    return s;
    }
    @Override
    void persentaseKondisiSarana2(int s){
        int total = s*9;
        System.out.println("persentase KOndisi Sarana : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiLingkungan::");
       
    }
    int CheckKondisiLingkungan(RuangKelas kls) {
//        inop.inputKondisiLingkungan();
//        kls = inop.getRuangKelas();
//        int kon;
//        System.out.println("==============Analisis==================");
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
        persentaseKondisiLingkungan(s);
        return s;
    }
    @Override
    void persentaseKondisiLingkungan(int s){
        int total = s*20;
        System.out.println("persentase KOndisi Lingkungan : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiKebersihan::");
        
    }
    
    int CheckKondisiKebersihan(RuangKelas kls,String IDRuang) {
        String alantai,adinding,aatap,apintu,ajendela;
        System.out.println("==============Analisis=================="); 
        if (kls.getKondisiLantai().equalsIgnoreCase("Lantai Bersih")) {
            //System.out.println("Kondisi Lantai : Sesuai");
            alantai = "Sesuai";
            s++;
        } else {
            //System.out.println("Kondisi Lantai : Tidak Sesuai");
            alantai = "Tidak Sesuai";
            ts++;
        }
        if (kls.getKondisiDinding().equalsIgnoreCase("Dinding Bersih/Baik")){
            //System.out.println("Kondisi Dinding : Sesuai");
            adinding = "Sesuai";
            s++;
        }else {
            ts++;
            adinding = "Tidak Sesuai";
            //System.out.println("Kondisi Dinding : Tidak Sesuai");
        }
        if (kls.getKondisiAtap().equalsIgnoreCase("Atap Bersih")){
            //System.out.println("Kondisi Atap : Sesuai");
            aatap = "Sesuai";
            s++;
        }else{
            //System.out.println("Kondisi Atap : Tidak Sesuai");
            aatap = "Tidak Sesuai";
            ts++;
        }
        if (kls.getKondisiPintu().equalsIgnoreCase("Pintu Bersih/Baik")){
           // System.out.println("Kondisi Pintu : Sesuai");
            apintu = "Sesuai";
            s++;
        }else {
            //System.out.println("Kondisi Pintu : Tidak Sesuai");
            apintu = "Tidak Sesuai";
            ts++;
        }
        if (kls.getKondisiJendela().equalsIgnoreCase("Jendela Bersih/Baik")){
            //System.out.println("Kondisi Jendela : Sesuai");
            ajendela = "Sesuai";
            s++;
        } else {
            //System.out.println("Kondisi Jendela : Tidak Sesuai");
            ajendela = "Tidak Sesuai";
            ts++;
        }
        con.analisisSave(IDRuang, alantai, adinding, aatap, apintu, ajendela);
        persentaseKondisiLingkungan(s);
        return s;
    }
    @Override
    void persentaseKondisiKebersihan(int s){
    int total = s*25;
    System.out.println("persentase Kondisi Kebersihan : "+total+"%");
    System.out.println("======================================");
    System.out.println("::Anda Masuk CheckKondisiKenyamanan::");
    }
  
    int CheckKondisiKenyamanan(RuangKelas kls) {
//        int kon;
//        System.out.println("==============Analisis==================");
       if ("Tidak Bising".equalsIgnoreCase(kls.getKebisingan())||"Sepi/Tenang".equalsIgnoreCase(kls.getKebisingan())) {
            System.out.println("Kebisingan : Tidak Bising");
            s++;
        } else {
            System.out.println("Kebisingan : Bising");
            ts++;
        }
        if ("Tidak Bau".equalsIgnoreCase(kls.getBau())||"Wangi".equalsIgnoreCase(kls.getBau())) {
            System.out.println("Bau : Enak");
            s++;
        } else {
            System.out.println("Bau : Tidak Sedap");
            ts++;
        }
        if ("Tidak Begitu Parah".equalsIgnoreCase(kls.getKerusakan())||"Keadaan Baik".equalsIgnoreCase(kls.getKerusakan())) {
            System.out.println("Kerusakan : Tidak Rusak");
            s++;
        } else {
            System.out.println("Kerusakan : Rusak");
            ts++;
        }
        if ("Tidak Aus".equalsIgnoreCase(kls.getKeausan())) {
            System.out.println("Keausan : Tidak Ada");
            s++;
        } else {
            System.out.println("Keausan : Ada");
            ts++;
        }
//        if (s == 1) {
//            System.out.println("s");
//            kon = 1;
//        } else {
//            System.out.println("Tidak s");
//            kon = 0;
//        }
        persentaseKenyamanan(s);
        return s;
    }
    @Override
    void persentaseKenyamanan(int s){
     int total = s*25;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
    System.out.println("======================================");
    System.out.println("::Anda Masuk CheckKondisiKeamanan::");
    }

    int CheckKondisiKeamanan(RuangKelas kls,String IDRuang) {
//        int kon;
//        inop.inputKondisiLingkungan();
//        kls = inop.getRuangKelas();
        String akekokohan,akuncipintujendela,abahaya;
        System.out.println("==============Analisis==================");
        if ("Kokoh".equalsIgnoreCase(kls.getKekokohan())) {
            akekokohan = "Sesuai";
            s++;
        } else {
            akekokohan = "Tidak Sesuai";
            ts++;
        }
        if ("Terkunci".equalsIgnoreCase(kls.getKunciPintuJendela())) {
            akuncipintujendela = "Sesuai";
            s++;
        } else {
            akuncipintujendela = "Tidak Sesuai";
            ts++;
        }
        if ("Aman".equalsIgnoreCase(kls.getBahaya())) {
            abahaya = "Sesuai";
            s++;
        } else {
            abahaya = "Tidak Sesuai";
            ts++;
        }
        con.analisisSave(IDRuang, akekokohan, akuncipintujendela, abahaya);
        persentaseKeamanan(s); 
        return s;
    }
    @Override
    void persentaseKeamanan(int s){
    double total = s*100/3;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
    System.out.println("======================================"); 
    }
    
}
