package model;

public class Pengguna extends Akun {
    private String idPengguna;
    private int pulsaPengguna;
    private boolean isPaketAktif;
    private String namaPaketAktif;

    public Pengguna setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
        return this;
    }

    public String getIdPengguna() {
        return this.idPengguna;
    }
    public Pengguna setPulsaPengguna(int pulsaPengguna) {
        this.pulsaPengguna += pulsaPengguna;
        return this;
    }

    public int getPulsaPengguna() {
        return this.pulsaPengguna;
    }

    public void setIsPaketAktif(boolean isPaketAktif) {
        this.isPaketAktif = isPaketAktif;
    }

    public boolean getIsPaketAktif() {
        return this.isPaketAktif;
    }

    public void setNamaPaketAktif(String namaPaketAktif) {
        this.namaPaketAktif = namaPaketAktif;
        
    }

    public String getNamaPaketAktif() {
        return this.namaPaketAktif;
    }
}