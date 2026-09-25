package KuisPraktikum01;

public class kendaraan {
    String platNomor;
    String jenis;
    
    kendaraan(String platNomor, String jenis) {
    this.platNomor = platNomor;
    this.jenis = jenis;

    }

    String info() {
    return "Plat Nomor: " + platNomor + ", Jenis: " + jenis;
    }   
}
