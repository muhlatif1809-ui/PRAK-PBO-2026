package UTS;

public class MesinCetak {
    private String kodeMesin;

    public MesinCetak(String kodeMesin) {
        this.kodeMesin = kodeMesin;
    }

    public void cetak(Tiket t) {
        if (t == null) {
            return; 
        }
        String pemilik = (t.getPemilik() == null) ? "-" : t.getPemilik().getNama();
        System.out.println("[" + t.getJenis() + "] " + t.getKode() + " "
                + t.getJudulFilm() + " | " + pemilik + " | Rp" + t.hitungHarga());
    }
}
