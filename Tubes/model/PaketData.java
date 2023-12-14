package model;

public class PaketData {
    private String idPaketData;
    private String namaPaketData;
    private  int hargaPaketData;
    private String isiPaketData;

    public PaketData setIdPaketData(String idPaketData){
        this.idPaketData = idPaketData;
        return this;
    }

    public String getidPaketData(){
        return idPaketData;
    }

    public PaketData setnamPaketData(String namaPaketData){
        this.namaPaketData = namaPaketData;
    return this;
    }

    public String getnamaPaketData(){
        return namaPaketData;
    }

    public PaketData sethargaPaketData(int hargaPaketData){
        this.hargaPaketData = hargaPaketData;
        return this;
    }

    public int gethargaPaketData(){
        return hargaPaketData;
    }

    public PaketData setisiPaketData(String isPaketData){
        this.isiPaketData = isPaketData;
        return this;
    }

    public String getisiPaketData(){
        return isiPaketData;
    }

}
