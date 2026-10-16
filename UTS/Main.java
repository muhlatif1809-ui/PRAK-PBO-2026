package UTS;

public class Main {
    public static void main(String[] args) {
        Bioskop bioskop = new Bioskop("Sinema Malang", 3, 50);
        bioskop.setManajer(new Manajer("Pak Hadi"));

        Penonton andi = new Penonton("Andi", "08111111111");
        Penonton sinta = new Penonton("Sinta", "08222222222");

        Tiket reguler = new TiketReguler("T-001", "Laskar Pelangi", 40000, true);
        reguler.setPemilik(andi);
        Tiket vip = new TiketVIP("T-002", "Laskar Pelangi", 40000);
        vip.setPemilik(sinta);

        bioskop.jualTiket(reguler);
        bioskop.jualTiket(vip);
        boolean okStudio4 = bioskop.jualTiket(vip, 4);

        MesinCetak mesin = new MesinCetak("MC-01");
        mesin.cetak(reguler);
        mesin.cetak(vip);
        if (!okStudio4) {
            System.out.println("Studio 4 tidak tersedia.");
        }
        System.out.println("Pendapatan Studio 1 : " + bioskop.getStudio(1).hitungPendapatan());

        Tiket t = new TiketVIP("T-099", "Dilan", 50000);
        System.out.println("C3 hitungHarga() T-099 : " + t.hitungHarga());
    }
}
