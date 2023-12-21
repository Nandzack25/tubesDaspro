package model;

public class PaketData {
    private String idPaketData;
    private String namaPaketData;
    private int hargaPaketData;
    private String isiPaketData;

    public PaketData setIdPaketData(String idPaketData) {
        this.idPaketData = idPaketData;
        return this;
    }

    public String getIdPaketData() {
        return idPaketData;
    }

    public PaketData setNamaPaketData(String namaPaketData) {
        this.namaPaketData = namaPaketData;
        return this;
    }

    public String getNamaPaketData() {
        return namaPaketData;
    }

    public PaketData setHargaPaketData(int hargaPaketData) {
        this.hargaPaketData = hargaPaketData;
        return this;
    }

    public int getHargaPaketData() {
        return hargaPaketData;
    }

    public PaketData setIsiPaketData(String isPaketData) {
        this.isiPaketData = isPaketData;
        return this;
    }

    public String getIsiPaketData() {
        return isiPaketData;
    }

}