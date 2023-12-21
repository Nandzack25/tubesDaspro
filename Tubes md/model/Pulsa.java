package model;

public class Pulsa {
    private String idPulsa;
    private int hargaPulsa;
    private String isiPulsa;

    public Pulsa setIdPulsa(String idPulsa) {
        this.idPulsa = idPulsa;
        return this;
    }

    public String getIdPulsa() {
        return idPulsa;
    }

    public Pulsa setHargaPulsa(int hargaPulsa) {
        this.hargaPulsa = hargaPulsa;
        return this;
    }

    public int getHargaPulsa() {
        return hargaPulsa;
    }

    public Pulsa setIsiPulsa(String isiPulsa) {
        this.isiPulsa = isiPulsa;
        return this;
    }

    public String getIsiPulsa() {
        return isiPulsa;
    }
}
