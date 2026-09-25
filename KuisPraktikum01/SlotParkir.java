package KuisPraktikum01;

public class SlotParkir {
    int nomor;
    kendaraan kendaraan;

    SlotParkir(int nomor) {
        this.nomor = nomor;
        this.kendaraan = null;
    }

    void setKendaraan(kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    kendaraan getKendaraan() {
        return kendaraan;
    }

    boolean isKosong() {
        return kendaraan == null;
    }

    String info() {
        if (isKosong()) {
            return "Slot " + nomor + " : Kosong";
        } else {
            return "Slot " + nomor + " : " + kendaraan.info();
        }
    }
}


