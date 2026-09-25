package KuisPraktikum01;

public class main {
    public static void main(String[] args) {

        AreaParkir area = new AreaParkir("Basement", 5);

        kendaraan k1 = new kendaraan("N 1234 AB", "Motor");
        kendaraan k2 = new kendaraan("L 5678 CD", "Mobil");
        kendaraan k3 = new kendaraan("L 9012 EF", "Motor");
        kendaraan k4 = new kendaraan("S 6789 GH", "Mobil");
        kendaraan k5 = new kendaraan("T 2341 JT", "Motor");

        area.tampilkanSlot();

        System.out.println("\n == Kendaraan Masuk == ");
        area.parkir(k1, 1);
        area.parkir(k2, 2);
        area.parkir(k3, 7);
        area.parkir(k4, 4);
        area.parkir(k5, 5);

        area.tampilkanSlot();

        System.out.println("\n == Kendaraan Keluar == ");
        area.keluar(2);
        area.keluar(4);

        area.tampilkanSlot();
    }
}
