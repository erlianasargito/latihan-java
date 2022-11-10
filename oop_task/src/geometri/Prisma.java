package geometri;

import geometri.services.BangunRuangService;

public class Prisma extends Segitiga implements BangunRuangService {
    private double tprisma;

    public Prisma() {}

    //constructor dari kelas segitiga
    public Prisma(double alas, double tinggi, double sisi, double tprisma) {
        super(alas, tinggi, sisi);
        this.tprisma = tprisma;
    }

    public void setTPrisma(double tprisma) {
        this.tprisma= tprisma;
    }

    public double getTPrisma() {
        return this.tprisma;
    }

    //abstract methods
    public void menggambarBangun(){
        System.out.println("BANGUN PRISMA");
    }

    public void karakteristikBangunan() {
        System.out.println("Karakteristik: Memiliki 5 sisi dengan alas dan atap berbentuk segitiga, sisi samping berbentuk persegi panjang");
    }

    public double hitungLuasPermukaanPrisma(double alas, double tinggi, double sisi, double tprisma){
        return (2 * super.hitungLuasSegitiga(getAlas(), getTinggi())) + 
        (super.hitungKelilingSegitiga(getAlas(), getTinggi(), getSisi()) * this.tprisma);
    }

    public double hitungVolumePrisma(double alas, double tinggi, double tprisma) {
        return super.hitungLuasSegitiga(getAlas(), getTinggi()) * this.tprisma;
    }

    public void getSegitiga() {
        double luasPermukaanPrisma = hitungLuasPermukaanPrisma(getAlas(), getTinggi(), getSisi(), getTPrisma());
        double volumePrisma = hitungVolumePrisma(getAlas(), getTinggi(), getTPrisma());

        System.out.println("==================================");
        karakteristikBangunan();
        System.out.println("Luas permukaan prisma: " + luasPermukaanPrisma);
        System.out.println("Volume prisma: " + volumePrisma);
    }
}
