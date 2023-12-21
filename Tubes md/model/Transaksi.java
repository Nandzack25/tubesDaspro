package model;

import java.time.LocalDate;


public class Transaksi {
    private String idTransaksi;
    private Pengguna pengguna;
    private String paketData;
    private int hargaPaketData;
    private int sisaPulsa;
    private LocalDate tanggal;

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

    public String getPaketData() {
        return paketData;
    }

    public Transaksi setPaketData(String paketData) {
        this.paketData = paketData;
        return this;
    }

    public int getHargaPaketData() {
        return hargaPaketData;
    }

    public Transaksi setHargaPaketData(int hargaPaketData) {
        this.hargaPaketData = hargaPaketData;
        return this;
    }

    public int getSisaPulsa() {
        return sisaPulsa;
    }

    public Transaksi setSisaPulsa(int sisaPulsa) {
        this.sisaPulsa = sisaPulsa;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Transaksi setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }
}
