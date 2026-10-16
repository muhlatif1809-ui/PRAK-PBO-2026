package UTS;

public class Tiket {
    protected String kode;
    protected String judulFilm;
    protected int hargaDasar;
    private Penonton pemilik;

    public Tiket(String kode, String judulFilm, int hargaDasar) {
        this.kode = kode;
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
    }

    public void setPemilik(Penonton pemilik) {
        this.pemilik = pemilik;
    }

    public Penonton getPemilik() {
        return pemilik;
    }

    public String getKode() {
        return kode;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public int hitungHarga() {
        return hargaDasar;
    }

    public String getJenis() {
        return "Tiket";
    }
}
