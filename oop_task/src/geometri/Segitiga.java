package geometri;

import geometri.services.BangunDatarService;

public class Segitiga implements BangunDatarService {
    private double alas, tinggi, sisi;

    public Segitiga() {
    }

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getSisi() {
        return this.sisi;
    }

    // public double getLuasSegitiga() {
    // return 0.5 * this.alas * this.tinggi;
    // }

    // public double getKelilingSegitiga() {
    // return alas + tinggi + sisi;
    // }

    public void menggambarBangun() {
        System.out.println("BANGUN SEGITIGA");
    }

    public void karakteristikBangunan() {
        System.out.println("Karakteristik: Memiliki tiga sisi: alas, tinggi, dan sisi miring");
    }

    public double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * this.alas * this.tinggi;
    }

    public double hitungKelilingSegitiga(double alas, double tinggi, double sisi) {
        return this.alas + this.tinggi + this.sisi;
    }

    public void getSegitiga() {
        double kelilingSegitiga = hitungKelilingSegitiga(getAlas(), getTinggi(), getSisi());

        System.out.println("==================================");
        karakteristikBangunan();
        System.out.println("Luas segitiga: " + hitungLuasSegitiga(getAlas(), getTinggi()));
        System.out.println("Keliling segitiga: " + kelilingSegitiga);
    }
}
