package hitungbangun;

public class Prisma extends Segitiga {
    private double tprisma;

    public Prisma() {}

    public Prisma(double alas, double tinggi, double tprisma) {
        super(alas, tinggi);
        this.tprisma = tprisma;
    }

    public void setTPrisma(double tprisma) {
        this.tprisma= tprisma;
    }

    public double getTPrisma() {
        return this.tprisma;
    }

    public double getVolume() {
        return super.getLuasSegitiga() * this.tprisma;
    }

    public void getSegitiga() {
        System.out.println("Hasil luas dan keliling prisma");
        System.out.println("==================================");
        System.out.println("Volume prisma: " + getVolume());
    }
}
