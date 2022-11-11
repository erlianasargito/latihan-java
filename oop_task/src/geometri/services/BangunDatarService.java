package geometri.services;

//interface: merupakan abstract class (class yang menyimpan methods tanpa body)
public interface BangunDatarService {

    //set nama bangun
    //public -> wajib implementasi
    public void menggambarBangun();

    public void karakteristikBangunan();

    //default -> optional implementasi (juga agar tidak wajib diimplementasi di setiap class yang implements)
    default double hitungLuasSegitiga(double alas, double tinggi) {
        return 0;
    }

    default double hitungLuasLingkaran(double jarijari) {
        return 0;
    }

    default double hitungLuasPersegi() {
        return 0;
    }

    default double hitungKelilingSegitiga(double alas, double tinggi, double sisi) {
        return 0;
    }

    default double hitungKelilingLingkaran(double jarijari) {
        return 0;
    }

    default double hitungKelilingPersegi() {
        return 0;
    }
}
