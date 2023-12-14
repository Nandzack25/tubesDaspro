package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private Pengguna pengguna;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetilTransaksi> detilTransaksis;
    
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Transaksi setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        return this;
    }

     public Pengguna getPengguna() {
     return pengguna;

    }
    public Transaksi setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
        return this;
    }

     public int getTotal() {
        return total;
    }
    public Transaksi setTotal(int total) {
        this.total = total;
        return this;
    }

     public LocalDate getTanggal() {
        return tanggal;
    }
    public Transaksi setTanggal(LocalDate tanggal) {
        this.tanggal= tanggal;
        return this;
    }

    public ArrayList<DetilTransaksi> getDetiTransaksis() {
        return detilTransaksis;
    }

    public Transaksi setDetilTransaksis(ArrayList<DetilTransaksi> detilTransaksis) {
        this.detilTransaksis = detilTransaksis;
        return this;
    }

}
