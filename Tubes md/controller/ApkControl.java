package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import java.util.Map;

import model.PaketData;
import model.Pengguna;
import model.Transaksi;
import model.Pulsa;

public class ApkControl {
    HashMap<String, Pengguna> penggunas = new HashMap<>();
    HashMap<String, PaketData> paketDatas = new HashMap<>();
    HashMap<String, Pulsa> pulsas = new HashMap<>();
    ArrayList<Transaksi> transaksis = new ArrayList<>();

    int HashMapCount = 2;

    Pengguna pengguna1 = new Pengguna();
    Pengguna pengguna2 = new Pengguna();
    Pengguna pengguna3 = new Pengguna();

    PaketData paketData1 = new PaketData();
    PaketData paketData2 = new PaketData();
    PaketData paketData3 = new PaketData();
    PaketData paketData4 = new PaketData();
    PaketData paketData5 = new PaketData();
    PaketData paketData6 = new PaketData();
    PaketData paketData7 = new PaketData();
    PaketData paketData8 = new PaketData();
    PaketData paketData9 = new PaketData();

    Pulsa pulsa1 = new Pulsa();
    Pulsa pulsa2 = new Pulsa();

    public void dataPengguna() {
        pengguna1.setIdPengguna("1").setName("Madda Athia Rahman").setnoHp("0812121212").setEmail("madda@gmail.com")
                .setPassword("124");
        pengguna2.setIdPengguna("2").setName("Nanda Zacky").setnoHp("0823232323").setEmail("nanda@gmail.com")
                .setPassword("123");
        pengguna3.setIdPengguna("3").setName("Hasna M").setnoHp("0834343434").setEmail("hasna@gmail.com")
                .setPassword("234");

        penggunas.put(pengguna1.getIdPengguna(), pengguna1);
        penggunas.put(pengguna2.getIdPengguna(), pengguna2);
        penggunas.put(pengguna3.getIdPengguna(), pengguna3);
    }

    public void dataPaketData() {
        paketData1.setIdPaketData("1.1").setNamaPaketData("Harian1").setHargaPaketData(5000)
                .setIsiPaketData("1 Gb/1 Hr");
        paketData2.setIdPaketData("1.2").setNamaPaketData("Harian2").setHargaPaketData(10000)
                .setIsiPaketData("4 Gb/1 Hr");
        paketData3.setIdPaketData("1.3").setNamaPaketData("Harian3").setHargaPaketData(17000)
                .setIsiPaketData("7 Gb/1 Hr");
        paketData4.setIdPaketData("2.1").setNamaPaketData("Mingguan1").setHargaPaketData(18000)
                .setIsiPaketData("3 Gb/7 Hr");
        paketData5.setIdPaketData("2.2").setNamaPaketData("Mingguan2").setHargaPaketData(25000)
                .setIsiPaketData("6 Gb/7 Hr");
        paketData6.setIdPaketData("2.3").setNamaPaketData("Mingguan3").setHargaPaketData(34000)
                .setIsiPaketData("10 Gb/7 Hr");
        paketData7.setIdPaketData("3.1").setNamaPaketData("Bulanan1").setHargaPaketData(40000)
                .setIsiPaketData("8 Gb/30 Hr");
        paketData8.setIdPaketData("3.2").setNamaPaketData("Bulanan2").setHargaPaketData(54000)
                .setIsiPaketData("12 Gb/30 Hr");
        paketData9.setIdPaketData("3.3").setNamaPaketData("Bulanan3").setHargaPaketData(68000)
                .setIsiPaketData("18 Gb/30 Hr");

        paketDatas.put(paketData1.getIdPaketData(), paketData1);
        paketDatas.put(paketData2.getIdPaketData(), paketData2);
        paketDatas.put(paketData3.getIdPaketData(), paketData3);
        paketDatas.put(paketData4.getIdPaketData(), paketData4);
        paketDatas.put(paketData5.getIdPaketData(), paketData5);
        paketDatas.put(paketData6.getIdPaketData(), paketData6);
        paketDatas.put(paketData7.getIdPaketData(), paketData7);
        paketDatas.put(paketData8.getIdPaketData(), paketData8);
        paketDatas.put(paketData9.getIdPaketData(), paketData9);

    }

    public void dataPulsa() {
        pulsa1.setIdPulsa("1").setHargaPulsa(50000).setIsiPulsa("50000");
        pulsa2.setIdPulsa("2").setHargaPulsa(100000).setIsiPulsa("100000");

        pulsas.put(pulsa1.getIdPulsa(), pulsa1);
        pulsas.put(pulsa2.getIdPulsa(), pulsa2);

    }

    Scanner input = new Scanner(System.in);
    String index = "";

    public void Login() {
        dataPengguna();    
        boolean lanjut = true;
        while (lanjut) {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println("=====================================================");
            System.out.println("SILAHKAN ISI DATA UNTUK MASUK DAN MELAKUKAN TRANSAKSI");
            System.out.println("=====================================================");
            System.out.println();
            System.out.print("Masukan Nomor HP\t: ");
            String no = input.nextLine();
    
            boolean nomorTerdaftar = false;
    
            for (int i = 1; i <= penggunas.size(); i++) {
                if (penggunas.get(String.valueOf(i)).getnoHp().equals(no)) {
                    nomorTerdaftar = true;
                    index = String.valueOf(i);
                    System.out.print("Masukan Password\t: ");
                    String pw = input.nextLine();
    
                    if (penggunas.get(index).getPassword().equals(pw)) {
                        System.out.println();
                        System.out.println("                   BERHASIL LOGIN!                   ");
                        lanjut = false;
    
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
    
                    } else {
                        System.out.println();
                        System.out.println("                   PASSWORD SALAH!                   ");
                         try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
    
            if (!nomorTerdaftar) {
                System.out.println();
                System.out.println("          NOMOR HANDPHONE TIDAK TERDAFTAR!           ");
            }
        }
    }
    
    public void Menu() {
        dataPengguna();
        dataPaketData();
        dataPulsa();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                      MENU UTAMA                     ");
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("Hai " + penggunas.get(index).getName());
        System.out.println("Saldo Pulsa Anda Adalah " + penggunas.get(index).getPulsaPengguna());
        System.out.println("Silahkan Input Angka List Sesuai Dengan Kebutuhan Anda");
        System.out.println();
        System.out.println("1. Cek Paket Data Aktif");
        System.out.println("2. Beli Pulsa");
        System.out.println("3. Beli Paket Data");
        System.out.println("4. Keluar");
        System.out.println("5. Transaksi Terakhir");
        System.out.println();
        System.out.print("Input Angka List\t: ");
    }

    public void cekPaket() {
        

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                    Cek Paket Data                   ");
        System.out.println("=====================================================");
        System.out.println();
        if (penggunas.get(index).getIsPaketAktif() == true) {
            System.out.println("Anda Memiliki Paket Yang Sedang Aktif,");
            System.out.println("Yaitu Paket " + penggunas.get(index).getNamaPaketAktif());
        } else {
            System.out.println("Anda Tidak Memiliki Paket Yang Sedang Aktif");
            System.out.println("Segera Lakukan Pembelian Paket!");
        }

        System.out.println("\n\n\n\nMasukan Apapun untuk Kembali  :)");
        String io = input.nextLine();
    }

    public void belanjaPulsa() {
        dataPulsa();
        dataPengguna();

        System.out.print("\033[H\033[2J");
        System.out.flush();
;
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                     DAFTAR PULSA                    ");
        System.out.println("=====================================================");
        System.out.println();
        for (Map.Entry<String, Pulsa> entry1 : pulsas.entrySet()) {
            String key = entry1.getKey();
            Pulsa tPulsa = entry1.getValue();
            System.out.println("Kode Pulsa \t\t: " + key);
            System.out.println("Harga \t\t\t: " + tPulsa.getHargaPulsa());
            System.out.println("Isi \t\t\t: " + tPulsa.getIsiPulsa());
            System.out.println();
        }
        System.out.print("Pilih Kode Pulsa\t: ");
        boolean lanjut = true;
        while (lanjut) {
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "1":
                    penggunas.get(index).setPulsaPengguna(50000) ;
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "2":
                    penggunas.get(index).setPulsaPengguna(100000);
                    System.out.println();
                    System.out.println("                  PEMBELIAN BERHASIL!                ");
                    lanjut = false;
                    break;
                case "3":
                    System.out.println();
                    System.out.println("                 KEMBALI KE MENU UTAMA               ");
                    lanjut = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("                  KODE TIDAK TERSEDIA!               ");
                    lanjut = false;
                    break;
            }
        }
    
    }
    String pilihan  ;
    int increment = 0 ;
    boolean telahTransaksi = false;
    public void belanjaPaketData() {
        dataPaketData();
        dataPengguna();
    
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                  DAFTAR PAKET DATA                  ");
        System.out.println("=====================================================");
        System.out.println();
        for (Map.Entry<String, PaketData> entry1 : paketDatas.entrySet()) {
            String key = entry1.getKey();
            PaketData tPaket = entry1.getValue();
            System.out.println("Kode Paket \t\t: " + key);
            System.out.println("Nama Paket\t\t: " + tPaket.getNamaPaketData());
            System.out.println("Harga \t\t\t: " + tPaket.getHargaPaketData());
            System.out.println("Isi \t\t\t: " + tPaket.getIsiPaketData());
            System.out.println();
        }
        System.out.println("0. Untuk keluar");
        System.out.print("\nPilih Kode Paket\t: ");
        pilihan = input.nextLine();
        boolean lanjut = true;
        while (lanjut) {
    
            boolean pulsaCukup = cekPulsa();
            if (!pulsaCukup) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("MAAF PULSA ANDA TIDAK CUKUP\n\nTOLONG LAKUKAN PENGISIAN PULSA TERLEBIH DAHULU");
                System.out.println();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lanjut = false;
            } else {
                increment++;
                String transaksiId = "T" + increment; 
                transaksiBaru = new Transaksi();
                    switch (pilihan) {
                    case "1.1":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Harian 1 (1 Gb/1Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "1.2":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Harian 2 (4 Gb/1Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "1.3":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Harian 3 (7 Gb/1Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "2.1":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Mingguan 1 (3 Gb/7Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "2.2":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Mingguan 2 (6 Gb/7Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "2.3":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Mingguan 3 (10 Gb/7Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "3.1":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Bulanan 1 (8 Gb/30Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "3.2":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Bulanan 2 (12 Gb/30Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "3.3":
                        penggunas.get(index).setIsPaketAktif(true);
                        penggunas.get(index).setNamaPaketAktif("Bulanan 1 (18 Gb/30Hr)");
                        penggunas.get(index).setPulsaPengguna(-paketDatas.get(pilihan).getHargaPaketData());
                        System.out.println();
                        System.out.println("                  PEMBELIAN BERHASIL!                ");
                        lanjut = false;
                        telahTransaksi = true;
                        break;
                    case "0":
                        lanjut =false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("                  KODE TIDAK TERSEDIA!               ");
                        break;
                }
                transaksiBaru.setIdTransaksi(transaksiId).setPengguna(penggunas.get(index))
                    .setPaketData(paketDatas.get(pilihan).getNamaPaketData())
                    .setHargaPaketData(paketDatas.get(pilihan).getHargaPaketData()).setTanggal(currentDate)
                    .setSisaPulsa(penggunas.get(index).getPulsaPengguna());

            transaksis.add(transaksiBaru);

            System.out.println();
            System.out.println("                  PEMBELIAN BERHASIL!                ");
            lanjut = false;
            telahTransaksi = true;
            }
        }
            if(telahTransaksi == true){
                laporanTransaksi();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public boolean cekPulsa(){
        return penggunas.get(index).getPulsaPengguna() >= paketDatas.get(pilihan).getHargaPaketData();
    }
    Transaksi transaksiBaru = new Transaksi();
    String transaksiId = "T" + (increment + 1);
    LocalDate currentDate = LocalDate.now();

    public void laporanTransaksi() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                LAPORAN TRANSAKSI                    ");
        System.out.println("=====================================================");
        System.out.println();
    
        System.out.println("ID Transaksi\t: " + transaksiBaru.getIdTransaksi());
        System.out.println("Tanggal\t\t: " + transaksiBaru.getTanggal());
        System.out.println("Nama Pengguna\t: " + transaksiBaru.getPengguna().getName());
        System.out.println("Nomor HP\t: " + transaksiBaru.getPengguna().getnoHp());
        System.out.println("Email\t\t: " + transaksiBaru.getPengguna().getEmail());
        System.out.println("Paket Data\t: " + transaksiBaru.getPaketData());
        System.out.println("Harga\t\t: " + transaksiBaru.getHargaPaketData());
        System.out.println("Sisa Pulsa\t: " + transaksiBaru.getSisaPulsa());
    
        System.out.println("\n\n\n\nSelanjutnya / kembali :)");
        String io = input.nextLine();
    }

    public ArrayList<Transaksi> getTransaksis() {
        return transaksis;
    }
    public void transaksiSebelumnya(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
         if(telahTransaksi == true){
            for (Transaksi transaksi : transaksis) {
                System.out.println();
                System.out.println("=====================================================");
                System.out.println("                 TRANSAKSI TERAKHIR                  ");
                System.out.println("=====================================================");
                System.out.println();
                System.out.println("ID Transaksi\t: " + transaksi.getIdTransaksi());
                System.out.println("Tanggal\t\t: " + transaksi.getTanggal());
                System.out.println("Nama Pengguna\t: " + transaksi.getPengguna().getName());
                System.out.println("Nomor HP\t: " + transaksi.getPengguna().getnoHp());
                System.out.println("Email\t\t: " + transaksi.getPengguna().getEmail());
                System.out.println("Paket Data\t: " + transaksi.getPaketData());
                System.out.println("Harga\t\t: " + transaksi.getHargaPaketData());
                System.out.println("Sisa Pulsa\t: " + transaksi.getSisaPulsa());
                System.out.println();
                System.out.println("\n\n\n\nMasukkan Apapun untuk Kembali  :)");
                String o = input.nextLine();
                continue;
            } 
         }else{
            System.out.println("TOLONG LAKUKAN TRANSAKSI TERLEBIH DAHULU ;D");
            try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
         }
    }
    
}

