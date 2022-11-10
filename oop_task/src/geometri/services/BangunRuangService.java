package geometri.services;

//interface: merupakan abstract class (class yang menyimpan methods tanpa body)
public interface BangunRuangService {
    public void menggambarBangun();

    public void karakteristikBangunan();

    default double hitungLuasPermukaanPrisma(double alas, double tinggi, double sisi, double tprisma) {
        return 0;
    }

    default double hitungVolumePrisma(double alas, double tinggi, double tprisma) {
        return 0;
    }
}
