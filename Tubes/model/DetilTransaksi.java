package model;

public class DetilTransaksi {
    private String idDetilTransaksi;
    private Transaksi transaksi;
    private PaketData paketData;
    private int hargaPaket;


    public String getIdDetilTransaksi() {
        return idDetilTransaksi;
    }

    public void setIdDetilTransaksi(String idDetilTransaksi) {
        this.idDetilTransaksi = idDetilTransaksi;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public PaketData getPaketData() {
    return paketData;
    }

    public void setPaketData(PaketData paketData) {
        this.paketData = paketData;
    }

    public int getHargaPaket() {
        return hargaPaket;
    }

    public void setHargaPaket(int hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

}
