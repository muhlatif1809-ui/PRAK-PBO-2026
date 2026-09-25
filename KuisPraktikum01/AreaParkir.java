package KuisPraktikum01;

public class AreaParkir {
    String nama;
    int jumlahSlot;
    SlotParkir[] slotParkir;

    AreaParkir(String nama, int jumlah) {
    this.nama = nama;
    this.jumlahSlot = jumlah;
    this.slotParkir = new SlotParkir[jumlah];

    for (int i = 0; i < jumlah; i++) {
        slotParkir[i] = new SlotParkir(i + 1);
        }
    }

    private int cariSlotKosong() {
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i].isKosong()) {
                return i;
            }
        }
            return -1;
    }

    void parkir(kendaraan k, int nomor) {
        if (nomor < 1 || nomor > slotParkir.length) {
            System.out.println("Nomor slot tidak valid!");
            return;
        }

    if (!slotParkir[nomor - 1].isKosong()) {
        System.out.println("Slot " + nomor + " sudah terisi!");
            return;
        }

        slotParkir[nomor - 1].setKendaraan(k);
        System.out.println("Kendaraan berhasil parkir di slot " + nomor);

        }

    void keluar(int nomor) {
        if (nomor < 1 || nomor > slotParkir.length) {
            System.out.println("Nomor slot tidak valid!");
            return;
            }

        if (slotParkir[nomor - 1].isKosong()) {
            System.out.println("Slot " + nomor + " sudah kosong!");
            return;
            }

            System.out.println("Kendaraan " +
            slotParkir[nomor - 1].getKendaraan().platNomor +" keluar dari slot " + nomor);
            slotParkir[nomor - 1].setKendaraan(null);
    }

    void tampilkanSlot() {
        System.out.println("\n=== " + nama + " ===");

    for (int i = 0; i < slotParkir.length; i++) {
        System.out.println(slotParkir[i].info());
        }
    }
}
