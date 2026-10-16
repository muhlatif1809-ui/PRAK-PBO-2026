package UTS;

public class Bioskop {
    private String nama;
    private Studio[] daftarStudio;
    private Manajer manajer;

    public Bioskop(String nama, int jumlahStudio, int kapasitasStudio) {
        this.nama = nama;
        this.daftarStudio = new Studio[jumlahStudio];
        for (int i = 0; i < jumlahStudio; i++) {
            this.daftarStudio[i] = new Studio(i + 1, kapasitasStudio);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    public boolean jualTiket(Tiket t) {
        return jualTiket(t, 1);
    }

    public boolean jualTiket(Tiket t, int nomorStudio) {
        Studio s = getStudio(nomorStudio);
        if (s == null) {
            return false; 
        }
        return s.jual(t);
    }

    public Studio getStudio(int nomor) {
        if (nomor < 1 || nomor > daftarStudio.length) {
            return null; 
        }
        return daftarStudio[nomor - 1];
    }

    public void tampilInfo() {
        System.out.println("Bioskop : " + nama);
        System.out.println("Manajer : " + (manajer == null ? "-" : manajer.getNama()));
        for (Studio s : daftarStudio) {
            System.out.println("Studio " + s.getNomor() + " : " + s.getJumlah()
                    + " tiket, pendapatan Rp" + s.hitungPendapatan());
        }
    }
}
